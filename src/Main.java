import java.util.ArrayList;

public class Main {

    void main(){

       //Del 1: En bygning med rum
        Building building = new Building("Office");

        Room room1 = new Room("Reception");
        room1.addLamp(new Lamp(50));
        room1.addLamp(new Lamp(30));
        room1.addWindow(new Window(200, 140));

        Room room2 = new Room("Meeting 1");
        room2.addLamp(new Lamp(80));
        room2.addLamp(new Lamp(80));
        room2.addWindow(new Window(160, 140));
        room2.addWindow(new Window(140, 140));
        room2.addWindow(new Window(160, 140));

        Room room3 = new Room("Meeting 2");
        room3.addLamp(new Lamp(30));
        room3.addLamp(new Lamp(20));
        room3.addWindow(new Window(80, 140));
        room3.addWindow(new Window(80, 140));

        building.addRoom(room1);
        building.addRoom(room2);
        building.addRoom(room3);

        building.printBuilding();
        System.out.println();
        System.out.println();




        //Del 2: Dyr der konkurrerer

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Lion("Mufasa", 200));
        animals.add(new Rabbit("Snup", 450));
        animals.add(new Wolf("Lone Wolf", 350));
        animals.add(new Rabbit("Snurre", 500));


        Contest contest1 = new Contest(animals.get(0), animals.get(1), 10);
        contest1.playRound();
        System.out.println();


        Contest contest2 = new Contest(animals.get(2), animals.get(3), 10);
        contest2.playRound();






    }



}
