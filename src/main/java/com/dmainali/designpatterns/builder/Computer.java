package com.dmainali.designpatterns.builder;

public class Computer {
    private String HDD;
    private String RAM;


    // Builder Class
    public static class ComputerBuilder {
        private String HDD;
        private String RAM;

        public ComputerBuilder hdd(String hdd) {
            this.HDD = hdd;
            return this;
        }

        public ComputerBuilder ram(String ram) {
            this.RAM = ram;
            return this;
        }

        public Computer build(){
            Computer computer = new Computer();
            computer.HDD = this.HDD;
            computer.RAM = this.RAM;
            return computer;
        }
    }

    static ComputerBuilder builder() {return  new ComputerBuilder();}

    @Override
    public String toString() {
        return "Computer: {" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                '}';
    }
}
