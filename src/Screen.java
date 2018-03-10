public class Screen {
    String[][] screen;

    Screen(Cord screenFrame) {
        this.screen = new String[screenFrame.width][screenFrame.heigth];
        for (int i = 0; i < screenFrame.width; i++) {
            for (int k = 0; k < screenFrame.heigth; k++) {
                this.screen[i][k] = " ";
            }
        }

        for (int i = 0; i < screenFrame.width; i++) {
            for (int k = 0; k < screenFrame.heigth; k = k + screenFrame.maxArrayIndeksOfHeigth) {
                this.screen[i][k] = "|";
            }
        }
        for (int i = 0; i < screenFrame.width; i = i + screenFrame.maxArrayIndeksOfWidth) {
            for (int k = 0; k < screenFrame.heigth; k++) {
                this.screen[i][k] = "-";
            }
        }
        this.screen[0][0] = "/";
        this.screen[0][screenFrame.maxArrayIndeksOfHeigth] = "\\";
        this.screen[screenFrame.maxArrayIndeksOfWidth][0] = "\\";
        this.screen[screenFrame.maxArrayIndeksOfWidth][screenFrame.maxArrayIndeksOfHeigth] = "/";
    }

    public String[][] generateReactangle(Reactangle valueForReactangle){
        for (int i = valueForReactangle.xCord; i < valueForReactangle.width; i++) {
            for (int k = valueForReactangle.yCord; k < valueForReactangle.heigth; k++) {
                this.screen[i][k] = "#";
            }
        }
        return this.screen;
    }

    public String doString() {
        String screenInString = "";
        for (int i = 0; i < screen.length; i++) {
            for (int k = 0; k < screen[i].length; k++) {
                screenInString += this.screen[i][k];
            }
            screenInString = screenInString + '\n';
        }
        return screenInString;
    }
}
