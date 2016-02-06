package ru.tolyan.myplayer;

/**
 * Created by Tolyan on 02.02.2016.
 */
public class Song {
    private long id;
    private String title;
    private String artist;

    public Song(long songID, String songTitle, String songArtist) {
        this.id = songID;
        this.artist = songArtist;
        this.title = songTitle;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
