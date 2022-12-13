package com.controler;

import com.janelas.principais.TelaLogin_view;

public class ValidarLogin {

    public static boolean login() {
        String usuario = (String) TelaLogin_view.cbLogin.getSelectedItem();
        String senha = TelaLogin_view.pfSenha.getText();

        return usuario.equalsIgnoreCase("admin") && senha.equals("a");
        // RETORNA true SE USUARIO E SENHA FOR ESSES.
    }

}
