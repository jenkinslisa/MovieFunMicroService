package org.superbiz.moviefun.moviesapi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.superbiz.moviefun.moviesapi.MoviesClient;

import java.util.Map;

/**
 * Created by lisajenkins on 5/9/17.
 */
@Controller
@RequestMapping("/movies")
public class MoviesController {

    private final MoviesClient moviesClient;

    public MoviesController(MoviesClient moviesClient) {
        this.moviesClient = moviesClient;
    }

    @GetMapping
    public String index(Map<String, Object> model) {
        model.put("movies", moviesClient.getMovies());
        return "movies";
    }
}