package us.adarsh_agrahara.Challenge;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by dev on 18/09/15.
 */
public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new com.timbuchalka.Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<com.timbuchalka.Song> playList) {
        com.timbuchalka.Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<com.timbuchalka.Song> playList) {
        com.timbuchalka.Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList {
        private ArrayList<com.timbuchalka.Song> songs;

        public SongList() {
            this.songs = new ArrayList<com.timbuchalka.Song>();
        }

        public boolean add(com.timbuchalka.Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private com.timbuchalka.Song findSong(String title) {
            for(com.timbuchalka.Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title)) {
                    return checkedSong;
                }
            }
            return null;
        }

        public com.timbuchalka.Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if ((index > 0) && (index<songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    }
}
