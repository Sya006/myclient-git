package com.proj.myclientgit;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {


    @Value("${lanecount}")
    String lanecount ;
    @Value("${rate}")
    String rate;
    @Value("${tollstart}")
    String tollstart ;

     @RequestMapping("/rates")
    public String getRate(Model e){
        e.addAttribute("lanes" , lanecount);
        e.addAttribute("rateamount" , rate);
        e.addAttribute("tollstart" , tollstart);


        return "rateview" ;
    }

}
