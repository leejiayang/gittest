package com.nowcoder.community;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class LoggerTests {

    // 实例化组件
    private static final Logger logger = LoggerFactory.getLogger(LoggerTests.class);
    @Test
    public void testLogger() {
        System.out.println(logger.getName());

        logger.debug("debug log");  // 开发启用，上线取消
        logger.info("info log");
        logger.warn("warn log");  // 常用
        logger.error("error log");
    }

}
