import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Animations extends JFrame { // Changed class name and extended JFrame

    Image mclaren, saleen;

    public Animations() {
        mclaren = getImage("Mclaren P1.png");  // Removed getDocumentBase() as unnecessary
        saleen = getImage("Saleen S7 Twin Turbo.png");

        // Add images to a JLabel for better display
        JLabel mclarenLabel = new JLabel(new ImageIcon(mclaren));
        JLabel saleenLabel = new JLabel(new ImageIcon(saleen));

        // Create a panel to hold the labels
        JPanel imagePanel = new JPanel();
        imagePanel.setLayout(new FlowLayout()); // Set layout for side-by-side display
        imagePanel.add(mclarenLabel);
        imagePanel.add(saleenLabel);

        // Add the panel to the frame
        this.add(imagePanel);

        // Set frame properties
        this.setSize(1000, 600);  // Set frame size
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Allow closing the window
        this.setTitle("Car Images");  // Set frame title
    }

    public static void main(String[] args) {
        Animations carImages = new Animations();
        carImages.setVisible(true);
    }

    private Image getImage(String imageName) {  // Helper method to load image
        try {
            return Toolkit.getDefaultToolkit().getImage(imageName);
        } catch (Exception e) {
            System.err.println("Error loading image: " + imageName);
            return null;
        }
    }
}
