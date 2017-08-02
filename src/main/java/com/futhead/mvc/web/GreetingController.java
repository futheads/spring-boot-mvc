package com.futhead.mvc.web;

import com.futhead.mvc.model.vo.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

    private static final String template = "Hello %s!";

    @GetMapping("/")
    public String index(Model model) {
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
//        return String.format(template, "Futhead");
//        return "index";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", String.format(template, name));
        return "greeting";
    }

    @GetMapping("/hello")
    public String hello() throws Exception {
        return "hello";
    }

    @GetMapping("/exception")
    public String createException() throws Exception {
        throw new Exception("发生错误");
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

}
