package cn.hehe.cloud.auth.manager;

import cn.hehe.cloud.auth.mapper.MenuMapper;
import cn.hehe.cloud.auth.mapper.UserMapper;
import cn.hehe.cloud.common.entity.Menu;
import cn.hehe.cloud.common.entity.SystemUser;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hyp
 * @title: UserManager
 * @projectName hyp-cloud
 * @description: 用户管理
 * @date 2022/6/18 10:53
 */
@Service
public class UserManager {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private MenuMapper menuMapper;

    public SystemUser findByName(String username) {
        return userMapper.findByName(username);
    }

    public String findUserPermissions(String username) {
        List<Menu> userPermissions = menuMapper.findUserPermissions(username);
        return userPermissions.stream().map(Menu::getPerms).collect(Collectors.joining(","));
    }
}
