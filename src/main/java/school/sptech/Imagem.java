package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public void adicionar (Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for(int i = 0; i<figuras.size(); i++){
           soma += figuras.get(i).calcularArea();
        }
        return soma;
    }
    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> maior = new ArrayList<>();
        for(Figura figura : figuras){
            if(figura.calcularArea()>20){
                maior.add(figura);
            }
        }
        return maior;
    }
    public List<Figura> buscarQuadrados(){
        List<Figura> quadrados = new ArrayList<>();
        for(Figura figura : figuras){
            if(figura instanceof Quadrado){
                quadrados.add(figura);
            }
        }
        return quadrados;
    }
}
