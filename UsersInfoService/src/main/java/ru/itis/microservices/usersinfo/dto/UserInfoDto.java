package ru.itis.microservices.usersinfo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Bulat Giniyatullin
 * 30 September 2018
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoDto {
    private String catUrl;
    private String flagUrl;
}
