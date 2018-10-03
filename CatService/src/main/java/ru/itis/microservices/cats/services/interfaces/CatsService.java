package ru.itis.microservices.cats.services.interfaces;

import ru.itis.microservices.cats.dto.CatDto;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

public interface CatsService {
    CatDto getCat();
}
