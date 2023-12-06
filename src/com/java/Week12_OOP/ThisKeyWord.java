package com.java.Week12_OOP;

public class ThisKeyWord {
    public static void main(String[] args) {
        MusicAlbum mc = new MusicAlbum("if you are reading this it's too late", "Drake", 2014, false);

        System.out.println(mc.isForKids);
        System.out.println(mc.title);
        System.out.println("\"" + mc.title + "\"");
    }
}


class MusicAlbum {
    public String title;  // this.title
    public String artist;
    public int yearReleased;
    public boolean isForKids;
    public long views;

//    public MusicAlbum(String albumTitle, String albumArtist,
//                      int albumYearReleased, boolean isAlbumForKids) {
//        title = albumTitle;
//        artist = albumArtist;
//        yearReleased = albumYearReleased;
//        isForKids = isAlbumForKids;
//    }


    // this keyword helps you access the instance variables
    // of your current class
    // avoid writing the extra names, to keep the code clean
    // this keyword helps us differentiate between method or constructor params
    // and instance variables
    // helps us avoid redundancy in variable name

    public MusicAlbum(String title, String artist, int yearReleased, boolean isForKids) {
        this.title = title;
        this.artist = artist;
        this.yearReleased = yearReleased;
        this.isForKids = isForKids;
    }
}
