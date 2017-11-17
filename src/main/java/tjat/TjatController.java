package tjat;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TjatController {

    @RequestMapping("/")
    public String index() {
        return "Tjat, tjat, tjat...";
    }

}