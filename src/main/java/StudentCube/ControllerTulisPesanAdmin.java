package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTulisPesanAdmin {

    @RequestMapping("tulis-pesan-admin")
    public String getPage()
    {
        return "tulis-pesan-admin";
    }
}
