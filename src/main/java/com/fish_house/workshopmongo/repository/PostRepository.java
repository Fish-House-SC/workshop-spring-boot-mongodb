package com.fish_house.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fish_house.workshopmongo.domain.Post;

@EnableMongoRepositories
public interface PostRepository extends MongoRepository<Post, String> {

	
}
