package za.ac.cput.domain.entity;
/*
        TestMusicAlbum.java
        Entity for Music Album Test
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 8 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.MusicAlbum;

public class TestMusicAlbum {

    public static void TestBuilder() {

        MusicAlbum album = new MusicAlbum.Builder(1)
                .Title("All Eyez On Me")
                .Publisher("Death Row Records")
                .publicationDate("1996-02-13")
                .Value(750.00f)
                .timeLength(132)
                .build();

        System.out.println(album.toString());
    }

    public static void main(String[] args) {
        TestBuilder();
    }
}
