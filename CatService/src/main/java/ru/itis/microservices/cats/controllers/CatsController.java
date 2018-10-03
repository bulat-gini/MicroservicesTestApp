package ru.itis.microservices.cats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.microservices.cats.dto.CatDto;
import ru.itis.microservices.cats.services.interfaces.CatsService;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@RestController
public class CatsController {
    @Autowired
    private CatsService catsService;

    @GetMapping("cats/get")
    public CatDto getCat() {
        return catsService.getCat();
    }
}
