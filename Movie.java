public class Movie {
    private String title;
    private String genre;
    private double rating;
    private int year;
    private int duration;

    public Movie(String title, String genre, double rating, int year, int duration) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public int getDuration() {
        return duration;
    }

  
    public String toString() {
        return title + " (" + year + "), Genre: " + genre + ", Rating: " + rating + ", Duration: " + duration + " min";
    }
}
