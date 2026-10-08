public class Window {
    private int widthCm;
    private int heightCm;

    public Window(int widthCm, int heightCm) {
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public int getAreaCm2(){
        return widthCm * heightCm;
    }

    public String tostring(){
        return "Window | width in cm: " + widthCm + ", height in cm: " +heightCm;
    }



}
