public class Screen {
    public String[][] screen;

    Screen(Cord screenFrame) {
        this.screen = new String[screenFrame.width][screenFrame.heigth];
        for (int i = 0; i < screenFrame.width; i++) {
            for (int k = 0; k < screenFrame.heigth; k++) {
                this.screen[i][k] = "*";
            }
        }

        for (int i = 0; i < screenFrame.width; i++) {
            this.screen[i][0] = "|";
            this.screen[i][screenFrame.heigth - 1] = "|";
        }

        for (int i = 0; i < screenFrame.heigth; i++) {
            this.screen[0][i] = "-";
            this.screen[screenFrame.width - 1][i] = "-";
        }

        this.screen[0][0] = "/";
        this.screen[0][screenFrame.maxArrayIndeksOfHeigth] = "\\";
        this.screen[screenFrame.maxArrayIndeksOfWidth][0] = "\\";
        this.screen[screenFrame.maxArrayIndeksOfWidth][screenFrame.maxArrayIndeksOfHeigth] = "/";
    }

    public void generateReactangleOnScreen(String pointsOfReactangle) {
        Reactangle valueForReactangle = new Reactangle(pointsOfReactangle);
        valueForReactangle.generateReactangle(this.screen, pointsOfReactangle);
    }

    public void generateTriangleOnScreen(String pointsOfTriangle) {
        Triangle valueForTriangle = new Triangle(pointsOfTriangle);
        valueForTriangle.generateTriangle(this.screen, pointsOfTriangle);
    }

    public void generateKickedSquareOnScreen(String pointsOfKickedSquare) {
        KickedSquere valueForKickedSquare = new KickedSquere(pointsOfKickedSquare);
        valueForKickedSquare.generateKickedSquare(this.screen, pointsOfKickedSquare);
    }

    public String doString() {
        String screenInString = "";
        for (int i = 0; i < screen.length; i++) {
            for (int k = 0; k < screen[i].length; k++) {
                screenInString += this.screen[i][k] + " ";
            }
            screenInString = screenInString + '\n';
        }
        return screenInString;
    }
}