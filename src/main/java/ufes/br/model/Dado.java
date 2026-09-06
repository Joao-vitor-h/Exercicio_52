package ufes.br.model;

import java.util.ArrayList;
import java.util.List;

public class Dado {

    private List<Double> numeros;
    private List<Resultado> resultados;

    public Dado(List<Double> numeros) {
        this.numeros = numeros;
        this.resultados = new ArrayList<>();
    }

    public void addNumeros(List<Double> numeros) {

    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void addResultado(Resultado resultado) {
        resultados.add(resultado);
    }

    public List<Resultado> getResultados() {
        return resultados;
    }
}
