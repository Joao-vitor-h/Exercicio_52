package ufes.br.calculos;

import ufes.br.IFormaCalculo;
import ufes.br.model.Dado;
import ufes.br.model.Resultado;

public class Maior implements IFormaCalculo {

    @Override
    public void executarCalculo(Dado dados) {
        double maior = dados.getNumeros().getFirst();

        for (double numero : dados.getNumeros()) {
            if (numero >= maior) {
                maior = numero;
            }
        }

        dados.addResultado(new Resultado("Maior", maior));
    }
}
