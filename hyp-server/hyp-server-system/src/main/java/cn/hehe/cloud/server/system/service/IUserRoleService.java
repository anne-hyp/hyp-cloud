package cn.hehe.cloud.server.system.service;

import cn.hehe.cloud.common.entity.UserRole;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author hyp
 * @title: IUserRoleService
 * @projectName hyp-cloud
 * @description: 用户角色服务
 * @date 2022/6/18 17:45
 */
public interface IUserRoleService extends IService<UserRole> {

    void deleteUserRolesByRoleId(String[] roleIds);

    void deleteUserRolesByUserId(String[] userIds);
}
