package el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

/**
 * Created by xjy on 2017/7/13.
 */
@Configuration
@ComponentScan("el")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("I Love You!") //1
    private String normal;

    @Value("#{systemProperties['os.name']}") //2
    private String osName;

    @Value("#{ T(java.lang.Math).random() * 100.0 }") //3
    private double randomNumber;

    @Value("#{demoService.another}") //4
    private String fromAnother;

    @Value("classpath:test.txt") //5
    private Resource testFile;

    @Value("http://www.baidu.com") //6
    private Resource testUrl;

    @Value("${book.name}") //7
    private String bookName;

    @Autowired
    private Environment environment; //7

    @Bean //7
    public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource() {
        try {
            System.out.println(normal);
            System.out.println(osName);
            System.out.println(randomNumber);
            System.out.println(fromAnother);

            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
