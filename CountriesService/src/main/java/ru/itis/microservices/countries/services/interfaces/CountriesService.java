package ru.itis.microservices.countries.services.interfaces;

import ru.itis.microservices.countries.dto.FlagDto;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

public interface CountriesService {
    FlagDto getCountryFlag(String title);
}
