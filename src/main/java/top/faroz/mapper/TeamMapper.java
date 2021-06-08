package top.faroz.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.faroz.pojo.Team;
import top.faroz.pojo.TeamExample;

public interface TeamMapper {
    long countByExample(TeamExample example);

    int deleteByExample(TeamExample example);

    int deleteByPrimaryKey(Integer teamId);

    int insert(Team record);

    int insertSelective(Team record);

    List<Team> selectByExample(TeamExample example);

    Team selectByPrimaryKey(Integer teamId);

    int updateByExampleSelective(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByExample(@Param("record") Team record, @Param("example") TeamExample example);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}