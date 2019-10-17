package com.examle.repos;

import com.examle.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ASUS on 10/11/2019.
 */
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByActivationCode(String code);
}
