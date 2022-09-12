package com.ciandt.summit.bootcamp2022.domain.service;

import com.ciandt.summit.bootcamp2022.domain.data.entity.UserEntity;
import com.ciandt.summit.bootcamp2022.domain.port.interfaces.UserServicePort;
import com.ciandt.summit.bootcamp2022.domain.port.repository.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserServicePort {

    private final UserRepositoryPort userRepositoryPort;

    public Optional<UserEntity> verifyIfUserExists(String userId) {
        return userRepositoryPort.findById(userId);
    }

    public String verifyUserType(String userId) {
        return userRepositoryPort.findUserTypeById(userId);
    }

    public boolean AddingMusicIsAllowed(String userId) {
        Optional<UserEntity> userEntity = verifyIfUserExists(userId);

        String userType = verifyUserType(userEntity.get().getId());

        if (userType.equals("sa764b91-1235-2s9x-2k4e-2s5687x4lco2")) {
            return true;
        }

        return false;
    }

}
