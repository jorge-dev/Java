package com.jdev.java;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Storm","Deep Purple");
        album.addSong("Storm1", 3.45);
        album.addSong("Storm2", 3.55);
        album.addSong("Storm3", 4.44);
        album.addSong("Storm4", 3.34);
        album.addSong("Storm5", 3.45);
        album.addSong("Storm6", 3.45);
        album.addSong("Storm7", 3.43);
        album.addSong("Storm8", 3.41);
        album.addSong("Storm9", 3.45);
        album.addSong("Storm10", 3.43);

        albums.add(album);

        album = new Album("Mercy","Someone");
        album.addSong("Mercy1", 4.45);
        album.addSong("Mercy2", 5.45);
        album.addSong("Mercy4", 3.45);
        album.addSong("Mercy5", 3.46);
        album.addSong("Mercy6", 3.43);
        album.addSong("Mercy7", 3.45);
        album.addSong("Mercy8", 3.43);
        album.addSong("Mercy9", 3.47);
        album.addSong("Mercy10", 3.49);


        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();

        albums.get(0).addToPlaylist("Storm1",playList);
        albums.get(0).addToPlaylist("Storm2",playList);
        albums.get(0).addToPlaylist("Storm3",playList);
        albums.get(0).addToPlaylist("Stor",playList); // shouldnt work


        albums.get(1).addToPlaylist(3,playList);
        albums.get(1).addToPlaylist(4,playList);
        albums.get(1).addToPlaylist(5,playList);
        albums.get(1).addToPlaylist(33,playList); // shouldnt work

        play(playList);
    }


    private static void play(LinkedList<Song> list){
        ListIterator<Song> listIterator = list.listIterator();
        Scanner s = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        if (list.size() == 0){
            System.out.println("NO songs");
            return;
        }
        else{
            System.out.println("Now Playing: " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){

            int a = s.nextInt();
            s.nextLine();

            switch (a){

                case 0:
                    System.out.println("Playlist Complete");
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }

                    if (listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("End of Playlist");
                        forward = false;
                    }
                    break;

                case 2:

                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if (listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("Start of Playlist");
                        forward = true;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else
                            System.out.println("We are at the start of the List");
                    }
                    else {
                        if (listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }
                        else
                            System.out.println("We are at the end of the List");
                    }
                    break;

                case 4:
                    printList(list);
                    break;
                case 5:
                    printMenu();
                    break;

                case 6:
                    if (list.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next().toString());
                        }else if (listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }

    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print available actions.\n" +
                "6 - delete current song from playlist");

    }


    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("================================");
    }

}
