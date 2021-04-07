public class Bat extends Mammal {
    
    public Bat(){
        this.energyLevel = 300;
    }
    // public Bat(int energyLevel){
    //     super(energyLevel = 300);
    // }

    public void fly(){
        System.out.println("screech!!");
        energyLevel-=50;
    }

    public void eatHumans(){
        System.out.println("slurp!");
        energyLevel+=25;
    }

    public void attackTown(){
        System.out.println("clickclack");
        energyLevel-=100;
    }
}
