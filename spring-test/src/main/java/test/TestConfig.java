package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by xjy on 2017/7/14.
 */
@Configuration
public class TestConfig {
    @Bean
    @Profile("dev")
    public TestBean dev(){
        return new TestBean("dev bean");
    }

    @Bean
    @Profile("prod")
    public TestBean prod(){
        return new TestBean("prod bean");
    }

}
