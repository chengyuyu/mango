package com.example.mango3.service;

import com.example.mango3.domain.SysMenu;
import com.example.mango3.domain.SysRole;
import com.example.mango3.domain.SysRoleMenu;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SysRoleService extends CurdService<SysRole>{
    /**
     * 查询全部
     * @return
     */
    List<SysRole> findAll();

    /**
     * 查询角色菜单集合
     * @return
     */
    List<SysMenu> findRoleMenus(Long roleId);

    /**
     * 保存角色菜单
     * @param records
     * @return
     */
    int saveRoleMenus(List<SysRoleMenu> records);

    /**
     * 根据名称查询
     * @param name
     * @return
     */
    List<SysRole> findByName(String name);
}
