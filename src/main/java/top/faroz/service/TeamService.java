package top.faroz.service;

import top.faroz.pojo.Team;
import top.faroz.req.TeamQueryReq;
import top.faroz.resp.PageResp;
import top.faroz.resp.TeamQueryResp;

import java.util.List;

public interface TeamService {

    /**
     * 查询所有 team 信息
     * @return
     */
    List<Team> selectAll();

    /**
     * 按条件，查询 team 信息
     * @param req
     * @return
     */
    PageResp<TeamQueryResp> list(TeamQueryReq req);
}
