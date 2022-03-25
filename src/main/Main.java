package main;

import Controler.DiretorioPasta;
import View_Controler.TelaIniciandoSistema;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        new TelaIniciandoSistema().setVisible(true);
        
        // METODO DE CRIAR PASTA PARA RECEBER TABELAS.
        DiretorioPasta.CriarPasta();
        
        
    }
    
}
