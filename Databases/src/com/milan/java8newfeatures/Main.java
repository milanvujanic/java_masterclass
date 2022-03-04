package com.milan.java8newfeatures;

import com.milan.java8newfeatures.model.Artist;
import com.milan.java8newfeatures.model.Datasource;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<String> albumNames = datasource.queryAlbumsForArtist("Carole King", 1);
        if (albumNames == null) {
            System.out.println("No albums for artist");
            return;
        }
        albumNames.forEach(System.out::println);

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
