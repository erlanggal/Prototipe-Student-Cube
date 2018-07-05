package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTulisPesan {

    @RequestMapping({"tulis-pesan"})
    public String getPage(){
        return "tulis-pesan";
    }
}
