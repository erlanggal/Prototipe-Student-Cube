package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPesanAdmin {

    @RequestMapping("pesan-admin")
    public String getPage()
    {
        return "pesan-admin";
    }
}
