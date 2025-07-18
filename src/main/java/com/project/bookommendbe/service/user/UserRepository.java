package com.project.bookommendbe.service.user;

import com.project.bookommendbe.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface UserRepository extends JpaRepository<User, Long> {

    //Optional<User> findUserById(Long id);

    Optional<User> findUserByEmailAndPassword( String email, String password);

    Optional<User> findUserBySignUpIdAndPhoneNumber( String signUpId, String phoneNumber);

    Optional<User> findUserByEmailAndPhoneNumber( String email, String phoneNumber);

    Optional<User> findUserByEmailAndPhoneNumberAndPasswordAuthNumber(String email, String phoneNumber, int authNumber);

    Optional<User> findUserByEmailOrPhoneNumber(String email, String phoneNumber);

}
