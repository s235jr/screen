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
    }

    public String[][] generate(String[][] screen, Reactangle valueForReactangle) {
        for (int i = valueForReactangle.xCord; i < valueForReactangle.width + valueForReactangle.xCord; i++) {
            for (int k = valueForReactangle.yCord; k < valueForReactangle.heigth + valueForReactangle.yCord; k++) {
                screen[i][k] = "&";
            }
        }
        return screen;
    }
}
