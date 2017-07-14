package aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xjy on 2017/7/14.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
    }
}
