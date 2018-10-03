package ru.itis.microservices.cats.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.itis.microservices.cats.dto.CatDto;
import ru.itis.microservices.cats.services.interfaces.CatsService;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@Service
public class CatsServiceImpl implements CatsService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${cats.get.url}")
    private String catsUrl;

    @Override
    public CatDto getCat() {
        return restTemplate.getForEntity(catsUrl, CatDto[].class).getBody()[0];
    }
}
