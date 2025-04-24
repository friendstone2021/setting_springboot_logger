/*
 * Project Name :
 * File Name : TestLogService.java
 * Author : energ
 * Created on 25. 3. 5.
 *
 *
 */
package com.example.setting_springboot_logger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * TestLogService
 */
@ExtendWith(OutputCaptureExtension.class)
@SpringBootTest
public class TestLogService {

    @Autowired
    private LogService logService;

    private static final Logger logger = LoggerFactory.getLogger(TestLogService.class);

    @Test
    void testLogOutput(CapturedOutput output) {
        logService.testLog();

        assertThat(output).contains("info");
        assertThat(output).contains("warn");
        assertThat(output).contains("error");
        assertThat(output).doesNotContain("debug");
        assertThat(output).doesNotContain("trace");

    }

}
