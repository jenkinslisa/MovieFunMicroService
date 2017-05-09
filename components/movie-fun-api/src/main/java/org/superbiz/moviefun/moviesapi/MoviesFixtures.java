package org.superbiz.moviefun.moviesapi;

import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by lisajenkins on 5/9/17.
 */
@Component
public class MoviesFixtures {



    public List<MoviesInfo> load() {
        return asList(
                new MoviesInfo(null,"Wedding Crashers", "David Dobkin", "Comedy", 7, 2005),
                new MoviesInfo(null,"Starsky & Hutch", "Todd Phillips", "Action", 6, 2004),
                new MoviesInfo(null,"Shanghai Knights", "David Dobkin", "Action", 6, 2003),
                new MoviesInfo(null,"I-Spy", "Betty Thomas", "Adventure", 5, 2002),
                new MoviesInfo(null,"The Royal Tenenbaums", "Wes Anderson", "Comedy", 8, 2001),
                new MoviesInfo(null,"Zoolander", "Ben Stiller", "Comedy", 6, 2001),
                new MoviesInfo(null,"Shanghai Noon", "Tom Dey", "Comedy", 7, 2000)
        );
    }
}
