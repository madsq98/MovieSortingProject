package com.company;

public class Movie implements Comparable<Movie> {
    private int id;
    private String title;
    private String director;
    private String genre;
    private int productionYear;
    private double rating;

    public Movie(int id, String title, String director, String genre, int productionYear, double rating) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.productionYear = productionYear;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "ID: " + id + " Title: " + title + " Director: " + director + " Genre: " + genre + " Production Year: " + productionYear + " Rating: " + rating;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getProductionYear() - o.getProductionYear();
    }
}
