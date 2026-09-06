package ufes.br;

import ufes.br.calculos.Maior;
import ufes.br.calculos.Media;
import ufes.br.calculos.Somatorio;
import ufes.br.model.Dado;

import java.util.ArrayList;
import java.util.List;

public class EstatisticaService {
    private List<IFormaCalculo> formasDeCalculo;

    public EstatisticaService() {
        this.formasDeCalculo = new ArrayList<>();
        this.formasDeCalculo.add(new Media());
        this.formasDeCalculo.add(new Somatorio());
        this.formasDeCalculo.add(new Maior());
    }

    public void executarCalculo(Dado dados) {
        for (IFormaCalculo forma : formasDeCalculo) {
            forma.executarCalculo(dados);
        }
    }
}
