public class Main {

    public static void main(String args[]) {

        String screenSize = "20 10";         //width, heigth
        String firstReactangle = "12 2 6 3";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "2 6 4 2";
        String triangle = "1 1 4"; //firstCordOfCornet, secondCordOfCorner, size
        String kickedSquere = "7 4 2"; //firstCordOfCenter, secondCordOfCenter, size

        Screen screen = new Screen(new Cord(screenSize));
        screen.DrawIt(new Reactangle(firstReactangle));
        screen.DrawIt(new BetterReactangle(secondReactangle));
        screen.DrawIt(new Triangle(triangle));
        screen.DrawIt(new KickedSquere(kickedSquere));
        //Figure zmienna = new Reactangle(firstReactangle);
        //screen.DrawIt(zmienna);
        System.out.println(screen.doString());
    }
}
