// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JMenuItem;
// import javax.swing.JPopupMenu;
// import java.awt.event.MouseEvent;
import java.awt.event.*;
// import java.awt.event.EventListener;
import java.awt.*;
import javax.swing.*;

public class ChangingProperties {

  private JFrame frame;
  private JLabel label;
  private JPanel panel;

  class showList {

    private JMenuItem First;
    private JMenuItem Properties;
    private JMenuItem Third;

    public showList() {

      First = new JMenuItem("First");
      Properties = new JMenuItem("Properties");
      Third = new JMenuItem("Third");

      Properties.addActionListener(new ActionListener() {

        public void actionPerformed(ActionEvent e) {
          propertiesClick();
        }
      });
    }
  }

  class RightClickListener extends MouseAdapter {

    public void Pop(MouseEvent e) {
      showList list = new showList();
      list.show(e.getComponent(), e.getX(), e.getY());
    }

    public void mousePressed(MouseEvent e) {

      if(e.isPopupTrigger())
        Pop(e);
    }

    public void mouseReleased(MouseEvent e) {

      if(e.isPopupTrigger())
        Pop(e);
    }
  }

  public void propertiesClick() {

  }
  
  public ChangingProperties() {
    frame = new JFrame();
    label = new JLabel("Changing Properties");
    panel = new JPanel();
    frame.setTitle("Part - A(1)");
    frame.setSize(300, 400);
    frame.setResizable(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setLayout(new GridBagLayout());
    label.addMouseListener(new RightClickListener());
    panel.add(label);
    frame.add(panel);
    frame.setVisible(true);
  }

  public static void main(String[] args){
    new ChangingProperties();
  }
}

