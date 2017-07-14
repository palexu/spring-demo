package aop;

import aop.service.DemoAnnotationService;
import aop.service.DemoMethodService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xjy on 2017/7/13.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService annotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService methodService = context.getBean(DemoMethodService.class);

        annotationService.add();
        methodService.add();

        context.close();
    }
}
