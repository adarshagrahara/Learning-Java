package us.adarsh_agrahara.Challenge;

import java.util.ArrayList;
import java.util.ListIterator;

public class Album {
      private String name;
      private String artist;
      private ArrayList<Song> songs;
      
      public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.songs = new ArrayList<Song>();
      }
      
      public boolean addSong(String title, double duration){
            if(findSong() == null){
                  this.songs.add(new Song(title,duration));
                  return true;
            }
            return false;
      }
      
      private String findSong(){
            
            return null;
      }
}

class Song{
      private String title;
      private double duration;
      
      public Song(String title, double duration) {
            this.title = title;
            this.duration = duration;
      }
      
      public String getTitle() {
            return title;
      }
      
      @Override
      public String toString() {
            return this.title +": "+ this.duration;
      }
}
