public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Scorpion ", 20, 100, 80, 60);
        Fighter fighter2 = new Fighter("SubZero ", 15, 95, 75, 70);

        Match match = new Match(fighter1, fighter2, 70, 100);
        match.start();
    }}
