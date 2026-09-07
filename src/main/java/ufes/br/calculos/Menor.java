package ufes.br.calculos;

import ufes.br.model.Dado;
import ufes.br.model.Resultado;

public class Menor implements IFormaCalculo {

    @Override
    public void executarCalculo(Dado dados) {
        double menor = dados.getNumeros().getFirst();

        for (double numero : dados.getNumeros()) {
            if (numero < menor) {
                menor = numero;
            }
        }

        dados.addResultado(new Resultado("Menor", menor));
    }
}
