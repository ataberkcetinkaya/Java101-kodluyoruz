public class Car {
    //Nitelikler
    String type;
    String model;
    String colour;
    int speed;
    int speedLimit;

//    Car() {
//        System.out.println("Nesne olusturuldu. Constructor.");
//        //Main icerisinde her bir defa new Car(); dedigimizde bu calisir. Nesne main'de uretilirken bu cagriliyor.
//    }

      Car(String model, int speed, String colour) { //bu sekilde yaptigimizda main icerisinde artik --Car car = new Car("Audi", 10); olarak yazilabilir--
          this.model = model;    //main'den gecilen modeli bu class'taki yukaridaki String model; 'e aktarmak icin olarak dusun.
          this.speed = speed;                        //this.model => bu siniftaki modeli temsil eder.;
          this.colour = colour;

          //int speedLimit = 180; default değerleri constructor icerisinde girmek daha iyi olabilir
          //}
      }

      Car() {
          System.out.println("overloading");
      }

    void increaseSpeed(int increase) {
        if ((this.speed + increase) < speedLimit) {
            this.speed = this.speed + increase;
        }
    }

    void decreaseSpeed(int decrease) {
        if (this.speed > 0) {
            this.speed = this.speed - decrease;
        }
    }

    void printInfo() {
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.colour);
        System.out.println("Type: " + this.type);
        System.out.println("Speed: " + this.speed);
    }
}
