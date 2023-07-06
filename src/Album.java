import java.util.ArrayList;

public class Album {

    String name;

    String artist;
    ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
//        this.songs = new ArrayList<Song>();
    }
    public Album(){

    }


//     A function to check if a song exists in the list
    public Song checkExistSong(Song s){
        for (Song song : songs) {
            if(song.getTitle().equals(s.getTitle())){
                return song;
            }
        }


        return null;
    }

    boolean addSong(Song s){
//        Check if the song already exists
        if(checkExistSong(s) == null){
            songs.add(s);
            System.out.println(s.getTitle() + "Successfully Added");
            return true;
        } else{
            System.out.println(s.getTitle() + "Exist Already!");
            return false;
        }

    }

//    Add to playList
    public boolean addToPlayList(int trackNumber, ArrayList<Song> playList){
        int index = trackNumber -1;
        if(index>0 && index <= this.songs.size() ){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This Album does not have a song with this trackNumber " + trackNumber);

        return false;
    }
}
