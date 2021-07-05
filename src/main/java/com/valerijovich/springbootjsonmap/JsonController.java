package com.valerijovich.springbootjsonmap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController is a convenience annotation for creating Restful controllers.
 * The JsonController will return our User class.
 */
@RestController
public class JsonController {

    /**
     * @GetMapping annotation is used to map web requests to Spring Controller methods.
     */
    @GetMapping
    public User getUser() {
        var user = new User();
        user.getParams().put("User name", "Neil");
        user.getParams().put("User surname", "deGrasse Tyson");
        user.getParams().put("User age", 62);
        return user;
    }
}
