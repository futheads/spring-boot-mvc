package com.futhead.mvc.dao;

import com.futhead.mvc.model.po.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by futhead on 2017/7/30.
 */
@Component
public interface SysUserRepository extends JpaRepository<SysUser, Integer> {

    SysUser findByUsername(String username);

}
