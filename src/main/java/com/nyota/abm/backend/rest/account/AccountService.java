package com.nyota.abm.backend.rest.account;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class AccountService {


    @GetMapping("/cardcheck")
    public boolean getCardService () {
        return true;
    }

    @RequestMapping(value = "/cardcheck", method = RequestMethod.POST)
    public void getCardDetails(@RequestBody Map<String, String> body) {
        System.out.println ("Post method called on the cardDetails");
    }


}



