package com.hhh.mail;

import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * MailApplication
 *
 * @author HHH
 * @version 1.0.0
 * @date 2022/5/6 14:02
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MailApplication {
  public static void main(String[] args) {
    SpringApplication.run(MailApplication.class, args);
  }

  @Bean
  public Queue queue() {
    return new Queue("mail.welcome");
  }
}
