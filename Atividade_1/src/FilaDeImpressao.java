import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;

class FilaDeImpressao {
    private Queue<Impressao> fila;

    public FilaDeImpressao() {
        fila = new LinkedList<>();
    }

    public void addTrabalho(Impressao trabalho) {
        fila.add(trabalho);
    }

    public Impressao imprimeProximo() {
        if (fila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A fila está vazia.");
            return null;
        }
        return fila.poll();
    }


    public void exibirFila() {
        if (fila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A fila está vazia.");
            return;
        }
        JOptionPane.showMessageDialog(null, "Trabalhos na fila:");
        for (Impressao trabalho : fila) {
            JOptionPane.showMessageDialog(null, trabalho);
        }
    }


}
