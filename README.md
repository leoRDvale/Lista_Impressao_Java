# Lista_Impressao_Java
Gerenciamento de Impressão


#Contexto

Imagine que você está desenvolvendo um sistema de gerenciamento de impressão para uma universidade. Os
alunos podem enviar trabalhos para impressão, e a impressora os processa na ordem em que foram recebidos.

#Tarefa

1. Implemente uma fila para simular a fila de impressão. Cada trabalho de impressão deve ser representado por um
objeto contendo:
ID do aluno: um número inteiro que identifica o aluno que enviou o trabalho.
Nome do arquivo: uma string com o nome do arquivo a ser impresso.
Número de páginas: um número inteiro representando o número de páginas do trabalho.
2. Crie as seguintes operações para a fila:
Adicionar trabalho (enqueue): Adiciona um novo trabalho à fila de impressão.
Imprimir próximo trabalho (dequeue): Remove e retorna o próximo trabalho da fila para ser impresso.
Verificar fila vazia: Retorna verdadeiro se a fila estiver vazia, falso caso contrário.
Exibir fila: Exibe todos os trabalhos na fila de impressão na ordem em que foram recebidos.
3. Simule o processo de impressão:
- Permita que o usuário adicione trabalhos à fila de impressão.
- Permita que o usuário simule a impressão do próximo
