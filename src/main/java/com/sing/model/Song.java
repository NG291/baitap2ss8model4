package com.sing.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Song {
    @NotEmpty
    @Size(max= 800)
    @Pattern(regexp="^[a-zA-Z0-9]*$")
    private String nameSongs;

    @NotEmpty
    @Size(max=300)
    @Pattern(regexp="^[a-zA-Z0-9]*$")
    private String singer;

    @NotEmpty
    @Size(max=1000)
    @Pattern(regexp="^[\\w\\s,]*$")
    private String lyrics;

    public Song(){}

    public Song(@NotEmpty @Size(max= 800) String nameSongs, @NotEmpty @Size(max=300) String singer, @NotEmpty @Size(max=1000) String lyrics){
        this.nameSongs= nameSongs;
        this.singer= singer;
        this.lyrics= lyrics;
    }

    public @NotEmpty @Size(max = 800) @Pattern(regexp = "^[a-zA-Z0-9]*$") String getNameSongs() {
        return nameSongs;
    }

    public void setNameSongs(@NotEmpty @Size(max = 800) @Pattern(regexp = "^[a-zA-Z0-9]*$") String nameSongs) {
        this.nameSongs = nameSongs;
    }

    public @NotEmpty @Size(max = 300) @Pattern(regexp = "^[a-zA-Z0-9]*$") String getSinger() {
        return singer;
    }

    public void setSinger(@NotEmpty @Size(max = 300) @Pattern(regexp = "^[a-zA-Z0-9]*$") String singer) {
        this.singer = singer;
    }

    public @NotEmpty @Size(max = 1000) @Pattern(regexp = "^[\\w\\s,]*$") String getLyrics() {
        return lyrics;
    }

    public void setLyrics(@NotEmpty @Size(max = 1000) @Pattern(regexp = "^[\\w\\s,]*$") String lyrics) {
        this.lyrics = lyrics;
    }
}
