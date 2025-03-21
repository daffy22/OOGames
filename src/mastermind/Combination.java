package mastermind;

import java.util.Random;

class Combination {

    private String combination;

    public Combination() {
        Random random = new Random();
        combination = "";

        int[] colorList = new int[]{0, 0, 0, 0, 0, 0};
        while (combination.length() <= 3) {
            // RED: 0 - Blue: 1 - Yellow: 2 - Green: 3 - Orange: 4 - Purple: 5
            int randomValue = random.nextInt(6);

            if (colorList[randomValue] == 0) {
                colorList[randomValue] = 1;

                switch (randomValue) {
                    case 0 -> combination += "r";
                    case 1 -> combination += "b";
                    case 2 -> combination += "y";
                    case 3 -> combination += "g";
                    case 4 -> combination += "o";
                    case 5 -> combination += "p";
                }
            }
        }
    }

    public boolean isTheCombination(String combinationToEvaluate) {
        return combinationToEvaluate.equals(combination);
    }

    public String combinationResultBlacksAndWhites(String combinationToEvaluate) {
        int blacks = 0, whites = 0;
        for (int i = 0; i < combination.length(); i++) {
            if (combination.charAt(i) == combinationToEvaluate.charAt(i)) {
                blacks++;
            }
            else if (combination.contains(String.valueOf(combinationToEvaluate.charAt(i)))) {
                whites++;
            }
        }
        return blacks + " blacks and " + whites + " whites.";
    }
}
