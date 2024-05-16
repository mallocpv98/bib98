package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField emailField;
    private JTextField passwordField;
    private JTextField idField;
    private JButton loginButton;

    public LoginView() {
        setLayout(new BorderLayout());
        setSize(300,200);
      
        JPanel northPanel = new JPanel();
        add(northPanel, BorderLayout.NORTH);
        
        northPanel.add(new JLabel("login:"));
        
        JPanel westPanel = new JPanel();
        add(westPanel, BorderLayout.WEST);
        westPanel.setLayout(new GridLayout());
        
        westPanel.add(new JLabel("email:"));
        westPanel.add(new JLabel("password:"));
        westPanel.add(new JLabel("id:"));
        
        JPanel centralPanel = new JPanel();
        add(centralPanel , BorderLayout.CENTER);
        
        emailField= new JTextField();
        centralPanel.add(emailField);
        emailField.setColumns(10);
        
        passwordField = new JTextField();
        centralPanel.add(passwordField);
        passwordField.setColumns(10);
        
        idField = new JTextField();
        centralPanel.add(idField);
        idField.setColumns(10);
        
        
        JPanel southPanel = new JPanel();
        add(southPanel , BorderLayout.SOUTH);
        
        add(new JLabel(" "));
        
        loginButton = new JButton("login");
        loginButton.setActionCommand("login");
        southPanel.add(loginButton);
        
        
        
    }

	public JTextField getEmailField() {
		return emailField;
	}


	public void setPasswordField(JTextField passwordField) {
		this.passwordField = passwordField;
	}


	public void setStringEmail() {
		emailField.setText(null);
	}
	public String getStringEmail() {
		return emailField.getText();
	}

	public void SetIdField () {
		idField.setText(null);
		
	}
	public String getIdField() {
		return idField.getText();
	}
	public String getPasswordField() {
		return passwordField.getText();
	}

	
	public JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
	}
    }
