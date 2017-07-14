package aop;

import java.lang.annotation.*;

/**
 * Created by xjy on 2017/7/13.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}

/**
 * 注解本身是没有功能的，就和xml一样。
 * 注解和xml都是一种元数据，元数据即解释数据的数据，这就是所谓配置。
 */
