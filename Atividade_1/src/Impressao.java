public class Impressao {
    int idAluno, nPaginas;
    String nomeDoArquivo;

    public Impressao(int idAluno, String nomeDoArquivo, int nPaginas) {
        this.idAluno = idAluno;
        this.nomeDoArquivo = nomeDoArquivo;
        this.nPaginas = nPaginas;
    }

    public String toString() {
        return "ID Aluno - " + idAluno + "\nNome do Arquivo - " + nomeDoArquivo + "\nNumero de páginas - " + nPaginas;
    }

}
