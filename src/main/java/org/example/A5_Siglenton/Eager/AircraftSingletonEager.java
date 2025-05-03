package org.example.A5_Siglenton.Eager;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE  = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>(Set.of("1A", "1B"));
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public static AircraftSingletonEager getINSTANCE(){
        return INSTANCE;
    }

    public boolean bookSeat(String name){
        return availableSeats.remove(name);
    }
}

