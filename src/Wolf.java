public class Wolf extends Animal{

    public Wolf(String name, int energy){
        super(name, energy);
    }

    @Override
    public int attack() {
        return (int) (35 + Math.random()* 20); // Math.random returnerer en værdi mellem 0-1. Det vil sige 35-55.
    }
}
