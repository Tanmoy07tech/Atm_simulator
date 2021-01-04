import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;
public class Signup extends JFrame implements ActionListener{

    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JComboBox c1,c2,c3;

    Random ran=new Random();
    long first4=(ran.nextLong()%9000L)+1000L;
    long first=Math.abs(first4);

    Signup(){

        setFont(new Font("System",Font.BOLD,22));
        Font f=getFont();
        FontMetrics fm=getFontMetrics(f);

        int x=fm.stringWidth("NEW APPLICATION FORM");
        int y=fm.stringWidth(" ");
        int z=getWidth()-x;
        int w=z/y;
        String pad="";

        pad=String.format("%"+w+"s",pad);
        setTitle(pad+"NEW ACCOUNT APPLICATION FORM");


        l1=new JLabel("APPLICATION FORM NO."+first);
        l1.setFont(new Font("Raleway",Font.BOLD,38));


        l2=new JLabel("PAGE 1:Personal Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));



        

    }
    
}
