package ufes.br;

import ufes.br.calculos.DesvioPadrao;
import ufes.br.calculos.Media;
import ufes.br.calculos.Somatorio;
import ufes.br.model.Dado;
import ufes.br.model.Resultado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Double> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add((double) i);
        }

        Dado dados = new Dado(numeros);

        CalculoEstatisticaService calculadora = new CalculoEstatisticaService();

        calculadora.executarCalculo(dados, new DesvioPadrao());

        for (Resultado resultado : dados.getResultados()) {
            System.out.println(resultado);
        }
    }
}
