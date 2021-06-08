package top.faroz.service.impl;

import org.springframework.stereotype.Service;
import top.faroz.mapper.TeamMapper;
import top.faroz.pojo.Team;
import top.faroz.service.TeamService;

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
}
