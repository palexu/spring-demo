package mvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xjy on 2017/7/15.
 */
@ControllerAdvice //组合了@component，因此可以自动注册为bean
@Slf4j
public class ExceptionHandlerAdvice {

    @ExceptionHandler(value = Exception.class)//通过value可以过滤需要处理的一场类型
    public ModelAndView exception(Exception exception,WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage",exception.getMessage());
        return modelAndView;
    }

    @ModelAttribute //所有注解了RequestMapping的都可以获得这个k-v
    public void addAttributes(Model model){
        model.addAttribute("msg","额外信息");
    }

    @InitBinder //定制webDataBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("id");
        log.info("field id is not allowed, remove id.");
    }
}
