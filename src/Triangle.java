public class Triangle implements Figure {
    public int xCord;
    public int yCord;
    public int size;


    Triangle(String points) {
        String[] reactangle = points.split(" ");
        this.xCord = Integer.parseInt(reactangle[1]);
        this.yCord = Integer.parseInt(reactangle[0]);
        this.size = Integer.parseInt(reactangle[2]);
    }

    public void generate(String[][] screen) {
        for (int i = 0; i < this.size; i++) {
            for (int k = this.xCord; k < this.size + this.yCord - i; k++) {
                screen[k][yCord + i] = "#";
            }
        }
    }
}

