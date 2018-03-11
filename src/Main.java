public class Main {

    public static void main(String args[]) {
        String screenSize = "20 10";         //width, heigth
        String firstReactangle = "12 2 6 1";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "8 7 4 2";
        String triangle = "3 2 6 6"; //firstCordOfCornet, secondCordOfCorner, width, heigth
        //String amountOfReactangle = "2";

        Cord valufeForFrame = new Cord(screenSize);
        Screen frameOfScreen = new Screen(valufeForFrame);
        frameOfScreen.generateReactangle(firstReactangle);
        //System.out.println("Ekran z pierwszym prostokątem: " + '\n' + frameOfScreen.doString());
        frameOfScreen.generateReactangle(secondReactangle);
        frameOfScreen.generateTriangle(triangle);
        System.out.println(frameOfScreen.doString());
    }
}
