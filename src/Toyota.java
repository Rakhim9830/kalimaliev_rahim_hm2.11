
public class Toyota extends Car {
    private String transmission;

    public String getTransmission() {
        return transmission;
    }

    public Toyota(int age, String color,String transmission) {
        super(age, color);
        this.transmission = transmission;
    }


    @Override
    public void print() {
        System.out.println("Toyota->  " + "Age: " + getAge() + " color : " + getColor() +  " Transmission: " + transmission);
    }
}
