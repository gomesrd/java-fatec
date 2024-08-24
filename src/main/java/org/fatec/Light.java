package org.fatec;

public class Light {
    boolean stateLight;

    public void turnOn() {
        stateLight = true;
    }

    public void turnOff() {
        stateLight = false;
    }

    public boolean stateLight() {
        return stateLight;
    }


    public static void main(String[] args) {
        Light light = new Light();
        System.out.println("Light is on? " + light.stateLight());
        light.turnOn();
        System.out.println("Light is on? " + light.stateLight());
        light.turnOff();
        System.out.println("Light is on? " + light.stateLight());
    }
}
