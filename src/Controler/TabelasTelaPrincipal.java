package Controler;

import static View.TelaPrincipal_GUI.CATEGORIA;
import static View.TelaPrincipal_GUI.CEST;
import static View.TelaPrincipal_GUI.CLIENTE;
import static View.TelaPrincipal_GUI.ESTOQUE;
import static View.TelaPrincipal_GUI.FABRICANTE;
import static View.TelaPrincipal_GUI.FORNECEDOR;
import static View.TelaPrincipal_GUI.GRUPOTRIB;
import static View.TelaPrincipal_GUI.NCM;
import static View.TelaPrincipal_GUI.PAGAR;
import static View.TelaPrincipal_GUI.PRODUTO;
import static View.TelaPrincipal_GUI.RECEBER;
import static View.TelaPrincipal_GUI.SUBCATEG;
import static View.TelaPrincipal_GUI.UNIDADE;

import javax.swing.JOptionPane;

public class TabelasTelaPrincipal {

    public static void MarcarTabelas() {

        PRODUTO.setSelected(true);
        UNIDADE.setSelected(true);
        CATEGORIA.setSelected(true);
        SUBCATEG.setSelected(true);
        FABRICANTE.setSelected(true);
        FORNECEDOR.setSelected(true);
        NCM.setSelected(true);
        CEST.setSelected(true);
        GRUPOTRIB.setSelected(true);
        ESTOQUE.setSelected(true);
        CLIENTE.setSelected(true);
        RECEBER.setSelected(true);
        PAGAR.setSelected(true);

    }

    public static void DesmarcarTabelas() {

        PRODUTO.setSelected(false);
        UNIDADE.setSelected(false);
        CATEGORIA.setSelected(false);
        SUBCATEG.setSelected(false);
        FABRICANTE.setSelected(false);
        FORNECEDOR.setSelected(false);
        NCM.setSelected(false);
        CEST.setSelected(false);
        GRUPOTRIB.setSelected(false);
        ESTOQUE.setSelected(false);
        CLIENTE.setSelected(false);
        RECEBER.setSelected(false);
        PAGAR.setSelected(false);

    }

    public static boolean ValidarTabelasSelecionadas() {

        if (PRODUTO.isSelected()
                || UNIDADE.isSelected()
                || CATEGORIA.isSelected()
                || SUBCATEG.isSelected()
                || FABRICANTE.isSelected()
                || FORNECEDOR.isSelected()
                || NCM.isSelected()
                || CEST.isSelected()
                || GRUPOTRIB.isSelected()
                || CLIENTE.isSelected()
                || RECEBER.isSelected()
                || PAGAR.isSelected()
                || ESTOQUE.isSelected()) {

            return true;

        } else {
            JOptionPane.showMessageDialog(null, "<html><b>ERRO</b>\nPor favor, selecione uma tabela.",
                    "Erro Menssagem", JOptionPane.ERROR_MESSAGE);

        }
        return false;

    }

}
