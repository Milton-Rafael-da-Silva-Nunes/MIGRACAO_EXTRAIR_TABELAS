package com.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class FormaPagamento {
    
    public static void ExtrairFormaPagamento() throws Exception {
        
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
            Runtime.getRuntime().exec("cmd.exe /c mysqldump --host=localhost --user=root --password=" + senha + " " + banco + " pagamento > C:\\1-TABELAS\\pagamento.sql");
        }catch (IOException erro) {
            System.out.println(erro.getMessage());
        }
    }
}
