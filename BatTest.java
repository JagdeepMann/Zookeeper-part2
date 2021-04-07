public class BatTest {
    public static void main(String[] args) {
        Bat b = new Bat();
        b.displayEnergy();

        b.fly();
        b.eatHumans();
        b.attackTown();

        b.displayEnergy();
    }
}
