package com.example.multiConfig.test.test2;

import com.example.multiConfig.SampleConfig;
import com.example.multiConfig.SampleService;
import com.example.multiConfig.test.SampleTestContext;
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
