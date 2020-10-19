/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 *
 * @author Radagea
 */
public class Login extends JFrame {

    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;

    private JButton bt;

    private JTextField tf1;
    private JTextField tf2;

    public Login(String string) throws HeadlessException {
        super(string);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        this.lb1 = new JLabel("Felhasználónév:");
        this.lb2 = new JLabel("Jelszó:");
        this.lb3 = new JLabel("IUiiii");

        this.bt = new JButton("OK");
        this.tf1 = new JTextField(20);
        this.tf2 = new JTextField(20);
        //++++++++++++++++++++++++++++++++
        FlowLayout fl   = new FlowLayout();
        setLayout(fl);
        //+++++++++++++++++++++++++++++++++++
        
        add(lb1);
        add(tf1);
        add(lb2);
        add(tf2);
        add(bt);
        add(lb3);
        
        pack();
        

    }

    public static void main(String[] args) {
        Login l = new Login("Login Hurrá");
    }

}
