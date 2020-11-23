package com.tcs.mvcdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.mvcdemo.model.Registration;
@Repository
public interface RegistrationRepository extends JpaRepository<Registration, String> {

}