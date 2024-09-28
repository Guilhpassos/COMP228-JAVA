package Exercise01;

import javax.swing.*;
import java.util.Random;

public class Exercise01 {
    private int correctAnswers = 0;  // Count of correct answers
    private int incorrectAnswers = 0; // Count of incorrect answers
    private Random randomObject = new Random(); // Random object for generating random messages

    // Method to interact with the user and ask questions
    public void inputAnswer() {
        String[] questions = {
                "What is the default value of an integer variable in Java?\nA) 0\nB) null\nC) -1\nD) 1",
                "Which of the following is used to create a new thread in Java?\nA) Thread.start()\nB) Thread.new()\nC) Thread.run()\nD) Thread.create()",
                "Which method is used to start a Java application?\nA) main()\nB) start()\nC) run()\nD) begin()",
                "Which of the following is not a primitive data type in Java?\nA) int\nB) float\nC) String\nD) char",
                "What does JVM stand for?\nA) Java Variable Manager\nB) Java Visual Machine\nC) Java Virtual Machine\nD) Java Version Manager"
        };

        String[] answers = {"A", "A", "A", "C", "C"};

        // Inform the user about the test
        JOptionPane.showMessageDialog(null, "Welcome to the Java Quiz!\nAnswer the following questions by entering A, B, C, or D.");

        // Loop through the questions
        for (int i = 0; i < questions.length; i++) {
            String userAnswer = JOptionPane.showInputDialog(questions[i]);
            // Validate user input
            if (userAnswer == null || !userAnswer.matches("[A-Da-d]")) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, or D.");
                i--; // Repeat the question
                continue;
            }
            checkAnswer(userAnswer, answers[i]);
        }

        showResults();
    }

    // Method to check the answer and update scores
    private void checkAnswer(String userAnswer, String correctAnswer) {
        if (userAnswer.equalsIgnoreCase(correctAnswer)) {
            correctAnswers++;
            generateMessage(true); // Display congratulatory message
        } else {
            incorrectAnswers++;
            generateMessage(false, correctAnswer); // Display incorrect message
        }
    }

    // Method to generate a random message for correctness
    private void generateMessage(boolean isCorrect) {
        String message;
        switch (randomObject.nextInt(4)) { // Generate a random number from 0 to 3
            case 0: message = "Excellent!"; break;
            case 1: message = "Good!"; break;
            case 2: message = "Keep up the good work!"; break;
            case 3: message = "Nice work!"; break;
            default: message = "Great job!"; break;
        }
        JOptionPane.showMessageDialog(null, message); // Display the message
    }

    // Overloaded method to generate a message for incorrect answers
    private void generateMessage(boolean isCorrect, String correctAnswer) {
        String message;
        switch (randomObject.nextInt(4)) { // Generate a random number from 0 to 3
            case 0: message = "No. Please try again. Correct answer: " + correctAnswer; break;
            case 1: message = "Wrong. Try once more. Correct answer: " + correctAnswer; break;
            case 2: message = "Don't give up! Correct answer: " + correctAnswer; break;
            case 3: message = "No. Keep trying. Correct answer: " + correctAnswer; break;
            default: message = "Try again! Correct answer: " + correctAnswer; break;
        }
        JOptionPane.showMessageDialog(null, message); // Display the message
    }

    // Method to show the final results of the test
    private void showResults() {
        int totalQuestions = correctAnswers + incorrectAnswers;
        double percentage = ((double) correctAnswers / totalQuestions) * 100;
        String resultMessage = String.format("Correct Answers: %d\nIncorrect Answers: %d\nPercentage: %.2f%%",
                correctAnswers, incorrectAnswers, percentage);
        JOptionPane.showMessageDialog(null, resultMessage); // Show results
    }

    // Main method to run the application
    public static void main(String[] args) {
        Exercise01 test = new Exercise01();
        test.inputAnswer(); // Start the test
    }
}
