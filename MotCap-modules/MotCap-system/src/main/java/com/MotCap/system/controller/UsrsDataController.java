package com.MotCap.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.MotCap.common.log.annotation.Log;
import com.MotCap.common.log.enums.BusinessType;
import com.MotCap.common.security.annotation.PreAuthorize;
import com.MotCap.system.domain.UsrsData;
import com.MotCap.system.service.IUsrsDataService;
import com.MotCap.common.core.web.controller.BaseController;
import com.MotCap.common.core.web.domain.AjaxResult;
import com.MotCap.common.core.utils.poi.ExcelUtil;
import com.MotCap.common.core.web.page.TableDataInfo;

/**
 * 客户数据Controller
 *
 * @author MotCap
 * @date 2023-04-23
 */
@RestController
@RequestMapping("/data")
public class UsrsDataController extends BaseController
{
    @Autowired
    private IUsrsDataService usrsDataService;

    /**
     * 查询客户数据列表
     */
    @PreAuthorize(hasPermi = "system:data:list")
    @GetMapping("/list")
    public TableDataInfo list(UsrsData usrsData)
    {
        startPage();
        List<UsrsData> list = usrsDataService.selectUsrsDataList(usrsData);
        return getDataTable(list);
    }

    /**
     * 导出客户数据列表
     */
    @PreAuthorize(hasPermi = "system:data:export")
    @Log(title = "客户数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UsrsData usrsData) throws IOException
    {
        List<UsrsData> list = usrsDataService.selectUsrsDataList(usrsData);
        ExcelUtil<UsrsData> util = new ExcelUtil<UsrsData>(UsrsData.class);
        util.exportExcel(response, list, "data");
    }

    /**
     * 获取客户数据详细信息
     */
    @PreAuthorize(hasPermi = "system:data:query")
    @GetMapping(value = "/{dataId}")
    public AjaxResult getInfo(@PathVariable("dataId") Long dataId)
    {
        return AjaxResult.success(usrsDataService.selectUsrsDataById(dataId));
    }

    /**
     * 新增客户数据
     */
    @PreAuthorize(hasPermi = "system:data:add")
    @Log(title = "客户数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UsrsData usrsData)
    {
        return toAjax(usrsDataService.insertUsrsData(usrsData));
    }

    /**
     * 修改客户数据
     */
    @PreAuthorize(hasPermi = "system:data:edit")
    @Log(title = "客户数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UsrsData usrsData)
    {
        return toAjax(usrsDataService.updateUsrsData(usrsData));
    }

    /**
     * 删除客户数据
     */
    @PreAuthorize(hasPermi = "system:data:remove")
    @Log(title = "客户数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{dataIds}")
    public AjaxResult remove(@PathVariable Long[] dataIds)
    {
        return toAjax(usrsDataService.deleteUsrsDataByIds(dataIds));
    }
}
