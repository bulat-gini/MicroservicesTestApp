package ru.itis.microservices.countries.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.itis.microservices.countries.dto.FlagDto;
import ru.itis.microservices.countries.services.interfaces.CountriesService;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@RestController
public class CountriesController {
    @Autowired
    private CountriesService countriesService;

    @GetMapping("countries/{title}")
    public FlagDto getCountryFlag(@PathVariable String title) {
        return countriesService.getCountryFlag(title);
    }
}
