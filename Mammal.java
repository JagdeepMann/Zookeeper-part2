
public class Mammal {
    public int energyLevel;

    public Mammal(){
        this.energyLevel = 100;
    }
    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    // public int getEnergyLevel(){
    //     return energyLevel;
    // }
    // public void setEnergyLevel(int energyLevel){
    //     this.energyLevel = energyLevel;
    // }

    
    public int displayEnergy(){
        System.out.println("Energy Level is :" + energyLevel);
        return energyLevel;
    }
}
