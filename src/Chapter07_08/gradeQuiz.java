package Chapter07_08;

public class gradeQuiz {
    public static void main(String[] args) {
        char[][] studentAnswers = new char[2][10];
        studentAnswers[0] = new char[]{'A', 'A', 'C', 'D', 'D', 'B', 'C', 'A', 'D', 'A'};
        studentAnswers[1] = new char[]{'A', 'A', 'C', 'D', 'D', 'B', 'C', 'A', 'D', 'B'};
        char[] answerKey = {'A', 'A', 'C', 'D', 'D', 'B', 'C', 'A', 'D', 'A'};

        for (int i = 0; i < studentAnswers.length; i++) {
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j] != answerKey[j]) {
                    System.out.print(" Wrong ");
                } else {
                    System.out.print(" Correct ");
                }
            }
            System.out.println();
        }

    }
}

