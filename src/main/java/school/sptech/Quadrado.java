package school.sptech;

public class Quadrado extends Figura{
    private Double lado;

    @Override
    public Double calcularArea(){
        double area;
        area = lado*lado;
        return area;
    }

    @Override
    public String toString(){
        return "O quadrado tem a cor: " + getCor() + ", a espessura: " + getEspessura() + " e a área: " + calcularArea();
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
