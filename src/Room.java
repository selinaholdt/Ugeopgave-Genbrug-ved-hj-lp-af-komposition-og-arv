import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Lamp> lamps = new ArrayList<>();
    private ArrayList<Window> windows = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }


    public void addLamp(Lamp lamp){
        lamps.add(lamp);
    }

    public void addWindow(Window window){
        windows.add(window);
    }

    public int getLampCount(){
        return lamps.size();
    }

    public int getTotalWatt(){ //— sum af alle lampernes watt
        int totalWatt = 0;
        for (Lamp lamp : lamps){
            totalWatt += lamp.getWatt();
        }
        return totalWatt;
    }

    public int getTotalWindowArea() { //— sum af alle vinduers areal
        int totalArea = 0;
        for (Window window : windows){
            totalArea += window.getAreaCm2();
        }
        return totalArea;
    }

    public void printRoom(){
        System.out.println(name + " (" + lamps.size() + " lamps, " + windows.size() + " windows)" );
        String watts = "";
        for (int i = 0; i < lamps.size(); i++){
            watts += lamps.get(i).getWatt() + "W";
            if (i < lamps.size() - 1){
                watts += ", ";
            }
        }
        System.out.println("  Lamps: " + watts + " (Total: " + getTotalWatt() + "W)");

        String size = "";
        for (int i = 0; i < windows.size(); i++){
            size += windows.get(i).getWidthCm() + "x" + windows.get(i).getHeightCm() + " cm";
            if (i < windows.size() - 1){
                size += ", ";
            }
        }
        System.out.println("  Windows: " + size + " (Total: " + getTotalWindowArea() + " cm2)");

    }

}

