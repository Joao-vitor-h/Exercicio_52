package ufes.br.calculos;

import ufes.br.model.Dado;
import ufes.br.model.Resultado;

import java.util.List;

public class Media implements IFormaCalculo {

    @Override
    public void executarCalculo(Dado dados) {
        double soma = 0.0;
        List<Double> numeros = dados.getNumeros();

        for (double numero : numeros) {
            soma += numero;
        }

        Resultado resultado = new Resultado("Media", soma / numeros.size());

        dados.addResultado(resultado);
    }
}
