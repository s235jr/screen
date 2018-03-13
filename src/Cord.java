public class Cord {
    public int width;
    public int heigth;
    public int maxArrayIndeksOfWidth;
    public int maxArrayIndeksOfHeigth;

    Cord(String points) {
        String[] arrayOfScreenSize = points.split(" ");
        this.width = Integer.parseInt(arrayOfScreenSize[1]);
        this.heigth = Integer.parseInt(arrayOfScreenSize[0]);
        this.maxArrayIndeksOfWidth = width - 1;
        this.maxArrayIndeksOfHeigth = heigth - 1;
    }
}
