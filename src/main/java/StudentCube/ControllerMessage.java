package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMessage {

    @RequestMapping({"message"})
    public String getPage()
    {
        return "message";
    }
}
