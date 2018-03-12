public class Main {

    public static void main(String args[]) {

        String screenSize = "20 10";         //width, heigth
        String firstReactangle = "12 1 6 2";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "4 6 4 2";
        String triangle = "1 1 4 4"; //firstCordOfCornet, secondCordOfCorner, width, heigth
        String kickedSquere = "10 4 2"; //firstCordOfCenter, secondCordOfCenter, size


        Cord valufeForFrame = new Cord(screenSize);
        Screen screen = new Screen(valufeForFrame);
        screen.generateReactangleOnScreen(screen, new Reactangle(firstReactangle));
        screen.generateReactangleOnScreen(screen, new Reactangle(secondReactangle));
        screen.generateTriangleOnScreen(screen, new Triangle(triangle));
        screen.generateKickedSquareOnScreen(screen, new KickedSquere(kickedSquere));
        System.out.println(screen.doString());



    }
}
