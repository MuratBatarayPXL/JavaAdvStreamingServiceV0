package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public final int LONG_PLAYING_TIME = 135;

    public Movie(String title, Rating maturityRating){
        super(title, maturityRating);
    }

    public String getTitle(){
        return super.getTitle();
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration > 0 ? duration : -duration ;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public void play() {
        System.out.println("Playing " + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime() {
        return duration > LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        if (duration >= 60){
            if (duration % 60 == 0){
                return duration / 60 + " h";
            }
            return duration / 60 + " h " + duration % 60 + " min";
        } else if (duration >= 1){
            return duration + " min";
        }
        return "?";
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if (releaseDate != null) {
            builder.append(" (").append(releaseDate.getYear()).append((")"));
        }
        return builder.toString();
    }
}



