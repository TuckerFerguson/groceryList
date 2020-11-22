import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
public class groceryList{
    public static void main(String[] args){
        //JComponents
        JFrame frame = new JFrame();
        JPanel pane = new JPanel();
        JLabel title = new JLabel(" -`ღ´- -`ღ´- Grocery List -`ღ´- -`ღ´-");
        Color taco = new Color(230,230,250);

        title.setFont(new Font("Helvetica",Font.BOLD,28));
        title.setVerticalAlignment(1);
        title.setHorizontalAlignment(0);
      
        frame.setSize(600,700);
        pane.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, taco));
        pane.setLayout(new GridLayout(10,0));
        pane.add(title);
        
        //checklist cell
        JCheckBox check1 = new JCheckBox();
        JCheckBox check2 = new JCheckBox();
        JCheckBox check3 = new JCheckBox();
        JCheckBox check4 = new JCheckBox();
        JCheckBox check5 = new JCheckBox();
        JCheckBox check6 = new JCheckBox();
        JCheckBox check7 = new JCheckBox();
        JCheckBox check8 = new JCheckBox();
        JCheckBox check9 = new JCheckBox();
        
        //checklist element formatting
        check1.setBackground(new Color(176,124,218));
        check2.setBackground(new Color(209,178,234));
        check3.setBackground(new Color(176,124,218));
        check4.setBackground(new Color(209,178,234));
        check5.setBackground(new Color(176,124,218));
        check6.setBackground(new Color(209,178,234));
        check7.setBackground(new Color(176,124,218));
        check8.setBackground(new Color(209,178,234));
        check9.setBackground(new Color(176,124,218));

        check1.setHorizontalAlignment(SwingConstants.LEFT);
        check2.setHorizontalAlignment(SwingConstants.LEFT);
        check3.setHorizontalAlignment(SwingConstants.LEFT);
        check4.setHorizontalAlignment(SwingConstants.LEFT);
        check5.setHorizontalAlignment(SwingConstants.LEFT);
        check6.setHorizontalAlignment(SwingConstants.LEFT);
        check7.setHorizontalAlignment(SwingConstants.LEFT);
        check8.setHorizontalAlignment(SwingConstants.LEFT);
        check9.setHorizontalAlignment(SwingConstants.LEFT);

        
        //adding pane containing checklist elements to the JFrame base canvas
        frame.add(pane);
        pane.setBackground(new Color(255,253,208));
       
        //add day of week at end
        pane.add(check1);
        pane.add(check2);
        pane.add(check3);
        pane.add(check4);
        pane.add(check5);
        pane.add(check6);
        pane.add(check7);
        pane.add(check8);
        pane.add(check9);
        
        pane.setBackground(new Color(230,230,250));
        //frame.setBackground();
        //frame.addFocusListener()
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }
}