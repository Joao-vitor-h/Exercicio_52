package ufes.br;

import ufes.br.calculos.*;
import ufes.br.model.Dado;

import java.util.ArrayList;
import java.util.List;

public class CalculoEstatisticaService {
    private List<IFormaCalculo> formasDeCalculo;

    public CalculoEstatisticaService() {
        this.formasDeCalculo = new ArrayList<>();
        this.formasDeCalculo.add(new Media());
        this.formasDeCalculo.add(new Somatorio());
        this.formasDeCalculo.add(new Maior());
        this.formasDeCalculo.add(new Menor());
        this.formasDeCalculo.add(new Variancia());
        this.formasDeCalculo.add(new DesvioPadrao());
    }

    public void executarCalculo(Dado dados, IFormaCalculo operacao) {
        operacao.executarCalculo(dados);
    }
}