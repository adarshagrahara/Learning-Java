package us.adarsh_agrahara.Challenge;

import java.util.*;

public class Album {
      private String name;
      private String artist;
      private ArrayList<Song> songs;
      
      public Album(String name, String artist) {
            this.name = name;
            this.artist = artist;
            this.songs = new ArrayList<Song>();
      }
      
      public boolean addSong(String title, double duration) {
            if (findSong(title) == null) {
                  this.songs.add(new Song(title, duration));
                  return true;
            }
            return false;
      }
      
      private Song findSong(String title) {
            for (Song checkedSong : this.songs) {
                  if (checkedSong.getTitle().equals(title)) {
                        return checkedSong;
                  }
            }
            return null;
      }
      
      public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
            int index = trackNumber - 1;
            if ((index >= 0) && (index <= this.songs.size())) {
                  playlist.add(this.songs.get(index));
                  return true;
            }
            System.out.println("This album does not have a track " + trackNumber);
            return false;
      }
      
      public boolean addToPlayList(String title, LinkedList<Song> playList) {
            Song checkedSong = findSong(title);
            if (checkedSong != null) {
                  playList.add(checkedSong);
                  return true;
            }
            System.out.println("The song " + title + " does not exist in the album");
            return false;
      }
}

class Song {
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
            return this.title + ": " + this.duration;
      }
}

class main {
      private static ArrayList<Album> albums = new ArrayList<Album>();
      
      public static void main(String[] args) {
            Album album = new Album("Stormbringer", "Deep Purple");
            album.addSong("Stormbringer", 4.6);
            album.addSong("Love don't mean a thing", 4.22);
            album.addSong("Holy man", 4.3);
            album.addSong("Hold on", 5.6);
            album.addSong("Lady double dealer", 3.21);
            album.addSong("You can't do it right", 6.23);
            album.addSong("High ball shooter", 4.27);
            album.addSong("The gypsy", 4.2);
            album.addSong("Soldier of fortune", 3.13);
            albums.add(album);
            
            album = new Album("For those about to rock", "AC/DC");
            album.addSong("For those about to rock", 5.44);
            album.addSong("I put the finger on you", 3.25);
            album.addSong("Lets go", 3.45);
            album.addSong("Inject the venom", 3.33);
            album.addSong("Snowballed", 4.51);
            album.addSong("Evil walks", 3.45);
            album.addSong("C.O.D.", 5.25);
            album.addSong("Breaking the rules", 5.32);
            album.addSong("Night of the long knives", 5.12);
            albums.add(album);
            
            LinkedList<Song> playList = new LinkedList<Song>();
            albums.get(0).addToPlayList("You can't do it right", playList);
            albums.get(0).addToPlayList("Holy man", playList);
            albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
            albums.get(0).addToPlayList(9, playList);
            albums.get(1).addToPlayList(3, playList);
            albums.get(1).addToPlayList(2, playList);
            albums.get(1).addToPlayList(24, playList);  // There is no track 24
            
            play(playList);
            
            
      }
      
      private static void play(LinkedList<Song> playList) {
            Scanner s = new Scanner(System.in);
            boolean quit = false;
            boolean forward = true;
            
            ListIterator<Song> iterator = playList.listIterator();
            if (playList.size() == 0) {
                  System.out.println("No songs in playlist");
                  return;
            } else {
                  System.out.println("Now playing " + iterator.next().toString());
            }
            printMenu();
            while (!quit) {
                  
                  int choice = s.nextInt();
                  s.nextLine();
                  switch (choice) {
                        case 0:
                              System.out.println("Playlist over");
                              quit = true;
                              break;
                        case 1:
                              if (!forward) {
                                    if (iterator.hasNext()) {
                                          iterator.next();
                                    }
                                    forward = true;
                              }
                              if (iterator.hasNext()) {
                                    System.out.println("Now playing " + iterator.next().toString());
                              } else {
                                    System.out.println("Reached the end of the playlist");
                                    forward = false;
                              }
                              
                              break;
                        
                        case 2:
                              if (forward) {
                                    if (iterator.hasPrevious()) {
                                          iterator.previous();
                                    }
                                    forward = false;
                              }
                              if (iterator.hasPrevious()) {
                                    System.out.println("Now playing " + iterator.previous().toString());
                              } else {
                                    System.out.println("We are at the start of the playlist");
                                    forward = true;
                              }
                              
                              break;
                        
                        case 3:
                              if (forward) {
                                    if (iterator.hasPrevious()) {
                                          System.out.println("Now replaying " + iterator.previous().toString());
                                          forward = false;
                                    } else {
                                          System.out.println("We are at the start of the playlist");
                                    }
                              } else {
                                    if (iterator.hasNext()) {
                                          System.out.println("Now replaying " + iterator.next().toString());
                                          forward = false;
                                    } else {
                                          System.out.println("We are at the end of the playlist");
                                    }
                              }
                              break;
                        
                        case 4:
                              iterator.previous();
                              printList(playList, iterator.next());
                              break;
                        
                        case 5:
                              printMenu();
                              break;
                        
                        default:
                              printMenu();
                              break;
                        
                        
                  }
            }
      }
      
      private static void printMenu() {
            System.out.println("Actions\n" +
                        "1: next song\n" +
                        "2: previous song\n" +
                        "3: replay current song\n" +
                        "4: lists songs\n" +
                        "5: menu options\n" +
                        
                        "----------------");
      }
      
      private static void printList(LinkedList<Song> playList, Song title) {
            Iterator<Song> iterator = playList.iterator();
            System.out.println("--------------");
            while (iterator.hasNext()) {
                  System.out.println(iterator.next().toString());
            }
            System.out.println("Current Song: "+title.toString());
            System.out.println("--------------");
      }
      
}


