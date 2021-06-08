package top.faroz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.faroz.pojo.Team;
import top.faroz.resp.CommonResp;
import top.faroz.service.TeamService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TeamController
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/8 下午7:29
 * @Version 1.0
 **/
@RestController
@RequestMapping("/team")
public class TeamController {

    @Resource
    private TeamService teamService;

    @RequestMapping("/list")
    public CommonResp list() {
        List<Team> teams = teamService.selectAll();
        CommonResp commonResp = new CommonResp();
        commonResp.setContent(teams);
        return commonResp;
    }

}
