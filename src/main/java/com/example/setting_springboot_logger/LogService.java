/*
 * Project Name :
 * File Name : TestSimpleLogger.java
 * Author : energ
 * Created on 25. 3. 4.
 *
 *
 */
package com.example.setting_springboot_logger;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * TestSimpleLogger
 */
@Slf4j
@Service
public class LogService {

//    private static final Logger logger = LoggerFactory.getLogger(LogService.class);

//    public void debug(String message, Object... args) {
//        logger.debug(message, args);
//    }
//    public void info(String message, Object... args) {
//        logger.info(message, args);
//    }
//    public void warn(String message, Object... args) {
//        logger.warn(message, args);
//    }
//    public void error(String message, Object... args) {
//        logger.error(message, args);
//    }

    public void testLog(){

        /*
        LOG LEVEL

        TRACE : 가장 상세한 로그
        DEBUG : 디버깅 정보
        INFO  : 일반적인 실행 정보
        WARN  : 문제 가능성이 있는 경고
        ERROR : 심각한 오류

        로그레벨을 WARN으로 설정하는 경우 INFO 이하 로그들은 출력되지 않음
        */

        log.debug("test debug log : {}","debug");
        log.info("test info log : {}","info");
        log.warn("test warn log : {}","warn");
        log.error("test error log : {}","error");
    }

//    public static void main(String[] args) {
//
//        TestLogService testSimpleLogger = new TestLogService();
//        testSimpleLogger.info("info logger {}", "args");
//        testSimpleLogger.warn("warn logger {}", "args");
//        testSimpleLogger.error("error logger {}", "args");
//        testSimpleLogger.debug("debug logger {}", "args");
//
//    }

}
