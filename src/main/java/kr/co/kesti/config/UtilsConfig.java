package kr.co.kesti.config;

import kr.co.kesti.utils.MessageUtils;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
public class UtilsConfig {
    @Resource(name = "messageSource")
    private MessageSource messageSource;

    @Bean
    public MessageUtils messageUtil() {
        MessageUtils messageUtil = new MessageUtils();
        messageUtil.setMessageSource(this.messageSource);
        return messageUtil;
    }
}