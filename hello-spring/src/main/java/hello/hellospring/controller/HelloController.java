package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

// Controller 사용 시 @Controller라고 Annotation을 추가해야 함
@Controller
public class HelloController {

    // 웹 애플리케이션에서 /hello 라고 들어오면 아래 method를 호출
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data", "hello!");
        return "hello";
    }
}
