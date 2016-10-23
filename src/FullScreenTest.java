import javax.swing.*;
import java.awt.*;

public class FullScreenTest extends JFrame {

    // controls how long the screen gets displayed in ms
    private static final long DEMO_TIME = 2000;

    public static void main(String[] args) {

        DisplayMode displayMode;

        if (args.length == 3) {
            displayMode = new DisplayMode(
                Integer.parseInt(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]),
                DisplayMode.REFRESH_RATE_UNKNOWN);
        }
        else {
            displayMode = new DisplayMode(800, 600, 16,
                DisplayMode.REFRESH_RATE_UNKNOWN);
        }

        FullScreenTest test = new FullScreenTest();
        test.run(displayMode);
    }



    public void run(DisplayMode displayMode) {
        setBackground(Color.white);
        setForeground(Color.blue);
        setFont(new Font("Dialog", 0, 24));

        SimpleScreenManager screen = new SimpleScreenManager();
        try {
            screen.setFullScreen(displayMode, this);
            try {
                Thread.sleep(DEMO_TIME);
            }
            catch (InterruptedException ex) { }
        }
        finally {
            screen.restoreScreen();
        }
    }

// this function draws to the screen
    public void paint(Graphics g) {
        Image bgImage;
        bgImage = loadImage("images/antialiased.png");
        g.drawImage(bgImage, 50, 50, null);

        g.drawString("ECE308 Game", 20, 50);



    }


    private Image loadImage(String fileName) {
        return new ImageIcon(fileName).getImage();
    }



}
