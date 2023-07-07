public class Main {
    public static void main(String[] args) {
        Album album_1 = new Album("album_1", "Wigz");
        Song song_1 = new  Song("TNT", "4.3 min", "Rap", "Wigz");
        Song song_2 = new  Song("Batal Alaam", "4.5 min", "Rap", "Wigz");
        Song song_3 = new  Song("Asyad Shot", "4 min", "Rap", "Wigz");

        album_1.addSong(song_1);
        System.out.println(album_1.addSong(song_1));
//        System.out.println(album_1.songs.get(0));
//        album_1.addSong(song_2);
//        album_1.addSong(song_3);

//        for (Song song : album_1.songs) {
//            System.out.println(song.getTitle());
//        }





    }
}