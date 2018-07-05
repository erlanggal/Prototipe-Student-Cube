package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDetailUmkm {

    @RequestMapping({"detail-umkm"})
    public String getPage(){
        return "detail-umkm";
    }
}
