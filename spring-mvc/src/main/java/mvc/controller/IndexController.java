package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xjy on 2017/7/15.
 */
@Controller
public class IndexController {

    @RequestMapping("/index")
    public String hello(){
        return "index";
    }
}
