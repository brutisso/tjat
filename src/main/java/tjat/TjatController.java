package tjat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
public class TjatController {
	
	private List messages = new ArrayList(); 

    @RequestMapping("/")
    public String index() {
        return "Tjat, tjat, tjat...";
    }

    @RequestMapping("/tjat")
    public String greeting(
    		@RequestParam(value="name", required=false, defaultValue="???") String name,
    		@RequestParam(value="message", required=false, defaultValue="Nothing") String message,
    		Model model) {
    	messages.add(message);
        model.addAttribute("name", name);
        model.addAttribute("message", message);
        model.addAttribute("messages", messages);
        System.out.println("msg: " + message);
        return "tjat";
    }


}