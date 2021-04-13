/*
 * @Description:
 * @Date: 2021/4/13
 */
package com.example.demo;

import com.example.demo.mappers.TopRoleMapper;
import com.example.demo.model.TopRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTest {
    @Resource
    TopRoleMapper topRoleMapper;
    @Test
    public void testAdd(){
        TopRole role = new TopRole();
        role.setId(1L);
        role.setName("admin");
        role.setType("admin_type");
        role.setDescription("test");
        role.setCreateTime(new Date());
        role.setUpdateTime(new Date());
        int result = topRoleMapper.insert(role);
    }
    @Test
    public void testSelect(){
        TopRole topRole = topRoleMapper.selectByPrimaryKey(1L);
        System.out.println(topRole.getName());
    }
    @Test
    public void testUpdate(){

        TopRole role = new TopRole();
        role.setId(1L);
        role.setName("admin3");
        int result = topRoleMapper.updateByPrimaryKeySelective(role);

    }
    @Test
    public void testDelete(){
        topRoleMapper.deleteByPrimaryKey(1L);
    }
}
