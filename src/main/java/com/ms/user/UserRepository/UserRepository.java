 package com.ms.user.UserRepository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.user.Entity.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{

}
