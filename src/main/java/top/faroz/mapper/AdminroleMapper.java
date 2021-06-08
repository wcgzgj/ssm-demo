package top.faroz.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.faroz.pojo.Adminrole;
import top.faroz.pojo.AdminroleExample;

public interface AdminroleMapper {
    long countByExample(AdminroleExample example);

    int deleteByExample(AdminroleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(Adminrole record);

    int insertSelective(Adminrole record);

    List<Adminrole> selectByExample(AdminroleExample example);

    Adminrole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") Adminrole record, @Param("example") AdminroleExample example);

    int updateByExample(@Param("record") Adminrole record, @Param("example") AdminroleExample example);

    int updateByPrimaryKeySelective(Adminrole record);

    int updateByPrimaryKey(Adminrole record);
}