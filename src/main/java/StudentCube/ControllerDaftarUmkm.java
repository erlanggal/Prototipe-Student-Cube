package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerDaftarUmkm {

    @RequestMapping({"daftar-umkm"})
    public String getPage(){
        return "daftar-umkm";
    }
}
