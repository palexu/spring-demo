package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 切面
 * Created by xjy on 2017/7/13.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(aop.Action)")//通过@Pointcut 注解声明切点
    public void annotationPointCut() {
    }

    @After("annotationPointCut()")//使用上面声明的切点
    public void after(JoinPoint joinPoint) {
        /**
         * 通过反射可以获取注解上的属性，然后做日志记录相关的操作
         */
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name());
    }

    @Before("execution(* aop.service.DemoMethodService.*(..))") //直接使用方法规则作为参数
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截," + method.getName());
    }
}

