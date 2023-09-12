package bitcamp.myapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@ResponseBody
// 2줄의 줄임말-> @RestController
public class HomeController {
  {
    System.out.println("HomeController 생성됨!");
  }

  @GetMapping("/")
  public String home() throws Exception {
    return "index";
  }
}
