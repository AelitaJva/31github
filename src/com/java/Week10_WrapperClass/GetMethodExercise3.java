package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMethodExercise3 {
    public static void main(String[] args) {
        List<String> songsPlaylist = new ArrayList<>(Arrays.asList("Song1", "Song2", "Song3", "Song4", "Song5"));
        int currentSongIndex = 2;
        System.out.println(getCurrentSong(songsPlaylist, currentSongIndex));
    }

    public static String getCurrentSong(List<String> songsPlayList, int currentSongIndex) {
        return songsPlayList.get(currentSongIndex);
    }
}
