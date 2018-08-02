package com.java.example.reactspringstarter.service;

import com.java.example.reactspringstarter.model.Post;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PostService {

    Mono<Post> save(Post post);

    Mono<Post> update(Post post);

    Mono<Post> findOne(String id);

    Mono<Boolean> delete(String id);

    Flux<Post> findAll();

}