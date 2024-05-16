package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.sql.RowSetListener;

import view.LibrarianOptionView;

public class LibrarianOptionController extends Controller {
	
	private final LibrarianOptionView l1;
	
	
	public LibrarianOptionController(LibrarianOptionView l1) {
		this.l1=l1;
		setListeners() ;
		
	}
	

	public void setListeners() {
		
		l1.getRicercamodificaButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.dispose();
				// da mettere controller
			}
		});;
		l1.getAggiungiPrestabile().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.dispose();
			}
		});
/*		l1.getAggiungiUtente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.dispose();
			}
		}); */
	/*	l1.getModificaUtente().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.dispose();
			}
		});  */
	/*	l1.getRitiraPrestabile().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				l1.dispose();
			}
		}); */
		l1.getChiudiButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					l1.dispose();
			}
		});
	}
}
