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

    public void generateReactangle(String pointsOfReactangle) {
        Reactangle valueForReactangle = new Reactangle(pointsOfReactangle);
        for (int i = valueForReactangle.xCord; i < valueForReactangle.width + valueForReactangle.xCord; i++) {
            for (int k = valueForReactangle.yCord; k < valueForReactangle.heigth + valueForReactangle.yCord; k++) {
                this.screen[i][k] = "@";
            }
        }
    }

    public void generateTriangle(String pointsOfTriangle) {
        Reactangle valueForTriangle = new Reactangle(pointsOfTriangle);
        for (int i = valueForTriangle.yCord; i < valueForTriangle.width + valueForTriangle.yCord; i++) {
            this.screen[valueForTriangle.xCord][i] = "#";
        }
        for (int i = valueForTriangle.xCord; i < valueForTriangle.heigth + valueForTriangle.xCord; i++) {
            this.screen[i][valueForTriangle.yCord] = "#";
        }
        for (int i = valueForTriangle.xCord + 1; i < valueForTriangle.width - 1 + valueForTriangle.xCord; i++) {
            for (int k = valueForTriangle.yCord + 1; k < valueForTriangle.heigth - 1 + valueForTriangle.yCord; k++) {
                if (this.screen[i - 1][k + 1] == "#") {
                    this.screen[i][k] = "#";
                }
            }
        }
    }

    public void generateKickedSquare (String pointsOfKickedSquare){
        KickedSquere valueForKickedSquare = new KickedSquere(pointsOfKickedSquare);
        for(int i = valueForKickedSquare.xCord - valueForKickedSquare.size; i < valueForKickedSquare.xCord+valueForKickedSquare.size+1; i++){
            this.screen[i][valueForKickedSquare.yCord] = "$";
        }
        for(int i = valueForKickedSquare.yCord - valueForKickedSquare.size; i < valueForKickedSquare.yCord+valueForKickedSquare.size+1; i++){
            this.screen[valueForKickedSquare.xCord][i] = "$";
        }
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