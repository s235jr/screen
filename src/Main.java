public class Main {

    public static void main(String args[]) {
        String screenSize = "20 20";         //width, heigth
        String firstReactangle = "3 2 5 6";  //firstCordOfCornet, secondCordOfCorner, width, heigth
        String secondReactangle = "3 3 10 2";
        String amountOfReactangle = "2";

        CordofScreen screenFrame = new CordofScreen(screenSize);
        System.out.println("Ramka ekranu: " + '\n' + screenFrame.screenToString());

    }
}
