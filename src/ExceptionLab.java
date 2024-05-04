import javax.swing.*;

public class ExceptionLab {
    public static void main(String[] args) {
        String[] names = {"Cat", "Dog", "Mouse", "Rabbit", "Donkey", "Fish", "Kangaroo", "Gorilla"};

        int user_given_index = Integer.parseInt(JOptionPane.showInputDialog("Enter the index of animal you want to pick: "));

        try {
            JOptionPane.showMessageDialog(null, "At index " + user_given_index + " is the animal " + names[user_given_index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            JOptionPane.showMessageDialog(null, "This position is not in the list.");
        }
    }
}
