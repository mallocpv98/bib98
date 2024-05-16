package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Libro;
import view.RicercaView;

public class RicercaController extends Controller{
		
	private final RicercaView r;
	
	public RicercaController(RicercaView r) {
		this.r=r;
		setListeners(); 
	}
	public void setListeners() {
			
			r.getRicercaButton().addActionListener( new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					Libro lib = new Libro(r.getAutoreField(), null, null, null, null, 0, null, null)
					
				}
			});
		}
	}

