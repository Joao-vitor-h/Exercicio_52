package ufes.br.calculos;

import ufes.br.IFormaCalculo;
import ufes.br.model.Dado;
import ufes.br.model.Resultado;

import java.util.List;

public class Somatorio implements IFormaCalculo {

    @Override
    public void executarCalculo(Dado dados) {
        double soma = 0.0;
        List<Double> numeros = dados.getNumeros();

        for (double numero : numeros) {
            soma += numero;
        }

        Resultado resultado = new Resultado("Somatorio", soma);

        dados.addResultado(resultado);
    }
}
