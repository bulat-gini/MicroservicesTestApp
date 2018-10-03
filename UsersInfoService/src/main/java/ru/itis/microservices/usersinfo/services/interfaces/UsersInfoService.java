package ru.itis.microservices.usersinfo.services.interfaces;

import ru.itis.microservices.usersinfo.dto.UserInfoDto;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

public interface UsersInfoService {
    UserInfoDto getUserInfo(String country);
}
