import java.util.Scanner;

class quizgame {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                //here goes answers to the questions
                char[] ans = { 'a', 'b', 'c', 'a', 'a' };
                int score = 0;
                //here add the questions
                String[] question = {
                                "1. Which flies a green, white, and orange (in that order) tricolor flag? \n" +
                                                "a. Ireland\n" + "b. Ivory Coast\n" + "c. Italy",

                                "2. What company makes the Xperia model of smartphone?\n" +
                                                "a. Samsung\n" + "b. Sony\n" + "c. Nokia",

                                "3. which city is home to the Brandenburg Gate\n" +
                                                "a. Vienna\n" + "b. Zurich\n" + "c. Berlin",

                                "4. Which is NOT a fruit\n" +
                                                "a. Rhubard\n" + "b. Tomatoes\n" + "c. Avocados",

                                "5. Where was the first example of paper money used?\n" +
                                                "a. China\n" + "b. Turkey\n" + "c. Greece"
                };

                // creatinf for loop for logic
                for (int i = 0; i < question.length; i++) {
                        System.out.println(question[i]);
                        char answer = sc.next().charAt(0);
                        System.out.println();

                        if (answer == ans[i]) {
                                score++;
                        }
                }
                System.out.println("Your total Score is :" + score);
        }
}
