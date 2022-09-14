package com.ciandt.summit.bootcamp2022.domain.port.interfaces;

import com.ciandt.summit.bootcamp2022.domain.data.entity.UserEntity;
import com.ciandt.summit.bootcamp2022.domain.service.exception.UserBadRequestException;

import java.util.Optional;

public interface UserServicePort {

    Optional<UserEntity> verifyIfUserExists(String userId) throws UserBadRequestException;

    String verifyUserType (String userId);

    boolean userIsPremium(String userId) throws UserBadRequestException;

    String updateUserType(String userId, String userTypeId);
}
