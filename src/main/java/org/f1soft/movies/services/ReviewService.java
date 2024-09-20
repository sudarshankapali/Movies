package org.f1soft.movies.services;

import org.f1soft.movies.Movies;
import org.f1soft.movies.Reviews;
import org.f1soft.movies.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;
@Autowired
    private MongoTemplate mongoTemplate;
    public Reviews createReview(String body,String imdbId) {
        Reviews review = new Reviews();
        review.setBody(body);
        reviewRepository.insert(review);
        mongoTemplate.update(Movies.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();
        return review;
    }
}
