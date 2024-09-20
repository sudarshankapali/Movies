package org.f1soft.movies.services;

import org.bson.types.ObjectId;
import org.f1soft.movies.Movies;
import org.f1soft.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movies> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movies> findMovieById(String id){
        return movieRepository.findByImdbId(id);
    }
}
