package cn.hehe.cloud.server.system.config;

import cn.hehe.cloud.common.utils.DateUtil;
import com.p6spy.engine.spy.appender.MessageFormattingStrategy;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

/**
 * @author hyp
 * @title: P6spySqlFormatConfigure
 * @projectName hyp-cloud
 * @description: 自定义P6spy输出日志
 * @date 2022/6/18 16:54
 */
public class P6spySqlFormatConfigure implements MessageFormattingStrategy {

    @Override
    public String formatMessage(int connectionId, String now, long elapsed, String category, String prepared, String sql, String url) {
        return StringUtils.isNotBlank(sql) ? DateUtil.formatFullTime(LocalDateTime.now(), DateUtil.FULL_TIME_SPLIT_PATTERN)
                + " | 耗时 " + elapsed + " ms | SQL 语句：" + StringUtils.LF + sql.replaceAll("[\\s]+", StringUtils.SPACE) + ";" : StringUtils.EMPTY;
    }
}
