package application;

public class Main
{
    public static void main(String[] args)
    {
        Instrucoes instrucoes = new Instrucoes();

        instrucoes.criarNovaTarefa("Acordar com o alarme pré-configurado");
        instrucoes.criarNovaTarefa("Levantar da cama");
        instrucoes.criarNovaTarefa("Cumprimentar a família");
        instrucoes.criarNovaTarefa("Tomar banho");
        instrucoes.criarNovaTarefa("Escovar os dentes");
        instrucoes.criarNovaTarefa("Vestir a roupa do trabalho");
        instrucoes.criarNovaTarefa("Calçar o tênis");
        instrucoes.criarNovaTarefa("Arrumar a mochila");
        instrucoes.criarNovaTarefa("Pegar a marmita e preparar");
        instrucoes.criarNovaTarefa("Tomar café da manhã");
        instrucoes.criarNovaTarefa("Despedir da família");
        instrucoes.criarNovaTarefa("Ir para o metrô");
        instrucoes.criarNovaTarefa("Chegar vivo no trabalho e codar");

        System.out.println("Primeiro passo que foi removido: " + instrucoes.removerTarefaExistente());
        System.out.println("Segundo passo que foi removido: " + instrucoes.removerTarefaExistente());

        if (instrucoes.tarefaFoiConcluida())
        {
            System.out.println("A tarefa foi concluída.");
        }
        else
        {
            System.out.println("A tarefa não foi concluída.");
        }
    }
}
