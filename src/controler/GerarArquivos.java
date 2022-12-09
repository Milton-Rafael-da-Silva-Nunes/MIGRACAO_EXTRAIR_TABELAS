package controler;

// IMPORT CLASSES
import model.Categoria;
import model.Cest;
import model.Cliente;
import model.Estoque;
import model.Fabricante;
import model.Fornecedor;
import model.GrupoTributacao;
import model.Ncm;
import model.Pagar;
import model.Produto;
import model.Receber;
import model.SubCategoria;
import model.Unidade;
import model.Lote;
import model.FormaPagamento;

// IMPORT DOS COMPONENTES DA TELA
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
        if(LOTE.isSelected()) {
            try {
                Lote.ExtrairTabelaLote();
                
            } catch (Exception erro) {
                System.out.println("Erro Tabela Lote Config Rede.txt: " + erro.getMessage());
            }
            try {
                Lote.ExtrairTabelaLoteDet();
            } catch (Exception erro) {
                System.out.println("Erro Tabela LoteDet Config Rede.txt: " + erro.getMessage());
                
            }
        }
        if(FORMAPAGAMENTO.isSelected()) {
            try {
                FormaPagamento.ExtrairFormaPagamento();
                
            } catch (Exception erro) {
                System.out.println("Erro Tabela Pagamento Config Rede.txt: " + erro.getMessage());
            }
        }
        
    }
}
