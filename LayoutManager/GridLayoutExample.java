import java.awt.*;

// GridLayout arranges components in a grid with a specified number of rows and columns. Each cell in the grid can hold a component.
// This layout manager is ideal for creating a uniform grid of components, such as a calculator or a game board.

public class GridLayoutExample {
    Frame f;
    Button b1, b2, b3, b4;
    GridLayoutExample(){
        // Create a frame with a title
        f = new Frame("GridLayout Example");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // GridLayout manager
        f.setLayout(new GridLayout(2,2));
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
