package com.company;

public class Main {

    public static void main(String[] args) {
        Store store = new Store(15,"Arthur",12500678,1);
        System.out.println(store);
        store.selling();
        System.out.println(store);
        store.selling();
        System.out.println(store);
    }
}
