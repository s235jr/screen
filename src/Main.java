public class Main {

    public static void main(String args[]) {
        String screenSize = "20 10";         //width, heigth
        String firstReactangle = "12 1 6 2";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "4 6 4 2";
        String triangle = "2 2 4 4"; //firstCordOfCornet, secondCordOfCorner, width, heigth
        String kickedSquere = "10 4 2"; //firstCordOfCenter, secondCordOfCenter, size
        //String amountOfReactangle = "2";

        Cord valufeForFrame = new Cord(screenSize);
        Screen frameOfScreen = new Screen(valufeForFrame);
        frameOfScreen.generateReactangle(firstReactangle);
        //System.out.println("Ekran z pierwszym prostokątem: " + '\n' + frameOfScreen.doString());
        frameOfScreen.generateReactangle(secondReactangle);
        frameOfScreen.generateTriangle(triangle);
        frameOfScreen.generateKickedSquare(kickedSquere);
        System.out.println(frameOfScreen.doString());
    }
}
