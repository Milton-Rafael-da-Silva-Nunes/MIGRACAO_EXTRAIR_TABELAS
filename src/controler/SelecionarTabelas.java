package controler;

import static janelas_principais.TelaExtrair_GUI.CATEGORIA;
import static janelas_principais.TelaExtrair_GUI.CEST;
import static janelas_principais.TelaExtrair_GUI.CLIENTE;
import static janelas_principais.TelaExtrair_GUI.ESTOQUE;
import static janelas_principais.TelaExtrair_GUI.FABRICANTE;
import static janelas_principais.TelaExtrair_GUI.FORNECEDOR;
import static janelas_principais.TelaExtrair_GUI.GRUPOTRIB;
import static janelas_principais.TelaExtrair_GUI.NCM;
import static janelas_principais.TelaExtrair_GUI.PAGAR;
import static janelas_principais.TelaExtrair_GUI.PRODUTO;
import static janelas_principais.TelaExtrair_GUI.RECEBER;
import static janelas_principais.TelaExtrair_GUI.SUBCATEG;
import static janelas_principais.TelaExtrair_GUI.UNIDADE;
import static janelas_principais.TelaExtrair_GUI.LOTE;
import static janelas_principais.TelaExtrair_GUI.FORMAPAGAMENTO;

import javax.swing.JOptionPane;

public class SelecionarTabelas {

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
        LOTE.setSelected(true);
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
        LOTE.setSelected(false);
        FORMAPAGAMENTO.setSelected(false);
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
                || ESTOQUE.isSelected()
                || LOTE.isSelected()
                || FORMAPAGAMENTO.isSelected()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "<html><b>ERRO</b>\nPor favor, selecione uma tabela.",
                    "Erro Menssagem", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

}
