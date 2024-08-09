import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCheckerGUI {
    public static void main(String[] args) {
        // Create a frame for the GUI
        JFrame frame = new JFrame("Palindrome Checker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a text field for input
        JTextField textField = new JTextField(10);

        // Create a button to check for palindrome
        JButton checkButton = new JButton("Check");

        // Create a label to display results
        JLabel resultLabel = new JLabel("Enter the number");

        // Add action listener to the button
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (isPalindrome(input)) {
                    resultLabel.setText("Palindrome");
                } else {
                    resultLabel.setText("Not palindrome");
                }
            }

            // Method to check if a string is a palindrome
            private boolean isPalindrome(String input) {
                int length = input.length();
                for (int i = 0; i < length / 2; i++) {
                    if (input.charAt(i) != input.charAt(length - i - 1)) {
                        return false;
                    }
                }
                return true;
            }
        });

        // Layout the components
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(checkButton);
        panel.add(resultLabel);

        // Add the panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
}
