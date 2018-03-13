public class Triangle implements Figure {
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
    }

    public void generate(String[][] screen) {
        for (int i = this.yCord; i < this.width + this.yCord; i++) {
            screen[this.xCord][i] = "#";
        }
        for (int i = this.xCord; i < this.heigth + this.xCord; i++) {
            screen[i][this.yCord] = "#";
        }
        for (int i = this.xCord + 1; i < this.width - 1 + this.xCord; i++) {
            for (int k = this.yCord + 1; k < this.heigth - 1 + this.yCord; k++) {
                if (screen[i - 1][k + 1] == "#") {
                    screen[i][k] = "#";
                }
            }
        }
    }
}
