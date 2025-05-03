package org.example.A5_Siglenton.Eager;

public class Main {
    public static void main(String[] args) {

        getSeat("1A");
        getSeat("1A");
    }

    public static void getSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager instance = AircraftSingletonEager.getINSTANCE();
        System.out.println(instance.bookSeat(seat));
    }
}
