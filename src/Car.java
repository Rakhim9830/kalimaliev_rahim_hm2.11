public abstract class Car implements Printable {
    private int age;
    private String color;

    public Car(int age, String color){
        this.age = age;
        this.color = color;
    }

    public Car() {

    }


    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
