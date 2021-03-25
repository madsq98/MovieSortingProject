package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Movie> lstMovies = new ArrayList<>();
        lstMovies.add(new Movie(1,"Terminator","Frederik","Action",1998,1.50));
        lstMovies.add(new Movie(2,"100 Dalmatinere","Afold Lither","Comedy",1644,4.50));
        lstMovies.add(new Movie(3,"Stepbro and the 5 stepsisters","Johnny Sins","Erotica",2021,5.00));
        lstMovies.add(new Movie(4,"Pirates","Riley Reid","Erotica",2018,5.00));
        lstMovies.add(new Movie(5,"Hunky Dongs 5","Alex Blake","PORN",2019,4.50));

        Collections.shuffle(lstMovies);

        System.out.println("Shuffled:");
        for(Movie m : lstMovies) {
            System.out.println(m);
        }
        System.out.println(" ");

        System.out.println("Sorted by Production Year: ");
        Collections.sort(lstMovies);
        for(Movie m : lstMovies) {
            System.out.println(m);
        }
        System.out.println(" ");

        System.out.println("Sorted by Rating: ");
        Collections.sort(lstMovies, new RatingComparator());
        for(Movie m : lstMovies) {
            System.out.println(m);
        }
        System.out.println(" ");
    }
}
