package org.f1soft.movies.repository;

import org.bson.types.ObjectId;
import org.f1soft.movies.Reviews;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Reviews, ObjectId> {
}
