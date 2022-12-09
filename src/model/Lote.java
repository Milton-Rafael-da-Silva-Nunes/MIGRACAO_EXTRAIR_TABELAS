package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafael Nunes
 */
public class Lote {
    
    public static void ExtrairTabelaLote() throws Exception {
        
        String linha;
        String ip = "";
        String banco = "";
        String senha = "";
        
        File file = new File(System.getProperty("user.dir") + "\\rede.txt");
        
        if(!file.exists()) {
            JOptionPane.showMessageDialog(null, "Caminho Rede.txt não encontrado.");
            
        } else if(file.length() == 0) {
            JOptionPane.showMessageDialog(null, "Arquivo Rede.txt esta vazio.");
            
        } else {
            
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            
            while ((linha = bf.readLine()) != null) {

                String[] split = linha.split(":");

                if (split[0].equalsIgnoreCase("IP")) {
                    ip = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("DB")) {
                    banco = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("KEY")) {
                    senha = (linha.split(":")[1]);

                }
            }
        }
        
        try {
            Runtime.getRuntime().exec("cmd.exe /c mysqldump --host=localhost --user=root --password=" + senha + " " + banco + " lote > C:\\1-TABELAS\\lote.sql");
                    
            System.out.println(senha + " " + banco);
        }catch (IOException erro) {
            System.out.println(erro.getMessage());

        }
    }
    
    public static void ExtrairTabelaLoteDet() throws Exception {
        
        String linha;
        String ip = "";
        String banco = "";
        String senha = "";
        
        File file = new File(System.getProperty("user.dir") + "\\rede.txt");
        
        if(!file.exists()) {
            JOptionPane.showMessageDialog(null, "Caminho Rede.txt não encontrado.");
            
        } else if(file.length() == 0) {
            JOptionPane.showMessageDialog(null, "Arquivo Rede.txt esta vazio.");
            
        } else {
            
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            
            while ((linha = bf.readLine()) != null) {

                String[] split = linha.split(":");

                if (split[0].equalsIgnoreCase("IP")) {
                    ip = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("DB")) {
                    banco = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("KEY")) {
                    senha = (linha.split(":")[1]);

                }
            }
        }
        
        try {
            Runtime.getRuntime().exec("cmd.exe /c mysqldump --host=localhost --user=root --password=" + senha + " " + banco + " lotedet > C:\\1-TABELAS\\lotedet.sql");
                    
            System.out.println(senha + " " + banco);
        }catch (IOException erro) {
            System.out.println(erro.getMessage());

        }
    }
}