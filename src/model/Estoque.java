package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Rafael Nunes
 */
public class Estoque {

    public static void ExtrairTabelaEstoque() throws Exception {

        String linha;
        String banco = "";
        String senha = "";
        String ad = "";

        File file = new File(System.getProperty("user.dir") + "\\rede.txt");

        if (!file.exists()) {
            System.out.println("Caminho não existe");

        } else if (file.length() == 0) {
            System.out.println("rede.txt esta mal configurado");

        } else {

            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            while ((linha = bf.readLine()) != null) {

                String[] split = linha.split(":");

                if (split[0].equalsIgnoreCase("DB")) {
                    banco = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("KEY")) {
                    senha = (linha.split(":")[1]);

                }
            }
        }

        try {
            Runtime.getRuntime().exec("cmd.exe /c mysqldump --host=localhost --user=root --password=" + senha + " " + banco + " estoque > C:\\1-TABELAS\\estoque.sql");
        } catch (IOException erro) {
            System.out.println(erro.getMessage());
        }
    }

    public static void ExtrairTabelaEstoqueSaldo() throws Exception {

        String linha;
        String banco = "";
        String senha = "";

        File file = new File(System.getProperty("user.dir") + "\\rede.txt");

        if (!file.exists()) {
            System.out.println("Caminho não existe");

        } else if (file.length() == 0) {
            System.out.println("rede.txt esta mal configurado");

        } else {

            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            while ((linha = bf.readLine()) != null) {

                String[] split = linha.split(":");

                if (split[0].equalsIgnoreCase("DB")) {
                    banco = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("KEY")) {
                    senha = (linha.split(":")[1]);
                }
            }
        }

        try {
            Runtime.getRuntime().exec("cmd.exe /c mysqldump --host=localhost --user=root --password=" + senha + " " + banco + " estoquesaldo > C:\\1-TABELAS\\estoquesaldo.sql");
        } catch (IOException erro) {
            System.out.println(erro.getMessage());

        }
    }

    public static void ExtrairTabelaAjusteEstoque() throws Exception {

        String linha;
        String banco = "";
        String senha = "";

        File file = new File(System.getProperty("user.dir") + "\\rede.txt");

        if (!file.exists()) {
            System.out.println("Caminho não existe");

        } else if (file.length() == 0) {
            System.out.println("rede.txt esta mal configurado");

        } else {

            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);

            while ((linha = bf.readLine()) != null) {

                String[] split = linha.split(":");

                if (split[0].equalsIgnoreCase("DB")) {
                    banco = (linha.split(":")[1]);

                }
                if (split[0].equalsIgnoreCase("KEY")) {
                    senha = (linha.split(":")[1]);

                }
            }
        }

        try {
            Runtime.getRuntime().exec("cmd.exe /c mysqldump --host=localhost --user=root --password=" + senha + " " + banco + " ajusteestoque > C:\\1-TABELAS\\ajusteestoque.sql");
        } catch (IOException erro) {
            System.out.println(erro.getMessage());
        }
    }
}
