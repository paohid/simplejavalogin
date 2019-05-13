package com.googlly;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class logInApplication extends JFrame {

    String message = "Log In Window";
    ImageIcon icon;


    public logInApplication() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 450);
        setLocationRelativeTo(null);
        setTitle(message);
        setLayout(null);

        Container con = getContentPane();
        con.setBackground(Color.PINK);

        JLabel bgLabel = new JLabel();
        icon = new ImageIcon("image/Amazing.jpg");
        setIconImage(icon.getImage());

        bgLabel.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight());
        bgLabel.setIcon(icon);
        con.add(bgLabel);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 130, 170, 40);
        usernameLabel.setFont(new Font("Lucida Console", Font.ITALIC, 20));
        usernameLabel.setForeground(Color.PINK);
        bgLabel.add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 180, 170, 40);
        passwordLabel.setFont(new Font("Lucida Console", Font.ITALIC, 20));
        passwordLabel.setForeground(Color.PINK);
        bgLabel.add(passwordLabel);

        JTextField textField = new JTextField();
        textField.setBounds(170, 120, 250, 40);
        textField.setFont(new Font("Lucida Console", Font.ITALIC, 20));
        textField.requestFocus();
        bgLabel.add(textField);

        JPasswordField textPwdField = new JPasswordField();
        textPwdField.setBounds(170, 170, 250, 40);
        textPwdField.setFont(new Font("Lucida Console", Font.ITALIC, 20));
        textPwdField.requestFocus();
        bgLabel.add(textPwdField);

        JButton btnSubmit = new JButton();
        btnSubmit.setText("SUBMIT");
        btnSubmit.setToolTipText("Click to Submit");
        btnSubmit.setBounds(230, 220, 120, 40);
        bgLabel.add(btnSubmit);

        btnSubmit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(con, "Successfully logged in");

            }
        });


        setResizable(true);

    }


    public void getFrame() {

}

    public static void main(String...args){
        new logInApplication().getFrame();
    }
}
