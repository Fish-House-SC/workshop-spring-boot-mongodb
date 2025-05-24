package com.fish_house.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fish_house.workshopmongo.domain.User;

@EnableMongoRepositories
public interface UserRepository extends MongoRepository<User, String> {

	
}
