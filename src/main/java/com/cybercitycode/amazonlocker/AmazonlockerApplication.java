package com.cybercitycode.amazonlocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazonlockerApplication {

    public static void main(String[] args) {

        //Abstract factory design pattern
        LockerService lockerService = new LockerServiceImpl();

        LockerServiceImpl.lockers.add(new Locker(Status.AVAILABLE, Size.MEDIUM, new Location("abc", "def", "ghi", "ddd")));
        LockerServiceImpl.lockers.add(new Locker(Status.OCCUPIED, Size.LARGE, new Location("abc", "def", "ghi", "ddd")));
        LockerServiceImpl.lockers.add(new Locker(Status.RESERVED, Size.SMALL, new Location("abc", "def", "ghi", "ddd")));

        List<Package> pakages = List.of(new Package(Size.MEDIUM), new Package(Size.LARGE), new Package(Size.SMALL), new Package(Size.SMALL));

        lockerService.generateCode(locker);

        SpringApplication.run(AmazonlockerApplication.class, args);


    }

}
