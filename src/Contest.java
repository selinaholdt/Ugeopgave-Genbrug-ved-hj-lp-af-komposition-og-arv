public class Contest {
    Animal animal1;
    Animal animal2;
    int rounds = 0;

    public Contest(Animal animal1, Animal animal2, int rounds) {
        this.animal1 = animal1;
        this.animal2 = animal2;
        this.rounds = rounds;
    }


    public void playRound(){

        for (int i = 0; i < rounds; i++) {
            if (animal1.isActive(animal1.getEnergy()) && animal2.isActive(animal2.getEnergy())) {
                System.out.println("==== Round " + (i + 1) + " ====");
                int attack2 = animal2.attack();
                animal1.setEnergy(animal1.getEnergy() - attack2);
                System.out.println(animal2.getName() + " attacks " + animal1.getName() +
                        " with " + attack2 + "! (" + animal1.getName() + " has " + animal1.getEnergy() + " energy left)");
                int attack1 = animal1.attack();
                animal2.setEnergy(animal2.getEnergy() - attack1);
                System.out.println(animal1.getName() + " attacks " + animal2.getName() +
                        " with " + attack1 + "! (" + animal2.getName() + " has " + animal2.getEnergy() + " energy left)");
                System.out.println();
            }
        }

        Animal winner = getWinner();
        System.out.println("The winner is: " + winner.getName() + "!");

    }

    public Animal getWinner(){
        if (animal1.getEnergy() > animal2.getEnergy()){
            return animal1;
        }else {
            return animal2;
        }

    }

}
//--- Runde 1 ---
//Simba angriber Rabbit for 15! (Rabbit har 45 energi tilbage)
//Rabbit angriber Simba for 4! (Simba har 76 energi tilbage)
