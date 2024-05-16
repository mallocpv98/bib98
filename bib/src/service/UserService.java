package service;

import DAO.*;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean verificaLogin(String email, String password) {
        return userDAO.verificaLogin(email, password);
    }

    // Altri metodi del UserService per la gestione degli utenti possono essere aggiunti qui
}
