package com.nationalParkApp.demo.Repository;

import com.nationalParkApp.demo.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {


}
