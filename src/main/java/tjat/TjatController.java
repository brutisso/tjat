package tjat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class TjatController {

    @RequestMapping("/")
    public String index() {
        return "Tjat, tjat, tjat...";
    }

    @RequestMapping("/tjat")
    public String greeting(
    		@RequestParam(value="name", required=false, defaultValue="???") String name,
    		@RequestParam(value="message", required=false, defaultValue="Nothing") String message,
    		Model model) {
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        System.out.println("msg: " + message);
        return "tjat";
    }


}