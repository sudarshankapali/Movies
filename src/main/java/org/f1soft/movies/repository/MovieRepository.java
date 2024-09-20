package org.f1soft.movies.repository;

import org.bson.types.ObjectId;
import org.f1soft.movies.Movies;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MovieRepository extends MongoRepository<Movies, ObjectId> {
    Optional<Movies> findByImdbId(String imdbId);
}
