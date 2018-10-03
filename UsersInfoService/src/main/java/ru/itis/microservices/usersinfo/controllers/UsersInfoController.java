package ru.itis.microservices.usersinfo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.microservices.usersinfo.dto.UserInfoDto;
import ru.itis.microservices.usersinfo.services.interfaces.UsersInfoService;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@RestController
public class UsersInfoController {
    @Autowired
    private UsersInfoService usersInfoService;

    @GetMapping("users/info")
    public UserInfoDto getUserInfo(@RequestParam String name,
                                   @RequestParam String country) {
        return usersInfoService.getUserInfo(country);
    }
}
