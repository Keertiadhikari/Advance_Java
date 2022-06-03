import javax.swing.JOptionPane;

public class Confirm_JOption {

    public static void main(String[] args) {

        int input = JOptionPane.showConfirmDialog(null, "Do you like bacon?");
        // 0=yes, 1=no, 2=cancel
        System.out.println(input);

    }
}