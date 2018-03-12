public class KickedSquere{
    public int xCord;
    public int yCord;
    public int size;

    KickedSquere(String points) {
        String[] kickedSquare = points.split(" ");
        this.xCord = Integer.parseInt(kickedSquare[1]);
        this.yCord = Integer.parseInt(kickedSquare[0]);
        this.size = Integer.parseInt(kickedSquare[2]);

    }

    public String[][] generateKickedSquare(String[][] screen, String pointsOfKickedSquare) {
        KickedSquere valueForKickedSquare = new KickedSquere(pointsOfKickedSquare);
        for (int i = valueForKickedSquare.xCord - valueForKickedSquare.size; i < valueForKickedSquare.xCord + valueForKickedSquare.size + 1; i++) {
            screen[i][valueForKickedSquare.yCord] = "$";
        }
        for (int i = valueForKickedSquare.yCord - valueForKickedSquare.size; i < valueForKickedSquare.yCord + valueForKickedSquare.size + 1; i++) {
            screen[valueForKickedSquare.xCord][i] = "$";
        }
        return screen;
    }
}
