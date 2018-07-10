package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerKotakMasukAdmin {

    @RequestMapping("kotak-masuk-admin")
    public String getPage()
    {
        return "kotak-masuk-admin";
    }
}
