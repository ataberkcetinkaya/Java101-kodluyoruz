public class Main {

    public static void main(String[] args) {

        Car car = new Car("BMW", 110, "Blue");
        car.printInfo();

        //nesne olusturma dersi
//        Car audi = new Car();
//        audi.model = "A3 Sedan";
//        audi.speed = 10;
//            System.out.println(audi.model + " Speed: " + audi.speed);
//
//        Car bmw = new Car();
//        bmw.model = "F10 M5";
//        bmw.speed = 20;
//            System.out.println(bmw.model + " Speed: " + bmw.speed);

            Car bmw = new Car();
            bmw.model = "F10 M5";
            bmw.speed = 20;
            //burasi overloading yapan Car()'a ait.
    }
}
