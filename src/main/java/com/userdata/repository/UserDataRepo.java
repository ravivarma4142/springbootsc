package com.userdata.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.userdata.data.UserData;

public interface UserDataRepo extends MongoRepository<UserData, String>{


}
