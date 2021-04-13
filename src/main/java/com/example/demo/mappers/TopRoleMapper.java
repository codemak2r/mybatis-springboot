package com.example.demo.mappers;

import com.example.demo.model.TopRole;
import com.example.demo.model.TopRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopRoleMapper {
    long countByExample(TopRoleExample example);

    int deleteByExample(TopRoleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TopRole record);

    int insertSelective(TopRole record);

    List<TopRole> selectByExample(TopRoleExample example);

    TopRole selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TopRole record, @Param("example") TopRoleExample example);

    int updateByExample(@Param("record") TopRole record, @Param("example") TopRoleExample example);

    int updateByPrimaryKeySelective(TopRole record);

    int updateByPrimaryKey(TopRole record);
}