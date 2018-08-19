package com.example.multiConfig.test.test1;

import com.example.multiConfig.SampleConfig;
import com.example.multiConfig.SampleService;
import com.example.multiConfig.test.SampleTestContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;


@Import({SampleConfig.class})
@PropertySource("classpath:test.properties")
public class SampleTestConfig {
    @Bean
    public SampleTestContext sampleTestContext(SampleService sampleService) {
        return new SampleTestContext(sampleService);
    }
}
