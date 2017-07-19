package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xjy on 2017/7/15.
 */
@Controller
public class AdviceController {
    @RequestMapping("/advice")
    public String getSomething(@ModelAttribute("msg") String msg){
        throw new IllegalArgumentException("非常抱歉，参数有错误:"+msg);
    }

}
