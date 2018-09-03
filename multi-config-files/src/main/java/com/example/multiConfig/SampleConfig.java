fjhtjtjmpackage com.example.multiConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SampleConfig {
    @Bean
    public SampleService sampleService() {
        return new SampleServiceImpl();
    }
}
