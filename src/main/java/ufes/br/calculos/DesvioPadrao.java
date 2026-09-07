package ufes.br.calculos;

import ufes.br.model.Dado;
import ufes.br.model.Resultado;

public class DesvioPadrao implements IFormaCalculo {

    @Override
    public void executarCalculo(Dado dados) {
        double p1 = 1 / Double.valueOf(dados.getNumeros().size() - 1);
        double p2 = Variancia.somatorioDosNumerosAoQuadrado(dados) -
                (Math.pow(dados.getResultados().get(1).getValorCalculado(), 2) / Double.valueOf(dados.getNumeros().size()));

        dados.addResultado(new Resultado("Desvio Padrão", Math.sqrt(p1 * p2)));
    }
}
