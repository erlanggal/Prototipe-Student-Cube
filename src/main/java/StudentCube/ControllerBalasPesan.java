package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerBalasPesan {

    @RequestMapping({"balas-pesan"})
    public String getPage(){
        return "balas-pesan";
    }
}
