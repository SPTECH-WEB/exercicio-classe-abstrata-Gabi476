package school.sptech;

public class Triangulo extends Figura{
    private Double base;
    private Double altura;

    @Override
    public Double calcularArea(){
        double area;
        area = (base*altura)/2;
        return area;
    }

    @Override
    public String toString(){
        return "O triângulo tem a cor: " + getCor() + ", a espessura: " + getEspessura() + " e a área: " + calcularArea();
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
