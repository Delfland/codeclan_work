package com.codeclan.example;

import sun.lwawt.macosx.CSystemTray;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println(myCat.meow());
    }
}