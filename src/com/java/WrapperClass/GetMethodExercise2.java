package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMethodExercise2 {
    public static void main(String[] args) {
        List<String> movieList = new ArrayList<>(Arrays.asList("Movie1", "Movie2", "Movie3", "Movie4", "Movie5"));
        int movieIndex = 3;
        System.out.println(getMovieTitle(movieList, movieIndex));
    }
    public static String getMovieTitle (List<String> movieList, int movieIndex) {

        return movieList.get(movieIndex);
    }
}
