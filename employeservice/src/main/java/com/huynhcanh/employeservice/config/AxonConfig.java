package com.huynhcanh.employeservice.config;

import com.thoughtworks.xstream.XStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {

    @Bean
    public XStream xStream() { // lang nghe chac service khac
        XStream xStream = new XStream();
        xStream.allowTypesByWildcard(new String[] {
                "com.huynhcanh.**"
        });
        return xStream;
    }
}
