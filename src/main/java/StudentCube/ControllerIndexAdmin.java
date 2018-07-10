package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerIndexAdmin {

    @RequestMapping("index-admin")
    public String getPage()
    {
        return "index-admin";
    }
}
