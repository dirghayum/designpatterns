package com.dmainali.designpatterns.builder;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer computer =Computer.builder()
                .hdd("256 GB")
                .ram("4GB")
                .build();

        System.out.println(computer);
    }
}
