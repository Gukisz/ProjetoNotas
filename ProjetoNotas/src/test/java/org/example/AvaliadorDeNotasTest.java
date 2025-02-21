package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AvaliadorDeNotasTest {

    @Test
    public void testClassificarNotaExcelente() {
        assertEquals("Excelente", AvaliadorDeNotas.classificarNota(95));
        assertEquals("Parabéns! Você está com desempenho excelente!", AvaliadorDeNotas.gerarMensagem(95));
    }

    @Test
    public void testClassificarNotaBom() {
        assertEquals("Bom", AvaliadorDeNotas.classificarNota(85));
        assertEquals("Seu desempenho foi bom! Continue assim!", AvaliadorDeNotas.gerarMensagem(85));
    }

    @Test
    public void testClassificarNotaRegular() {
        assertEquals("Regular", AvaliadorDeNotas.classificarNota(60));
        assertEquals("Você está no caminho certo, mas pode melhorar!", AvaliadorDeNotas.gerarMensagem(60));
    }

    @Test
    public void testClassificarNotaInsuficiente() {
        assertEquals("Insuficiente", AvaliadorDeNotas.classificarNota(45));
        assertEquals("Você não passou, precisa melhorar. Não desista!", AvaliadorDeNotas.gerarMensagem(45));
    }

    @Test
    public void testClassificarNotaReprovado() {
        assertEquals("Reprovado", AvaliadorDeNotas.classificarNota(20));
        assertEquals("Você foi reprovado. Busque apoio e estude mais para a próxima!", AvaliadorDeNotas.gerarMensagem(20));
    }

    @Test
    public void testAvaliarEstudante() {
        Estudante estudante = new Estudante("João", 85);
        String resultadoEsperado = "Classificação: Bom\nMensagem: Seu desempenho foi bom! Continue assim!";
        assertEquals(resultadoEsperado, AvaliadorDeNotas.avaliarEstudante(estudante));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotaInvalidaAcimaDe100() {
        AvaliadorDeNotas.classificarNota(105);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNotaInvalidaNegativa() {
        AvaliadorDeNotas.classificarNota(-10);
    }

    @Test
    public void testMensagemErroNotaInvalida() {
        Estudante estudante = new Estudante("Ana", 150);
        String resultadoEsperado = "Erro: Nota inválida! A nota deve estar entre 0 e 100.";
        assertEquals(resultadoEsperado, AvaliadorDeNotas.avaliarEstudante(estudante));
    }
}