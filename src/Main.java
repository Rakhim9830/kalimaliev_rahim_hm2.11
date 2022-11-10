public class Main {    public static void main(String[] args) {
    Toyota toyota = new Toyota(2005, "Blue", "Mechanics");
    toyota.print();
    Lexus lexus = new Lexus(2001, "WHite", "Engine: Diesel");
    lexus.print();
    Mercedes mercedes = new Mercedes(2006, "Brown", "Left Side");
    mercedes.print();



    createObjects(Cars.TOYOTA);
    createObjects(Cars.LEXUS);
    createObjects(Cars.MERCEDES);


}

    private static Car createObjects(Cars typeOfClass){
        if (Cars.LEXUS == typeOfClass){
            Lexus lexus = new Lexus(2005,"Gray","Diesel");
            lexus.print();
            return lexus;
        } else if (Cars.TOYOTA == typeOfClass) {
            Toyota toyota = new Toyota(2006,"Yellow","Automate");
            toyota.print();
            return toyota;
        } else if (Cars.MERCEDES == typeOfClass) {
            Mercedes mercedes = new Mercedes(2010,"Black","Right Side");
            mercedes.print();
            return mercedes;
        }
        else {
            return null;
        }
    }

}
