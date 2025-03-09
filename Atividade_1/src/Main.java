import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Imagine que você está desenvolvendo um sistema de gerenciamento de impressão para uma universidade. Os
        //alunos podem enviar trabalhos para impressão, e a impressora os processa na ordem em que foram recebidos.

        FilaDeImpressao filaDeImpressao = new FilaDeImpressao();

        while (true) {

            String menu = JOptionPane.showInputDialog(" ----- Gerenciador de Impressão ----- \nEscolha uma opção: \n\n1 - Adicionar Trabalho\n2 - Imprimir Próximo Trabalho\n3 - Exibir Fila\n4 - Sair ");

            int opcao = Integer.parseInt(menu);

            switch (opcao) {
                case 1:

                    String aluno = JOptionPane.showInputDialog("Informe o ID do aluno: ");
                    int idAluno = Integer.parseInt(aluno);
                    String nomeDoArquivo = JOptionPane.showInputDialog("Informe o nome do arquivo: ");
                    String paginas = JOptionPane.showInputDialog("Informe o número de páginas: ");
                    int nPaginas = Integer.parseInt(paginas);

                    Impressao trabalho = new Impressao(idAluno, nomeDoArquivo, nPaginas);
                    filaDeImpressao.addTrabalho(trabalho);
                    JOptionPane.showMessageDialog(null, "Trabalho adicionado à fila.");
                    break;

                case 2:
                    Impressao proximoTrabalho = filaDeImpressao.imprimeProximo();
                    if (proximoTrabalho != null) {
                        JOptionPane.showMessageDialog(null, "Imprimindo:\n"+proximoTrabalho);
                    }
                    break;

                case 3:
                     filaDeImpressao.exibirFila();
                    break;

                case 4:
                    int confirm = JOptionPane.showConfirmDialog(null, "Deseja encerrar o programa?");
                    if (confirm == JOptionPane.YES_OPTION){
                        return;
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }


        }
    }

}