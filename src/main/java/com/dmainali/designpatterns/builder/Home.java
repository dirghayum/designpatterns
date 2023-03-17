package com.dmainali.designpatterns.builder;

public class Home {

    int windows;
    int doors;

    static class HomeBuilder{
        int windows;
        int doors;

        public HomeBuilder windows(int n){
            this.windows=n;
            return this;
        }

        public HomeBuilder doors(int n){
            this.doors=n;
            return this;
        }

        public Home build(){
            Home home = new Home();
            home.windows = this.windows;
            home.doors = this.doors;
            return home;
        }
    }

    static HomeBuilder builder(){
        return new HomeBuilder();
    }

    public String toString(){
        return "{" +
                "windows : "+windows+"," +
                "doors : "+doors+
                "}";
    }

    public static void main(String[] args) {
        Home house =
                Home.builder()
                .windows(2)
                .doors(4)
                .build();
        System.out.println(house);
    }
}


// Rest API and REST api testing (using postman/insomnia/browser)
// Collection framework
// Design pattern
// Abstract class and interface
// Unit test and mocking
// Multithreading
// Exception handling

