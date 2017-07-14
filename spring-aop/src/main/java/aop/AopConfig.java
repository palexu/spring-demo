package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by xjy on 2017/7/13.
 */
@Configuration
@ComponentScan("aop")
@EnableAspectJAutoProxy //开启Spring对AspectJ代理的支持
public class AopConfig {}
