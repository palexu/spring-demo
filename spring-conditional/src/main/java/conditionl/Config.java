package conditionl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xjy on 2017/7/14.
 */
@Configuration

public class Config {

    @Bean
    @Conditional(MacOS.class)
    public OsService MacOSService(){
        return new MacOSService();
    }

    @Bean
    @Conditional(Windows.class)
    public OsService WindowsService(){
        return new WindowsService();
    }
}
