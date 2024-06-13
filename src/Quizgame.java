import java.util.Scanner;

public class Quizgame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               String[] questions = {
                "Which is the smallest month of the year?",
                "Which planet is the 3rd closest to the sun?",
                "What is the Half of 250?"
        };
                String[][] answerChoices = {
                {"February", "January", "December", "May"},
                {"Earth", "Mars", "Venus", "Jupiter"},
                {"125", "100", "200", "175"}
        };
        String[] answers = new String[questions.length];

                for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerChoices[i].length; j++) {
                System.out.println((j + 1) + ". " + answerChoices[i][j]);
            }

                        String answer = scanner.nextLine();
                      answers[i] = answer;
        }

                int score = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].equals(answerChoices[i][0])) {
                score++;
            }
        }

        System.out.println("Your score is " + score + " out of " + questions.length);
    }
}