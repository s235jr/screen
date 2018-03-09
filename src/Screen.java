public class Screen {
    int[][] screenFrame;

    Screen(CordofScreen screenSize) {
        this.screenFrame = new int[screenSize.width][screenSize.heigth];
        for (int i = 0; i < screenSize.width; i++) {
            for (int k = 0; k < screenSize.heigth; k++) {
                this.screenFrame[screenSize.width][screenSize.heigth] = 1;
            }
        }

        public String screenToString () {
            String screenInString = "";
            for (int i = 0; i < screenFrame.length; i++) {
                for (int k = 0; k < screenFrame.length; k++) {
                    screenInString += Integer.toString(this.screenFrame[i][k]);
                }
                screenInString = screenInString + '\n';
            }
            return screenInString;
        }


    }
}
