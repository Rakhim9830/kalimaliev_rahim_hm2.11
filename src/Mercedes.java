public class Mercedes extends Car {
    private String handlebarSide;



    public Mercedes(int age, String color,String handlebarSide) {
        super(age, color);
        this.handlebarSide = handlebarSide;
    }
    public String getHandlebarSide() {
        return handlebarSide;

    }


    @Override
    public void print() {
        System.out.println ( " Mercedes -> " + " age: " + getAge() + " Color: " + getColor() +  " handlebarSide " + handlebarSide);
    }
}

