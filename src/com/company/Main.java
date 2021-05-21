package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(15, "Arthur", 15011678, 5);
        System.out.println(store);
        store.selling();
        System.out.println(store);
        store.selling();
        System.out.println(store);
    }
}
