import javax.swing.*;
import java.awt.*;

public class HelloWorldApp extends JFrame {
    public HelloWorldApp() {
        setTitle("Hello, World!");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                g.setColor(Color.WHITE);
                g.setFont(new Font("Arial", Font.PLAIN, 20));
                g.drawString("Hello, World!", 100, 150);
            }
        };

        add(panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            HelloWorldApp app = new HelloWorldApp();
            app.setVisible(true);
        });
    }
}
