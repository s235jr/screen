public class Reactangle {
    public int xCord;
    public int yCord;
    public int width;
    public int heigth;

    Reactangle(String points) {
        String[] reactangle = points.split(" ");
        this.xCord = Integer.parseInt(reactangle[1]);
        this.yCord = Integer.parseInt(reactangle[0]);
        this.width = Integer.parseInt(reactangle[3]);
        this.heigth = Integer.parseInt(reactangle[2]);
        //System.out.println("Prostokąt - współrzedna X: " + reactangle[0]);
        //System.out.println("Prostokąt - współrzedna Y: " + reactangle[1]);
        //System.out.println("Prostokąt - szerokość: " + reactangle[2]);
        //System.out.println("Prostokąt - wysokość: " + reactangle[3]);
    }


}
