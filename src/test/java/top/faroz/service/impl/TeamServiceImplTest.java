package top.faroz.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.faroz.req.PageReq;
import top.faroz.req.TeamQueryReq;
import top.faroz.resp.PageResp;
import top.faroz.resp.TeamQueryResp;
import top.faroz.service.TeamService;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TeamServiceImplTest {

    @Resource
    private TeamService teamService;

    @Test
    public void selectAll() {
        TeamQueryReq req = new TeamQueryReq();
        req.setPageNum(1);
        req.setPageSize(5);
        PageResp<TeamQueryResp> list = teamService.list(req);
        System.out.println(list);

    }
}