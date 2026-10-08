public abstract class Animal {
    private String name;
    private int energy;


    public Animal(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public abstract int attack();

    public String getName() {
        return name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public boolean isActive(int energy){
        return (energy > 0);
    }

    public String toString(){
        return getClass() + " \"" + name + "\" (energy: " + energy + ")";
    }






}
