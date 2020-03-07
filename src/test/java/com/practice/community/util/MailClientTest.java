package com.practice.community.util;

import com.practice.community.CommunityApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * @Author: Victor
 * @Date: 2020/3/7 20:20
 */

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
public class MailClientTest {
    @Autowired
    MailClient mailClient;
    @Autowired
    TemplateEngine templateEngine;

    @Test
    public void testSendText() {
        mailClient.sendMail("@qq.com", "testText", "welcome");
    }

    @Test
    public void testSendHTML() {
        Context context = new Context();
        context.setVariable("username", "guy");
        String content = templateEngine.process("/mail/demo", context);
        mailClient.sendMail("163.com", "testHTML", content);
    }

}
