public class Screen {
    public String[][] screen;

    Screen(Cord screenFrame) {
        this.screen = new String[screenFrame.heigth][screenFrame.width];
        for (int i = 0; i < screenFrame.heigth; i++) {
            for (int k = 0; k < screenFrame.width; k++) {
                this.screen[i][k] = " ";
            }
        }

        for (int i = 0; i < screenFrame.heigth; i++) {
            for (int k = 0; k < screenFrame.width; k = k + screenFrame.maxArrayIndeksOfWidth) {
                this.screen[i][k] = "|";
            }
        }
        for (int i = 0; i < screenFrame.heigth; i = i + screenFrame.maxArrayIndeksOfHeigth) {
            for (int k = 0; k < screenFrame.width; k++) {
                this.screen[i][k] = "-";
            }
        }

        this.screen[0][0] = "/";
        this.screen[0][screenFrame.maxArrayIndeksOfWidth] = "\\";
        this.screen[screenFrame.maxArrayIndeksOfHeigth][0] = "\\";
        this.screen[screenFrame.maxArrayIndeksOfHeigth][screenFrame.maxArrayIndeksOfWidth] = "/";
    }

    public void generateReactangle(String pointsOfReactangle) {
        Reactangle valueForReactangle = new Reactangle(pointsOfReactangle);
        for (int i = valueForReactangle.yCord; i < valueForReactangle.heigth + valueForReactangle.yCord; i++) {
            for (int k = valueForReactangle.xCord; k < valueForReactangle.width + valueForReactangle.xCord; k++) {
                this.screen[i][k] = "#";
            }
        }
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
