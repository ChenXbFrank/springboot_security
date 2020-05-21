package com.cxb.security.dao;

import com.cxb.security.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PermissionDao extends JpaRepository<Permission,Integer> {

}
