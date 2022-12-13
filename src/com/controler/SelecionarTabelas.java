package com.controler;

import static com.janelas.principais.TelaExtrair_view.CATEGORIA;
import static com.janelas.principais.TelaExtrair_view.CEST;
import static com.janelas.principais.TelaExtrair_view.CLIENTE;
import static com.janelas.principais.TelaExtrair_view.ESTOQUE;
import static com.janelas.principais.TelaExtrair_view.FABRICANTE;
import static com.janelas.principais.TelaExtrair_view.FORNECEDOR;
import static com.janelas.principais.TelaExtrair_view.GRUPOTRIB;
import static com.janelas.principais.TelaExtrair_view.NCM;
import static com.janelas.principais.TelaExtrair_view.PAGAR;
import static com.janelas.principais.TelaExtrair_view.PRODUTO;
import static com.janelas.principais.TelaExtrair_view.RECEBER;
import static com.janelas.principais.TelaExtrair_view.SUBCATEG;
import static com.janelas.principais.TelaExtrair_view.UNIDADE;
import static com.janelas.principais.TelaExtrair_view.LOTE;
import static com.janelas.principais.TelaExtrair_view.FORMAPAGAMENTO;

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
