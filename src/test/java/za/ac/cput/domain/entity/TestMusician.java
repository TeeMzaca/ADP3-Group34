package za.ac.cput.domain.entity;
/*
        TestMusician.java
        Entity for Musician Test
        Author: Mogammad Faeedh Daniels (219174288)
        Date: 8 April 2022
 */
import za.ac.cput.LibrarySystem.domain.entity.Musician;

public class TestMusician {

    public static void TestBuilder() {

        Musician musician = new Musician.Builder(1)
                .Name("Tupac Shakur")
                .BirthDate("1971-06-17")
                .Bio("Tupac Amaru Shakur, better known by his stage name 2Pac, was an American rapper and actor. He is widely considered one of the most influential rappers of all time.")
                .build();

        System.out.println(musician.toString());
    }

    public static void main(String[] args) {
        TestBuilder();
    }
}

