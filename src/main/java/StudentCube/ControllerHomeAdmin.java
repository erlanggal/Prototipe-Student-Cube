package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHomeAdmin {

    @RequestMapping({"home-admin"})
    public String getPage()
    {
        return "home-admin";
    }
}
