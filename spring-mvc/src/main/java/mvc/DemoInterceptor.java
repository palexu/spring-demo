package mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xjy on 2017/7/15.
 */
@Slf4j
public class DemoInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception{
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime",startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                              HttpServletResponse response,
                              Object handler,
                              ModelAndView modelAndView) throws Exception{
        long startTime = (Long)request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime= System.currentTimeMillis();
        log.info("time is {} ms",endTime-startTime);
        request.setAttribute("handlingTime",endTime-startTime);

    }
}
