package com.example.asr.example.config;

import com.hazelcast.config.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    public Config hazelConfig(){

        Config config = new Config();
        config.setInstanceName("hazel-test");
        config.getGroupConfig().setName("dev").setPassword("pass");
        return config;
    }
}
