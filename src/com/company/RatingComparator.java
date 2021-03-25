package com.company;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie o1, Movie o2) {
        int r1 = (int) o1.getRating();
        int r2 = (int) o2.getRating();
        return r1 - r2;
    }
}
