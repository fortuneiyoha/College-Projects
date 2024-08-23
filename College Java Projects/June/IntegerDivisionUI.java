import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntegerDivisionUI extends JFrame {

    private JTextField numberField1;
    private JTextField numberField2;
    private JTextField resultField;

    public IntegerDivisionUI() {
        setTitle("Integer Division");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Number 1:");
        numberField1 = new JTextField();
        JLabel label2 = new JLabel("Number 2:");
        numberField2 = new JTextField();
        JButton divideButton = new JButton("Divide");
        resultField = new JTextField();

        resultField.setEditable(false); // Result field should not be editable

        add(label1);
        add(numberField1);
        add(label2);
        add(numberField2);
        add(new JLabel()); // Empty cell
        add(divideButton);
        add(new JLabel()); // Empty cell
        add(resultField);

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numberField1.getText());
                    int num2 = Integer.parseInt(numberField2.getText());

                    int result = num1 / num2;
                    resultField.setText(Integer.toString(result));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(IntegerDivisionUI.this,
                            "Please enter valid integers for both numbers.",
                            "Number Format Error", JOptionPane.ERROR_MESSAGE);
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(IntegerDivisionUI.this,
                            "Division by zero is not allowed.",
                            "Arithmetic Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                IntegerDivisionUI divisionUI = new IntegerDivisionUI();
                divisionUI.setVisible(true);
            }
        });
    }
}