package top.faroz.service;

import top.faroz.pojo.Team;

import java.util.List;

public interface TeamService {

    /**
     * 查询所有 team 信息
     * @return
     */
    List<Team> selectAll();
}
