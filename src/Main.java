public class Main {

    public static void main(String args[]) {

        String screenSize = "20 10";         //width, heigth
        String firstReactangle = "12 1 6 2";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "4 6 4 2";
        String triangle = "1 1 4 4"; //firstCordOfCornet, secondCordOfCorner, width, heigth
        String kickedSquere = "10 4 2"; //firstCordOfCenter, secondCordOfCenter, size
        //String amountOfReactangle = "2";

        Cord valufeForFrame = new Cord(screenSize);
        Screen screen = new Screen(valufeForFrame);
        screen.generateReactangleOnScreen(firstReactangle);
        screen.generateReactangleOnScreen(secondReactangle);
        screen.generateTriangleOnScreen(triangle);
        screen.generateKickedSquareOnScreen(kickedSquere);
        System.out.println(screen.doString());



    }
}
