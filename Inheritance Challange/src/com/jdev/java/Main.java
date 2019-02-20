package com.jdev.java;

public class Main {

    public static void main(String[] args) {
	Tesla tesla = new Tesla(36);
	tesla.steer(30);
	tesla.accelerate(30);
	tesla.accelerate(30);
	tesla.accelerate(-60);

    }
}
