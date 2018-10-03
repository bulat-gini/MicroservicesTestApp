package ru.itis.microservices.countries.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import ru.itis.microservices.countries.dto.FlagDto;
import ru.itis.microservices.countries.services.interfaces.CountriesService;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@Service
public class CountriesServiceImpl implements CountriesService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${restcountries.api.url}")
    private String countriesApiUrl;

    @Value("${restcountries.api.fields}")
    private String countriesFields;

    @Override
    public FlagDto getCountryFlag(String title) {
        UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromHttpUrl(countriesApiUrl)
                .path(title)
                .queryParam("fields", countriesFields);
        return restTemplate.getForEntity(uriBuilder.toUriString(), FlagDto[].class).getBody()[0];
    }
}
