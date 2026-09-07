package ufes.br.calculos;

import ufes.br.model.Dado;
import ufes.br.model.Resultado;

public class Variancia implements IFormaCalculo {

    @Override
    public void executarCalculo(Dado dados) {
        double p1 = 1 / Double.valueOf(dados.getNumeros().size() - 1);
        double p2 = somatorioDosNumerosAoQuadrado(dados) - (Math.pow(dados.getResultados().get(1).getValorCalculado(), 2) / Double.valueOf(dados.getNumeros().size()));

        dados.addResultado(new Resultado("Variância", p1 * p2));
    }

    public static double somatorioDosNumerosAoQuadrado(Dado dados) {
        double somatorio = 0.0;

        for (double numero : dados.getNumeros()) {
            somatorio += Math.pow(numero, 2);
        }

        return somatorio;
    }
}
