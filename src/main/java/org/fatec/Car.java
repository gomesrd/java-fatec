package org.fatec;

public class Car {
    private String model;
    private String mark;
    private Float speedMax;

    // Encapsulamento
    // O usual é que os atributos sejam private, e os métodos public
    // Se um atributo não tem nenhuma lógica de tratamento não convem torna-lo private
    // friendly --> Mais próximo ao private
    // protected --> Mais próximo ao public
    // - private
    // + public
    // # protected

    public void accelerate() {

    }

    public void brake() {

    }

    public void setSpeedMax(float speed){
        if (speed > 540 || speed < 0) {
            this.speedMax = 540F;
            return;
        };

        this.speedMax = speed;
    }

    public float getSpeedMax(){
        return this.speedMax;
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.mark = "Chevrolet";
        car.model = "Onix";
        car.setSpeedMax(130f);
        System.out.println("Mark " + car.mark);
        System.out.println("Model " + car.model);
        System.out.println("speedMax " + car.getSpeedMax());


        Car car2 = new Car();
        car2.mark = "Volkswagen";
        car2.model = "Fusca";
        car2.setSpeedMax(-2300f);
        System.out.println("Mark " + car2.mark);
        System.out.println("Model " + car2.model);
        System.out.println("speedMax " + car2.getSpeedMax());

    }
}