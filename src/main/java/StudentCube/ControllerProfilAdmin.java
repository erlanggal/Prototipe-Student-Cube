package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerProfilAdmin {

    @RequestMapping("profil-admin")
    public String getPage()
    {
        return "profil-admin";
    }
}
