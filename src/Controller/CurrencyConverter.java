package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverter {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @PostMapping ("/converter")
    public String converter(@RequestParam String usd, @RequestParam String rate, Model model){
        Double usdconvert = Double.parseDouble(usd);
        Double rateconvert = Double.parseDouble(rate);

        Double vnd = usdconvert*rateconvert;

        model.addAttribute("vnd",vnd);

        return "index";
    }
}
