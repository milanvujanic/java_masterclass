package com.milan.java8newfeatures;

import com.milan.java8newfeatures.model.Datasource;
import com.milan.java8newfeatures.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way", 2);
        if (songArtists == null) {
            System.out.println("No song artists");
            return;
        }
        songArtists.forEach(songArtist -> {
            System.out.println(songArtist.getArtistName() + ", " + songArtist.getAlbumName() + ", " + songArtist.getTrack());
        });

        datasource.querySongsMetadata();

        System.out.println(datasource.getCount(Datasource.TABLE_ARTISTS));

//        System.out.println(datasource.createArtistSongView(3) ? "View created" : "View not created");

        List<SongArtist> songArtists1 = datasource.getArtistsForSong("Go Your Own Way", 1);

        if (songArtists1 == null) {
            System.out.println("No song artists");
            return;
        }
        songArtists1.forEach(songArtist -> {
            System.out.println(songArtist.getArtistName() + ", " + songArtist.getAlbumName() + ", " + songArtist.getTrack());
        });

//        List<String> albumNames = datasource.queryAlbumsForArtist("Carole King", 1);
//        if (albumNames == null) {
//            System.out.println("No albums for artist");
//            return;
//        }
//        albumNames.forEach(System.out::println);

//        List<Artist> artists = datasource.queryArtists(2);
//        if(artists == null) {
//            System.out.println("No artists!");
//            return;
//        }
//
//        for(Artist artist : artists) {
//            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
//        }

        datasource.close();
    }
}
