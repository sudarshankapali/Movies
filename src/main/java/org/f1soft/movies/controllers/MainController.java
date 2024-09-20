package org.f1soft.movies.controllers;

import org.f1soft.movies.Movies;
import org.f1soft.movies.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MainController {
    @Autowired
    private MovieService movieService;
    @GetMapping()
    public ResponseEntity<List<Movies>> getAllMovies(){
        return new ResponseEntity<List<Movies>>(movieService.allMovies(), HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movies>> getMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movies>>(movieService.findMovieById(imdbId),HttpStatus.OK);
    }
}
