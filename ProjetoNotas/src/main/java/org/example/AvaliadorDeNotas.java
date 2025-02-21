package org.example;

public class AvaliadorDeNotas {

    // Método que classifica a nota do estudante e retorna uma string com a classificação
    public static String classificarNota(double nota) {
        // Verifica se a nota está fora do intervalo permitido (0 a 100)
        if (nota < 0 || nota > 100) {
            throw new IllegalArgumentException("Nota inválida! A nota deve estar entre 0 e 100.");
        }

        // Classificação das notas de acordo com os intervalos definidos
        if (nota >= 90) {
            return "Excelente";
        } else if (nota >= 75) {
            return "Bom";
        } else if (nota >= 50) {
            return "Regular";
        } else if (nota >= 30) {
            return "Insuficiente";
        } else {
            return "Reprovado";
        }
    }

    // Método que gera uma mensagem de acordo com a classificação da nota
    public static String gerarMensagem(double nota) {
        // Obtém a classificação da nota
        String classificacao = classificarNota(nota);

        // Retorna uma mensagem específica dependendo da classificação
        switch (classificacao) {
            case "Excelente":
                return "Parabéns! Você está com desempenho excelente!";
            case "Bom":
                return "Seu desempenho foi bom! Continue assim!";
            case "Regular":
                return "Você está no caminho certo, mas pode melhorar!";
            case "Insuficiente":
                return "Você não passou, precisa melhorar. Não desista!";
            case "Reprovado":
                return "Você foi reprovado. Busque apoio e estude mais para a próxima!";
            default:
                return "Classificação desconhecida.";  // Caso não tenha correspondido a nenhum caso
        }
    }

    // Método que avalia o estudante, fornecendo a classificação e a mensagem
    public static String avaliarEstudante(Estudante estudante) {
        try {
            // Obtém a classificação e mensagem com base na nota final do estudante
            String classificacao = classificarNota(estudante.getNotaFinal());
            String mensagem = gerarMensagem(estudante.getNotaFinal());

            // Retorna o resultado da avaliação
            return "Classificação: " + classificacao + "\nMensagem: " + mensagem;
        } catch (IllegalArgumentException e) {
            // Captura erros de nota inválida e retorna uma mensagem de erro
            return "Erro: " + e.getMessage();
        }
    }
}
