package Model;


public class Produto {
    private Double consumo;
    private Double distancia;
    
    public Produto() {
        this (0,0);
    }

    public Produto(double consumo, double distancia) {
        this.consumo = consumo;
        this.distancia = distancia;
    }

    public Double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    public double getkm() {
        return distancia/consumo;
    }
}
