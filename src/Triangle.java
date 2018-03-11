public class Triangle {
    public int xCord;
    public int yCord;
    public int width;
    public int heigth;

    Triangle(String points) {
        String[] reactangle = points.split(" ");
        this.xCord = Integer.parseInt(reactangle[1]);
        this.yCord = Integer.parseInt(reactangle[0]);
        this.width = Integer.parseInt(reactangle[3]);
        this.heigth = Integer.parseInt(reactangle[2]);
        //System.out.println("Trójkąt - współrzedna X: " + reactangle[0]);
        //System.out.println("Trójkąt - współrzedna Y: " + reactangle[1]);
        //System.out.println("Trójkąt - szerokość: " + reactangle[2]);
        //System.out.println("Trójkąt - wysokość: " + reactangle[3]);
    }
}
