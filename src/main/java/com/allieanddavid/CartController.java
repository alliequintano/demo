package com.allieanddavid;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by alexandraquintano on 2/27/17.
 */
@RestController("/cart")
public class CartController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addToCart(@RequestParam(value = "id") String id) {
        return id;
    }

}
