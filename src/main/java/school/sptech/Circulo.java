package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    @Override
    public Double calcularArea(){
        double area;
        area = Math.pow(raio,2)*Math.PI;
        return area;
    }

    @Override
    public String toString(){
        return "O circulo tem a cor: " + getCor() + ", a espessura: " + getEspessura() + " e a área: " + calcularArea();
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
