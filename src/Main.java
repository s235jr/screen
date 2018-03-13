public class Main {

    public static void main(String args[]) {

        String screenSize = "20 10";         //width, heigth
        String firstReactangle = "12 1 6 2";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "4 6 4 2";
        String triangle = "1 1 4 4"; //firstCordOfCornet, secondCordOfCorner, width, heigth
        String kickedSquere = "10 4 2"; //firstCordOfCenter, secondCordOfCenter, size


        Screen screen = new Screen(new Cord(screenSize));
        //screen.DrawIt(new Reactangle(firstReactangle));
        //screen.DrawIt(new Reactangle(secondReactangle));
        //screen.DrawIt(new Triangle(triangle));
        //screen.DrawIt(new KickedSquere(kickedSquere));
        screen.generate(new Reactangle(firstReactangle));
        screen.generate(new Reactangle(secondReactangle));
        screen.generate(new Triangle(triangle));
        screen.generate(new KickedSquere(kickedSquere));
        System.out.println(screen.doString());



    }
}
