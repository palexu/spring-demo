package conditionl;

import conditionl.service.OrderService;
import conditionl.service.OsService;
import conditionl.service.SecondOrderService;
import conditionl.util.SpringBeanUtil;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by xjy on 2017/7/14.
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        OsService service = context.getBean(OsService.class);
        service.show();
        System.out.println("os.name="+context.getEnvironment().getProperty("os.name"));

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.show();

        Map<String, OrderService> result =SpringBeanUtil.getApplicationContext().getBeansOfType(OrderService.class);
        SpringBeanUtil.getApplicationContext().getBeansWithAnnotation(Order.class);
        SpringBeanUtil.getApplicationContext().findAnnotationOnBean("firstOrderService",Service.class);
    }
}
