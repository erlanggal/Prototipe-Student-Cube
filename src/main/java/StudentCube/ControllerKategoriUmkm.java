package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerKategoriUmkm {

    @RequestMapping({"kategori-umkm"})
    public String getPage(){
        return "kategori-umkm";
    }
}
