package software.ulpgc.kata6.io;

import software.ulpgc.kata6.model.Movie;

import java.util.stream.Stream;

public interface Recorder {
    void put(Stream<Movie> movies);
}
