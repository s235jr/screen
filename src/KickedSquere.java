public class KickedSquere extends Figure{
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
        for (int i = this.xCord - this.size; i < this.xCord + this.size + 1; i++) {
            screen[i][this.yCord] = "$";
        }
        for (int i = this.yCord - this.size; i < this.yCord + this.size + 1; i++) {
            screen[this.xCord][i] = "$";
        }
    }
}
