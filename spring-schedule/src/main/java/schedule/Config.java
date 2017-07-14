package schedule;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by xjy on 2017/7/14.
 */
@Configuration
@ComponentScan("schedule")
@EnableScheduling
public class Config {
}
