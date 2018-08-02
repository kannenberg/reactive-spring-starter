package com.java.example.reactspringstarter.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.java.example.reactspringstarter.model.Post;

@Repository
public interface PostRepository extends ReactiveMongoRepository<Post, String> {

}
