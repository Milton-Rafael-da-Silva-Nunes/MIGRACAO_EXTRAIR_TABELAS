package Controler;

// IMPORT CLASSES
import Model.Categoria;
import Model.Cest;
import Model.Cliente;
import Model.Estoque;
import Model.Fabricante;
import Model.Fornecedor;
import Model.GrupoTributacao;
import Model.Ncm;
import Model.Pagar;
import Model.Produto;
import Model.Receber;
import Model.SubCategoria;
import Model.Unidade;

// IMPORT DOS COMPONENTES DA TELA
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


public class GerarArquivos {

    public static void ExtrairTabelas() {

        if (PRODUTO.isSelected()) {
            try {
                Produto.ExtrairTabelaProduto();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Produto Config Rede.txt: " + erro.getMessage());

            }

        }
        if (UNIDADE.isSelected()) {
            try {
                Unidade.ExtrairTabelaUnidade();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Unidade Config Rede.txt: " + erro.getMessage());

            }

        }
        if (CATEGORIA.isSelected()) {
            try {
                Categoria.ExtrairTabelaCategoria();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Categoria Config Rede.txt: " + erro.getMessage());

            }

        }
        if (SUBCATEG.isSelected()) {
            try {
                SubCategoria.ExtrairTabelaSubCategoria();

            } catch (Exception erro) {
                System.out.println("Erro Tabela SubCategoria Config Rede.txt: " + erro.getMessage());

            }

        }
        if (FABRICANTE.isSelected()) {
            try {
                Fabricante.ExtrairTabelaFabricante();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Fabricante Config Rede.txt: " + erro.getMessage());

            }

        }
        if (FORNECEDOR.isSelected()) {
            try {
                Fornecedor.ExtrairTabelaFornecedor();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Fornecedor Config Rede.txt: " + erro.getMessage());

            }

        }
        if (NCM.isSelected()) {
            try {
                Ncm.ExtrairTabelaNcm();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Ncm Config Rede.txt: " + erro.getMessage());

            }

        }
        if (CEST.isSelected()) {
            try {
                Cest.ExtrairTabelaCest();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Cest Config Rede.txt: " + erro.getMessage());

            }

        }
        if (GRUPOTRIB.isSelected()) {
            try {
                GrupoTributacao.ExtrairTabelaGrupoTributacao();

            } catch (Exception erro) {
                System.out.println("Erro Tabela GrupoTributação Config Rede.txt: " + erro.getMessage());

            }

        }
        if (CLIENTE.isSelected()) {
            try {
                Cliente.ExtrairTabelaCliente();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Cliente Config Rede.txt: " + erro.getMessage());

            }

        }
        if (RECEBER.isSelected()) {
            try {
                Receber.ExtrairTabelaReceber();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Receber Config Rede.txt: " + erro.getMessage());

            }

        }
        if (PAGAR.isSelected()) {
            try {
                Pagar.ExtrairTabelaPagar();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Pagar Config Rede.txt: " + erro.getMessage());

            }

        }
        if (ESTOQUE.isSelected()) {
            try {
                Estoque.ExtrairTabelaAjusteEstoque();

            } catch (Exception erro) {
                System.out.println("Erro Tabela AjusteEstoque Config Rede.txt: " + erro.getMessage());

            }
            try {
                Estoque.ExtrairTabelaEstoque();

            } catch (Exception erro) {
                System.out.println("Erro Tabela Estoque Config Rede.txt: " + erro.getMessage());

            }
            try {
                Estoque.ExtrairTabelaEstoqueSaldo();

            } catch (Exception erro) {
                System.out.println("Erro Tabela EstoqueSaldo Config Rede.txt: " + erro.getMessage());

            }

        }

    }

}
