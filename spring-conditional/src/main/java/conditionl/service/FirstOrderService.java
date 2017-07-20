package conditionl.service;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * Created by xujunyu on 2017/7/20.
 */
@Order(value = 1)
@Service
public class FirstOrderService implements OrderService {
    public void show() {
        System.out.println("first");
    }
}
