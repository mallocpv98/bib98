package controllers;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import DAO.UserDAO;
import models.Bibliotecaria;
import models.User;
import view.LibrarianOptionView;
import view.LoginView;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

	
		public class LoginController extends Controller{
			
			private final LoginView l;
			
		//	private Conto c;
			
			public LoginController(LoginView l) {
				this.l = l;
				setListeners();
			}
			public void setListeners() {
				
				l.getLoginButton().addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						
						Bibliotecaria u = new Bibliotecaria("", "",
															null, null, "", 0, 0,
															l.getStringEmail(), "",
															l.getIdField(),
															l.getPasswordField().toString());
						
						try {
							if(facade.login(u.getEmail(), u.getPassword(), u.getPassword())== false)
							{
								JOptionPane.showMessageDialog(l, "credenziali errate" , "login",JOptionPane.INFORMATION_MESSAGE);
							}
							else {
								l.dispose();
								LibrarianOptionController libc = new LibrarianOptionController(mv.getlLibrarianOptionView() );
								libc.mv.getInstance();
							}
						}
						catch (HeadlessException | SQLException e1) {
							e1.printStackTrace();
						}
						
					}
				});
			}
			
	}
	