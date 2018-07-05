package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerKotakMasuk {

    @RequestMapping({"kotak-masuk"})
    public String getPage(){
        return "kotak-masuk";
    }
}
