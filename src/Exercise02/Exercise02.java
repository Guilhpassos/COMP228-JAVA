package Exercise02;

import javax.swing.*;
import java.util.Random;

public class Exercise02 {
    private int[] lottoNumbers; // Array to hold three random integers

     public Exercise02() {
        lottoNumbers = new int[3];
        Random random = new Random();
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(9) + 1; // Generate numbers between 1 and 9
        }
    }

    // Method to return the array of lotto numbers
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    // Method to calculate the sum of the lotto numbers
    public int getSum() {
        int sum = 0;
        for (int number : lottoNumbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter a number between 3 and 27:"));
        int attempts = 0;
        boolean userWon = false;

        while (attempts < 5) {
            Exercise02 lotto = new Exercise02(); // Create a new lotto object
            int sum = lotto.getSum(); // Get the sum of the lotto numbers
            JOptionPane.showMessageDialog(null, "Lotto numbers: " + lotto.getLottoNumbers()[0] + ", "
                    + lotto.getLottoNumbers()[1] + ", " + lotto.getLottoNumbers()[2]
                    + "\nSum: " + sum);

            if (sum == userNumber) {
                JOptionPane.showMessageDialog(null, "Congratulations! You won!");
                userWon = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, "No match! Try again.");
            }
            attempts++;
        }

        if (!userWon) {
            JOptionPane.showMessageDialog(null, "Sorry! The computer won.");
        }
    }
}
