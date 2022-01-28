public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean isCheck() {
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(f2.name + " WINS!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(f1.name + " WINS!");
            return true;
        }
        return false; //ikisinin de cani 0 degilse, yani kazanan yoksa fight'a devam
    }

    public void start() {
        if (isCheck()) {
            while(this.f1.health > 0 && this.f2.health > 0) { //while > iki fighter icinde can degerleri 0'dan buyuk oldugu surece, herhangi birinin cani 0 oldugunda mac bitecek

                f2.health = f1.hit(f2); //f1 vuracak, f2 rakibi olacak
                if (isWin()) {
                    break;
                }
                f1.health = f2.hit(f1);
                if (isWin()) {
                    break;
                }
                System.out.print("Health remains: " + f1.name + f1.health + "\n");
                System.out.print("Health remains: " + f2.name + f2.health + "\n");
                System.out.print("====================================== \n");
            }
        }
        else {
            System.out.println("Weights are not equal for fighters.");
        }
    }}
