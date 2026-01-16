package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Movie;

import java.util.List;

public interface MovieLoader {
    public List<Movie> loadAll();
}

