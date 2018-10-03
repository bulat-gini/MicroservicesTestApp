package ru.itis.microservices.usersinfo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.itis.microservices.usersinfo.dto.CatDto;
import ru.itis.microservices.usersinfo.dto.FlagDto;
import ru.itis.microservices.usersinfo.dto.UserInfoDto;
import ru.itis.microservices.usersinfo.services.interfaces.UsersInfoService;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@Service
public class UsersInfoServiceImpl implements UsersInfoService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${services.cats.get.url}")
    private String catsUrl;

    @Value("${services.countries.flag.get.url}")
    private String flagsUrl;

    @Override
    public UserInfoDto getUserInfo(String country) {
        CatDto cat = restTemplate.getForEntity(catsUrl, CatDto.class).getBody();
        FlagDto flag = restTemplate.getForEntity(flagsUrl + country, FlagDto.class).getBody();

        return UserInfoDto.builder()
                .catUrl(cat.getUrl())
                .flagUrl(flag.getFlag())
                .build();
    }
}
