package aop.service;

import aop.Action;
import org.springframework.stereotype.Service;

/**
 * 该类通过使用注解被拦截
 * Created by xjy on 2017/7/13.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "add")
    public void add(){}
}
