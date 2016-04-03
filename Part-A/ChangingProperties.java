// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JMenuItem;
// import javax.swing.JPopupMenu;
// import java.awt.event.MouseEvent;
// import java.awt.event.MouseAdapter;
// import java.awt.event.EventListener;
import java.awt.*;
import javax.swing.*;

public class ChangingProperties extends JFrame{

  MouseListener ml = new MouseListener() {
        @Override
        public void mouseReleased(MouseEvent e) {System.out.println("Released!");}

        @Override
        public void mousePressed(MouseEvent e) {System.out.println("Pressed!");}

        @Override
        public void mouseExited(MouseEvent e) {System.out.println("Exited!");}

        @Override
        public void mouseEntered(MouseEvent e) {System.out.println("Entered!");}

        @Override
        public void mouseClicked(MouseEvent e) {System.out.println("Clicked!");}
    };

  JLabel label = new JLabel("Changing Properties", SwingConstants.CENTER);
  public static void main(String[] args){
    new ChangingProperties();
  }
  
  public ChangingProperties(){
    super("Xcos on Desktop");
    setSize(300, 400);
    setResizable(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    add(label);
    setVisible(true);
  }
}

