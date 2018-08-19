package com.example.multiConfig.steps.test2;

import com.example.multiConfig.SampleConfig;
import com.example.multiConfig.SampleService;
import com.example.multiConfig.steps.SampleTestContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Import({SampleConfig.class})
@PropertySource("classpath:test2.properties")
public class Sample2TestConfig {
    @Bean
    public SampleTestContext sample2TestContext(SampleService sampleService) {
        return new SampleTestContext(sampleService);
    }
}
