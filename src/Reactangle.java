public class Reactangle extends Figure {
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
    }

    public void generate(String[][] screen) {
        for (int i = this.xCord; i < this.width + this.xCord; i++) {
            for (int k = this.yCord; k < this.heigth + this.yCord; k++) {
                screen[i][k] = "&";
            }
        }
    }
}
