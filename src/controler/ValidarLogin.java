package controler;

public class ValidarLogin {

    public static boolean login() {
        String usuario = (String) janelas_principais.TelaLogin_GUI.cbLogin.getSelectedItem();
        String senha = janelas_principais.TelaLogin_GUI.pfSenha.getText();

        return usuario.equalsIgnoreCase("admin") && senha.equals("a");
        // RETORNA true SE USUARIO E SENHA FOR ESSES.
    }

}
