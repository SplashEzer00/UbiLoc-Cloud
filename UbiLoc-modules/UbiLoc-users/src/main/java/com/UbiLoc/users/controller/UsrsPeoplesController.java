package com.UbiLoc.system.controller;

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
import com.UbiLoc.common.log.annotation.Log;
import com.UbiLoc.common.log.enums.BusinessType;
import com.UbiLoc.common.security.annotation.PreAuthorize;
import com.UbiLoc.system.domain.UsrsPeoples;
import com.UbiLoc.system.service.IUsrsPeoplesService;
import com.UbiLoc.common.core.web.controller.BaseController;
import com.UbiLoc.common.core.web.domain.AjaxResult;
import com.UbiLoc.common.core.utils.poi.ExcelUtil;
import com.UbiLoc.common.core.web.page.TableDataInfo;

/**
 * 客户信息Controller
 *
 * @author UbiLoc
 * @date 2023-04-10
 */
@RestController
@RequestMapping("/peoples")
public class UsrsPeoplesController extends BaseController
{
    @Autowired
    private IUsrsPeoplesService usrsPeoplesService;

    /**
     * 查询客户信息列表
     */
    @PreAuthorize(hasPermi = "system:peoples:list")
    @GetMapping("/list")
    public TableDataInfo list(UsrsPeoples usrsPeoples)
    {
        startPage();
        List<UsrsPeoples> list = usrsPeoplesService.selectUsrsPeoplesList(usrsPeoples);
        return getDataTable(list);
    }

    /**
     * 导出客户信息列表
     */
    @PreAuthorize(hasPermi = "system:peoples:export")
    @Log(title = "客户信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, UsrsPeoples usrsPeoples) throws IOException
    {
        List<UsrsPeoples> list = usrsPeoplesService.selectUsrsPeoplesList(usrsPeoples);
        ExcelUtil<UsrsPeoples> util = new ExcelUtil<UsrsPeoples>(UsrsPeoples.class);
        util.exportExcel(response, list, "peoples");
    }

    /**
     * 获取客户信息详细信息
     */
    @PreAuthorize(hasPermi = "system:peoples:query")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return AjaxResult.success(usrsPeoplesService.selectUsrsPeoplesById(userId));
    }

    /**
     * 新增客户信息
     */
    @PreAuthorize(hasPermi = "system:peoples:add")
    @Log(title = "客户信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody UsrsPeoples usrsPeoples)
    {
        return toAjax(usrsPeoplesService.insertUsrsPeoples(usrsPeoples));
    }

    /**
     * 修改客户信息
     */
    @PreAuthorize(hasPermi = "system:peoples:edit")
    @Log(title = "客户信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody UsrsPeoples usrsPeoples)
    {
        return toAjax(usrsPeoplesService.updateUsrsPeoples(usrsPeoples));
    }

    /**
     * 删除客户信息
     */
    @PreAuthorize(hasPermi = "system:peoples:remove")
    @Log(title = "客户信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(usrsPeoplesService.deleteUsrsPeoplesByIds(userIds));
    }
}
