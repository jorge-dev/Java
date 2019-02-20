package com.jdev.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong (String title, double duration){

       return this.songs.add(new Song(title,duration));
    }



    public boolean addToPlaylist(int trackNum, LinkedList<Song> playList){
        Song checkSongs = this.songs.findSong(trackNum );
        if (checkSongs != null){
            playList.add(checkSongs);
            return true;
        }
        System.out.println("This album does not the track " + trackNum);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList){

        Song checkSong = songs.findSong(title);
        if (checkSong != null){
            playList.add(checkSong);
            return true;
        }

        System.out.println("This song " + title + " is not in this album");
        return false;
    }




    private class SongList {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();

        }

        public boolean add (Song song){
            if (songs.contains(song)){
                return false;
            }
            this.songs.add(song);
            return true;
        }


        private Song findSong(String name){

            for (Song checked: this.songs ){
                if (checked.getTitle().equals(name)){
                    return checked;
                }
            }

            return null;
        }

        private Song findSong(int track) {
            int index = track -1;

            if (index > 0 &&  (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }


    }







}


