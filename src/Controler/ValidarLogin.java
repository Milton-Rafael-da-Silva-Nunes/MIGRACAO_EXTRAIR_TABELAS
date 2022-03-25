package Controler;

public class ValidarLogin {

    public static boolean login() {

        String usuario = (String) View.TelaLogin_GUI.cbLogin.getSelectedItem();
        String senha = View.TelaLogin_GUI.pfSenha.getText();

        return usuario.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("a");
        // RETORNA true SE USUARIO E SENHA FOR ESSES.

    }

}
