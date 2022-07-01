package cn.hehe.cloud.auth.mapper;

import cn.hehe.cloud.common.entity.SystemUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author hyp
 * @title: UserMapper
 * @projectName hyp-cloud
 * @description: 用户mapper
 * @date 2022/6/18 10:45
 */
public interface UserMapper extends BaseMapper<SystemUser> {
    SystemUser findByName(String username);
}
