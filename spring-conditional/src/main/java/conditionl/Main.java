package conditionl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xjy on 2017/7/14.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OsService service = context.getBean(OsService.class);

        service.show();
        System.out.println("os.name="+context.getEnvironment().getProperty("os.name"));
    }
}
