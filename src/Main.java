public class Main {

    public static void main(String args[]) {
        String screenSize = "10 100";         //width, heigth
        String firstReactangle = "3 2 5 6";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "3 3 10 2";
        String amountOfReactangle = "2";

        Cord screen = new Cord(screenSize);
        Screen frameOfScreen = new Screen(screen);
        System.out.println("Ramka ekranu: " + '\n' + frameOfScreen.doString(screen));


    }
}
