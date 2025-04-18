package car.constructor.injection;

public class Car {

    private Specification spec;

    public Car(Specification spec) {

        this.spec = spec;
    }


    public void displayDetails(){
        System.out.println("Car Details: " + spec.toString());
    }

}
