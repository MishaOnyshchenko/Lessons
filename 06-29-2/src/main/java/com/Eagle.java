package com;

public class Eagle implements Bird {

    private  SuperFly superFly;

    public Eagle (SuperFly superFly){
        this.superFly = superFly;
    }

    public void fly() {
        System.out.println("Eagle can fly high");
    }

    public void canSuperFly() {
        superFly.superFly();
    }
}
