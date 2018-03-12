public class KickedSquere {
    public int xCord;
    public int yCord;
    public int size;

    KickedSquere(String points){
        String[] kickedSquare = points.split(" ");
        this.xCord = Integer.parseInt(kickedSquare[1]);
        this.yCord = Integer.parseInt(kickedSquare[0]);
        this.size = Integer.parseInt(kickedSquare[2]);

    }
}
