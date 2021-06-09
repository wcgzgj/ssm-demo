package top.faroz.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import top.faroz.mapper.TeamMapper;
import top.faroz.pojo.Team;
import top.faroz.pojo.TeamExample;
import top.faroz.req.TeamQueryReq;
import top.faroz.resp.CommonResp;
import top.faroz.resp.PageResp;
import top.faroz.resp.TeamQueryResp;
import top.faroz.service.TeamService;
import top.faroz.util.CopyUtil;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TeamServiceImpl
 * @Description TODO
 * @Author FARO_Z
 * @Date 2021/6/8 下午6:41
 * @Version 1.0
 **/
@Service
public class TeamServiceImpl implements TeamService {

    @Resource
    private TeamMapper teamMapper;

    /**
     * 查询所有 team 信息
     *
     * @return
     */
    @Override
    public List<Team> selectAll() {
        List<Team> teams = teamMapper.selectByExample(null);
        return teams;
    }

    /**
     * 按条件，查询 team 信息
     *
     * @param req
     * @return
     */
    @Override
    public PageResp<TeamQueryResp> list(TeamQueryReq req) {

        TeamExample teamExample = new TeamExample();
        TeamExample.Criteria criteria = teamExample.createCriteria();
        if (StringUtil.isNotEmpty(req.getTeamName())) {
            criteria.andTeamnameLike("%"+req.getTeamName()+"%");
        }
        if (StringUtil.isNotEmpty(req.getChineseName())) {
            criteria.andChinesenameLike("%"+req.getChineseName()+"%");
        }
        if (StringUtil.isNotEmpty(req.getCoach())) {
            criteria.andCoachLike("%"+req.getCoach()+"%");
        }
        if (req.getBeginDate()!=null && req.getEndDate()!=null) {
            criteria.andCreatetimeBetween(req.getBeginDate(),req.getEndDate());
        }
        // 按赛区查询，如果是 -1 的话，说明没有选赛区
        if (req.getArea()>=0) {
            criteria.andAreaEqualTo(req.getArea());
        }

        Integer pageNum = req.getPageNum();
        Integer pageSize = req.getPageSize();

        PageHelper.startPage(pageNum,pageSize);
        List<Team> teams = teamMapper.selectByExample(teamExample);

        PageInfo<Team> pageInfo = new PageInfo<>(teams);
        List<TeamQueryResp> teamQueryResps = CopyUtil.copyList(teams, TeamQueryResp.class);


        PageResp<TeamQueryResp> teamPageResp = new PageResp<>();
        teamPageResp.setTotal((int) pageInfo.getTotal());
        teamPageResp.setPageNum(req.getPageNum());
        teamPageResp.setPageSize(req.getPageSize());
        teamPageResp.setList(teamQueryResps);

        return teamPageResp;
    }
}
