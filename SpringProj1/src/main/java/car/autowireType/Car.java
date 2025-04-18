package car.autowireType;

public class Car {

    private Specification spec1;

    public void setSpec1(Specification spec1) {
        this.spec1 = spec1;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + spec1.toString());
    }

}
