package com.futhead.mvc.dao;

import com.futhead.mvc.model.po.SysRole;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by futhead on 2017-7-28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

    @Autowired
    private SysRoleMapper roleMapper;

    @Test
    public void testFindRoleNameById() throws Exception {
        List<SysRole> roles = roleMapper.findRolesByUserId(1);
        for (SysRole role : roles) {
            System.out.println(role.getName());
        }
    }

}
