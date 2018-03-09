public class Screen {
    String[][] screenFrame;
    //Cord screen;

    Screen(Cord screen) {
        this.screenFrame = new String[screen.width][screen.heigth];
        for (int i = 0; i < screen.width; i++) {
            for (int k = 0; k < screen.heigth; k++) {
                this.screenFrame[i][k] = "*";
                //System.out.println(this.screenFrame[i][k]); //dlaczego mi się nie printuje?
            }
        }

        for (int i = 0; i < screen.width; i++) {
            for (int k = 0; k < screen.heigth; k = k + screen.maxArrayIndeksOfHeigth) {
                this.screenFrame[i][k] = "|";
            }
        }
        for (int i = 0; i < screen.width; i = i + screen.maxArrayIndeksOfWidth) {
            for (int k = 0; k < screen.heigth; k++) {
                this.screenFrame[i][k] = "-";
            }
        }
        this.screenFrame[0][0] = "/";
        this.screenFrame[0][screen.maxArrayIndeksOfHeigth] = "\\";
        this.screenFrame[screen.maxArrayIndeksOfWidth][0] = "\\";
        this.screenFrame[screen.maxArrayIndeksOfWidth][screen.maxArrayIndeksOfHeigth] = "/";

    }

    public String doString(Cord screen) {
        String screenInString = "";
        for (int i = 0; i < screen.width; i++) {
            for (int k = 0; k < screen.heigth; k++) {
                screenInString += this.screenFrame[i][k];
            }
            screenInString = screenInString + '\n';
        }
        return screenInString;
    }
}
