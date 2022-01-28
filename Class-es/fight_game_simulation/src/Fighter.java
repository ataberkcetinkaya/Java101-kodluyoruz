public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        }
        else {
            this.dodge = 0;
        }
    }


    boolean isDodge() {
        double randomNum = Math.random() * 100;
        return randomNum <= this.dodge;
    }

    int hit(Fighter rival) {
        System.out.println(this.name + " => to " + rival.name + " " + this.damage + " hitted.");

        if (rival.isDodge()) {
            System.out.println("************ " + rival.name + " Blocked. ************");
            return rival.health;
        }
        if (rival.health - this.damage < 0) {
            return 0;
        }
        return rival.health - this.damage;
    }
}