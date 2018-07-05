package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerCardBoard {

    @RequestMapping({"card-board"})
    public String getPage(){
        return "card-board";
    }
}
