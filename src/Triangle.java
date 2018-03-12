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
    }

    public String[][] generateTriangle(String[][] screen, Triangle valueForTriangle) {
        for (int i = valueForTriangle.yCord; i < valueForTriangle.width + valueForTriangle.yCord; i++) {
            screen[valueForTriangle.xCord][i] = "#";
        }
        for (int i = valueForTriangle.xCord; i < valueForTriangle.heigth + valueForTriangle.xCord; i++) {
            screen[i][valueForTriangle.yCord] = "#";
        }
        for (int i = valueForTriangle.xCord + 1; i < valueForTriangle.width - 1 + valueForTriangle.xCord; i++) {
            for (int k = valueForTriangle.yCord + 1; k < valueForTriangle.heigth - 1 + valueForTriangle.yCord; k++) {
                if (screen[i - 1][k + 1] == "#") {
                    screen[i][k] = "#";
                }
            }
        }
        return screen;
    }
}
