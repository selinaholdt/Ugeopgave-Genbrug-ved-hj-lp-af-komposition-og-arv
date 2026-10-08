import java.util.ArrayList;

public class Building {
    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }


    public void addRoom(Room room){
        rooms.add(room);
    }

    public int getTotalLampCount(){ //— total antal lamper i hele bygningen
        int lampCount = 0;
        for (Room room : rooms){
            lampCount += room.getLampCount();
        }
        return lampCount;
    }

    public int getTotalWatt(){ //— samlet effekt for hele bygningen
        int totalWatt = 0;
        for (Room room : rooms){
            totalWatt += room.getTotalWatt();
        }
        return totalWatt;
    }

    public void printBuilding(){ //— printer alle rum med deres lamper og vinduer
        System.out.println("===== " + name + " =====");
        System.out.println();
        for (Room room : rooms){
            room.printRoom();
            System.out.println();
        }
        System.out.println("Total: " + getTotalLampCount() + " lamps, " + getTotalWatt() + "W");
    }


}

