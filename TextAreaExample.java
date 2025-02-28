import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TextArea Example");
        frame.setSize(400, 300);

        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText();
                JOptionPane.showMessageDialog(frame, "Text submitted:\n" + text);
            }
        });

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(submitButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
