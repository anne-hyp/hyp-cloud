package cn.hehe.cloud.server.system.controller;

import cn.hehe.cloud.common.entity.QueryRequest;
import cn.hehe.cloud.common.entity.Response;
import cn.hehe.cloud.common.entity.SystemUser;
import cn.hehe.cloud.common.exception.HypException;
import cn.hehe.cloud.common.utils.HypUtil;
import cn.hehe.cloud.server.system.service.IUserService;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.Map;

/**
 * @author hyp
 * @title: UserController
 * @projectName hyp-cloud
 * @description: 用户前端控制器
 * @date 2022/6/18 17:46
 */
@Slf4j
@Validated
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping
    @PreAuthorize("hasAnyAuthority('user:view')")
    public Response userList(QueryRequest queryRequest, SystemUser user) {
        Map<String, Object> dataTable = HypUtil.getDataTable(userService.findUserDetail(user, queryRequest));
        return new Response().data(dataTable);
    }

    @PostMapping
    @PreAuthorize("hasAnyAuthority('user:add')")
    public void addUser(@Valid SystemUser user) throws HypException {
        try {
            this.userService.createUser(user);
        } catch (Exception e) {
            String message = "新增用户失败";
            log.error(message, e);
            throw new HypException(message);
        }
    }

    @PutMapping
    @PreAuthorize("hasAnyAuthority('user:update')")
    public void updateUser(@Valid SystemUser user) throws HypException {
        try {
            this.userService.updateUser(user);
        } catch (Exception e) {
            String message = "修改用户失败";
            log.error(message, e);
            throw new HypException(message);
        }
    }

    @DeleteMapping("/{userIds}")
    @PreAuthorize("hasAnyAuthority('user:delete')")
    public void deleteUsers(@NotBlank(message = "{required}") @PathVariable String userIds) throws HypException {
        try {
            String[] ids = userIds.split(StringPool.COMMA);
            this.userService.deleteUsers(ids);
        } catch (Exception e) {
            String message = "删除用户失败";
            log.error(message, e);
            throw new HypException(message);
        }
    }
}
