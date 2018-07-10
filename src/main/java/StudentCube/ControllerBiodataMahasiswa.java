package StudentCube;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerBiodataMahasiswa {

    @RequestMapping("biodata-mahasiswa")
    public String getPage()
    {
        return "biodata-mahasiswa";
    }
}
