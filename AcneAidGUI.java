import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcneAidGUI {

    public static void main(String[] args) {
        // Create the JFrame (main window)
        JFrame frame = new JFrame("Acne Aid Application");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create input fields and labels
        JLabel label1 = new JLabel("Acne Area:");
        label1.setBounds(50, 30, 100, 30);
        frame.add(label1);

        JTextField acneAreaField = new JTextField();
        acneAreaField.setBounds(150, 30, 150, 30);
        frame.add(acneAreaField);

        JLabel label2 = new JLabel("Water Intake (L):");
        label2.setBounds(50, 70, 100, 30);
        frame.add(label2);

        JTextField waterIntakeField = new JTextField();
        waterIntakeField.setBounds(150, 70, 150, 30);
        frame.add(waterIntakeField);

        JLabel label3 = new JLabel("Face Wash Times:");
        label3.setBounds(50, 110, 100, 30);
        frame.add(label3);

        JTextField faceWashField = new JTextField();
        faceWashField.setBounds(150, 110, 150, 30);
        frame.add(faceWashField);

        // Create a button to submit the input
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 160, 100, 30);
        frame.add(submitButton);

        // Add action listener to handle button click
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the user input
                String acneArea = acneAreaField.getText();
                int waterIntake = Integer.parseInt(waterIntakeField.getText());  // Convert to integer
                int faceWashTimes = Integer.parseInt(faceWashField.getText());    // Convert to integer

                // Create AcneAid object
                AcneAid acneAid = new AcneAid(acneArea, waterIntake, faceWashTimes);

                // Get the recommendation from AcneAid
                String recommendation = acneAid.recommendAntibiotic();

                // Display the result in a dialog box
                JOptionPane.showMessageDialog(frame, recommendation);
            }
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
