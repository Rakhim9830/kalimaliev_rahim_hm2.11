public class Lexus extends Car{
    private String dieselEngine;



    public Lexus(int age, String color,String dieselEngine) {
        super(age, color);
        this.dieselEngine = dieselEngine;
    }

    public String getDieselEngine() {
        return dieselEngine;
    }

    @Override
    public void print() {
        System.out.println("Lexus -> " + " age: " + getAge() + " Color: " + getColor() +  " DieselEngine: " + dieselEngine);
    }
}

