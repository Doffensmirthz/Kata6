package software.ulpgc.kata4.io;

import software.ulpgc.kata4.model.Movie;

import java.util.stream.Stream;

public interface Recorder {
    void put(Stream<Movie> movies);
}
