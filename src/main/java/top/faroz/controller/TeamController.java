package top.faroz.controller;

import com.github.pagehelper.util.StringUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.faroz.mapper.TeamMapper;
import top.faroz.pojo.Team;
import top.faroz.pojo.TeamExample;
import top.faroz.req.TeamQueryReq;
import top.faroz.resp.CommonResp;
import top.faroz.resp.PageResp;
import top.faroz.resp.TeamQueryResp;
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
    public CommonResp list(TeamQueryReq req) {

        CommonResp commonResp = new CommonResp();
        PageResp<TeamQueryResp> pageResp = teamService.list(req);
        commonResp.setContent(pageResp);


        return commonResp;
    }

}
