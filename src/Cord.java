public class Cord {
    public int width;
    public int heigth;
    public int maxArrayIndeksOfWidth;
    public int maxArrayIndeksOfHeigth;

    Cord(String screenSize) {
        String[] arrayOfScreenSize = screenSize.split(" ");
        this.width = Integer.parseInt(arrayOfScreenSize[0]);
        this.heigth = Integer.parseInt(arrayOfScreenSize[1]);
        this.maxArrayIndeksOfWidth = width - 1;
        this.maxArrayIndeksOfHeigth = heigth - 1;
        System.out.println("Wysokość ekranu: " + arrayOfScreenSize[0]);
        System.out.println("Szerokość ekranu: " + arrayOfScreenSize[1]);
    }

}
