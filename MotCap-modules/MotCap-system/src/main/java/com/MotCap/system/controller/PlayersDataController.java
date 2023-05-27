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
import com.MotCap.system.domain.PlayersData;
import com.MotCap.system.service.IPlayersDataService;
import com.MotCap.common.core.web.controller.BaseController;
import com.MotCap.common.core.web.domain.AjaxResult;
import com.MotCap.common.core.utils.poi.ExcelUtil;
import com.MotCap.common.core.web.page.TableDataInfo;

/**
 * 球星信息Controller
 *
 * @author MotCap
 * @date 2023-05-28
 */
@RestController
@RequestMapping("/player")
public class PlayersDataController extends BaseController
{
    @Autowired
    private IPlayersDataService playersDataService;

    /**
     * 查询球星信息列表
     */
    @PreAuthorize(hasPermi = "system:player:list")
    @GetMapping("/list")
    public TableDataInfo list(PlayersData playersData)
    {
        startPage();
        List<PlayersData> list = playersDataService.selectPlayersDataList(playersData);
        return getDataTable(list);
    }

    /**
     * 导出球星信息列表
     */
    @PreAuthorize(hasPermi = "system:player:export")
    @Log(title = "球星信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PlayersData playersData) throws IOException
    {
        List<PlayersData> list = playersDataService.selectPlayersDataList(playersData);
        ExcelUtil<PlayersData> util = new ExcelUtil<PlayersData>(PlayersData.class);
        util.exportExcel(response, list, "player");
    }

    /**
     * 获取球星信息详细信息
     */
    @PreAuthorize(hasPermi = "system:player:query")
    @GetMapping(value = "/{playerId}")
    public AjaxResult getInfo(@PathVariable("playerId") Long playerId)
    {
        return AjaxResult.success(playersDataService.selectPlayersDataById(playerId));
    }

    /**
     * 新增球星信息
     */
    @PreAuthorize(hasPermi = "system:player:add")
    @Log(title = "球星信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PlayersData playersData)
    {
        return toAjax(playersDataService.insertPlayersData(playersData));
    }

    /**
     * 修改球星信息
     */
    @PreAuthorize(hasPermi = "system:player:edit")
    @Log(title = "球星信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PlayersData playersData)
    {
        return toAjax(playersDataService.updatePlayersData(playersData));
    }

    /**
     * 删除球星信息
     */
    @PreAuthorize(hasPermi = "system:player:remove")
    @Log(title = "球星信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{playerIds}")
    public AjaxResult remove(@PathVariable Long[] playerIds)
    {
        return toAjax(playersDataService.deletePlayersDataByIds(playerIds));
    }
}
