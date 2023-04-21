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
import com.UbiLoc.system.domain.PlayersData;
import com.UbiLoc.system.service.IPlayersDataService;
import com.UbiLoc.common.core.web.controller.BaseController;
import com.UbiLoc.common.core.web.domain.AjaxResult;
import com.UbiLoc.common.core.utils.poi.ExcelUtil;
import com.UbiLoc.common.core.web.page.TableDataInfo;

/**
 * 球星数据Controller
 *
 * @author UbiLoc
 * @date 2023-04-21
 */
@RestController
@RequestMapping("/datas")
public class PlayersDataController extends BaseController
{
    @Autowired
    private IPlayersDataService playersDataService;

    /**
     * 查询球星数据列表
     */
    @PreAuthorize(hasPermi = "system:datas:list")
    @GetMapping("/list")
    public TableDataInfo list(PlayersData playersData)
    {
        startPage();
        List<PlayersData> list = playersDataService.selectPlayersDataList(playersData);
        return getDataTable(list);
    }

    /**
     * 导出球星数据列表
     */
    @PreAuthorize(hasPermi = "system:datas:export")
    @Log(title = "球星数据", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PlayersData playersData) throws IOException
    {
        List<PlayersData> list = playersDataService.selectPlayersDataList(playersData);
        ExcelUtil<PlayersData> util = new ExcelUtil<PlayersData>(PlayersData.class);
        util.exportExcel(response, list, "datas");
    }

    /**
     * 获取球星数据详细信息
     */
    @PreAuthorize(hasPermi = "system:datas:query")
    @GetMapping(value = "/{playerId}")
    public AjaxResult getInfo(@PathVariable("playerId") Long playerId)
    {
        return AjaxResult.success(playersDataService.selectPlayersDataById(playerId));
    }

    /**
     * 新增球星数据
     */
    @PreAuthorize(hasPermi = "system:datas:add")
    @Log(title = "球星数据", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PlayersData playersData)
    {
        return toAjax(playersDataService.insertPlayersData(playersData));
    }

    /**
     * 修改球星数据
     */
    @PreAuthorize(hasPermi = "system:datas:edit")
    @Log(title = "球星数据", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PlayersData playersData)
    {
        return toAjax(playersDataService.updatePlayersData(playersData));
    }

    /**
     * 删除球星数据
     */
    @PreAuthorize(hasPermi = "system:datas:remove")
    @Log(title = "球星数据", businessType = BusinessType.DELETE)
	@DeleteMapping("/{playerIds}")
    public AjaxResult remove(@PathVariable Long[] playerIds)
    {
        return toAjax(playersDataService.deletePlayersDataByIds(playerIds));
    }
}
