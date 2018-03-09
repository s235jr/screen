public class CordofScreen {
    public int width;
    public int heigth;

    CordofScreen(String screenSize){
        String[] arrayOfScreenSize = screenSize.split("");
        this.width = Integer.parseInt(arrayOfScreenSize[0]);
        this.heigth = Integer.parseInt(arrayOfScreenSize[1]);
    }

}
