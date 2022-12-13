import com.controler.Diretorio;
import com.janelas.controler.TelaIniciandoSistema;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
       new TelaIniciandoSistema().setVisible(true);
        // METODO DE CRIAR PASTA PARA RECEBER TABELAS.
        Diretorio.CriarPasta();
        
    }
    
}
