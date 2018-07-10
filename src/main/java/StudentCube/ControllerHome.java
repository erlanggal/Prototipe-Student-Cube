package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHome {

    @RequestMapping({"","/","home"})
    public String getPage(){
        return "home";
    }
}
