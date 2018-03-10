public class Main {

    public static void main(String args[]) {
        String screenSize = "40 20";         //width, heigth
        String firstReactangle = "5 8 15 10";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "15 5 12 6";
        //String amountOfReactangle = "2";

        Cord valufeForFrame = new Cord(screenSize);
        Screen frameOfScreen = new Screen(valufeForFrame);
        //System.out.println("Ramka ekranu: " + '\n' + frameOfScreen.doString());
        frameOfScreen.generateReactangle(firstReactangle);
        //System.out.println("Ekran z pierwszym prostokątem: " + '\n' + frameOfScreen.doString());
        frameOfScreen.generateReactangle(secondReactangle);
        System.out.println("Ekran z prostokątami: " + '\n' + frameOfScreen.doString());
    }
}
