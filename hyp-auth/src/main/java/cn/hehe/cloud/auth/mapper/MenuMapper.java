package cn.hehe.cloud.auth.mapper;

import cn.hehe.cloud.common.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author hyp
 * @title: MenuMapper
 * @projectName hyp-cloud
 * @description: 菜单mapper
 * @date 2022/6/18 10:45
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> findUserPermissions(String username);
}
