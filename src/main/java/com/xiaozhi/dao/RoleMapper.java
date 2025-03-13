package com.xiaozhi.dao;

import java.util.List;

import com.xiaozhi.entity.SysRole;

/**
 * 角色管理 数据层
 * 
 * @author Joey
 * 
 */
public interface RoleMapper {
  List<SysRole> query(SysRole role);

  int update(SysRole role);

  int add(SysRole role);

}