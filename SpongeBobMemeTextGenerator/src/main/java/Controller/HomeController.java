package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getIndex()
    {
        return "index";
    }

    @GetMapping("/hello")
    public String getHelloTestPage()
    {
        return "index";
    }

}
