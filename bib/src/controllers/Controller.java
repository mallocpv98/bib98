package controllers;

import DAO.DBFacade;
import view.PrimeView;

public abstract class Controller {
		
		protected PrimeView mv = PrimeView.getInstance();
		
		protected DBFacade facade = DBFacade.getInstance();
		
		public Controller() {
		}
		
	}
