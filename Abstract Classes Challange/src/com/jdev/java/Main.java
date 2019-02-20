package com.jdev.java;

import java.util.LinkedList;

public class Main {



    public static void main(String[] args) {
        SearchTree list = new SearchTree(null);
        //list.traverse(list.getRoot());

        String cities = " 9 8 7 6 5 4 3 2 1  ";
        String [] data = cities.split(" ");

        for (String s: data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
        
    }
}
