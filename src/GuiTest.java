import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiTest {
    private JButton button1;
    private JTextField text1;
    private JButton button2;
    private JLabel label1;
    private JTextField textField1;
    private JTextField textField2;
    private JPanel panel1;
    private JLabel label2;
    private JLabel label3;
    private javax.swing.JPanel JPanel;

    public GuiTest() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("hello,world!");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiTest");
        frame.setContentPane(new GuiTest().JPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);






    }


}
