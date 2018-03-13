public class KickedSquere implements Figure {
    public int xCord;
    public int yCord;
    public int size;

    KickedSquere(String points) {
        String[] kickedSquare = points.split(" ");
        this.xCord = Integer.parseInt(kickedSquare[1]);
        this.yCord = Integer.parseInt(kickedSquare[0]);
        this.size = Integer.parseInt(kickedSquare[2]);
    }

    public void generate(String[][] screen) {
        for (int i = 0; i < this.size + 1; i++) {
            for (int k = this.xCord - this.size + i; k < this.xCord + this.size + 1 - i; k++) {
                screen[k][this.yCord - i] = "8";
                screen[k][this.yCord + i] = "8";
            }
        }
    }
}
