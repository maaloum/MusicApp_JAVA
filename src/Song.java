public class Song {
        String title;
        String duration;
        String genre;
        String artist;


    public Song(String title, String duration, String genre, String artist) {
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getArtist() {
        return artist;
    }
}
