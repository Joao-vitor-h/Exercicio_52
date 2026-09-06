package ufes.br;

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

        EstatisticaService calculadora = new EstatisticaService();

        calculadora.executarCalculo(dados);

        for (Resultado resultado : dados.getResultados()) {
            System.out.println(resultado);
        }
    }
}
