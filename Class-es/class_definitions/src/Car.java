public class Car {
    //Nitelikler
    String type;
    String model;
    String colour;
    int speed;
    int speedLimit = 180;

    void increaseSpeed(int increase) {
        if ((speed + increase) < speedLimit) {
            speed = speed + increase;
        }
    }

    void decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed = speed - decrease;
        }
    }

    void printSpeed() {
        System.out.println("Your speed: " + speed);
    }
}
