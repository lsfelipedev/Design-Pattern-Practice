package org.example.A5_Siglenton.LazyWithEnum;

public class Main {
    public static void main(String[] args) {

        getAirCraftBook("1A");
        getAirCraftBook("1A");
        getAirCraftBook("1A");
    }

    public static void getAirCraftBook(String seat){
        System.out.println(AirCraftSingletonEnum.INSTANCE.hashCode());
        AirCraftSingletonEnum instance = AirCraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}

