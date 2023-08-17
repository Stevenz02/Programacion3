package co.edu.uniquindio.model;

import java.util.Date;
import java.util.Objects;

public class ProductoPerecedero extends Producto{
    private Date fechaEnvasado;
    private Double pesoEnvase;
    private PaisOrigen paisOrigen;

    public ProductoPerecedero() {
    }

    public ProductoPerecedero(Date fechaEnvasado, Double pesoEnvase, PaisOrigen paisOrigen) {
        this.fechaEnvasado = fechaEnvasado;
        this.pesoEnvase = pesoEnvase;
        this.paisOrigen = paisOrigen;
    }

    public Date getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Date fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public Double getPesoEnvase() {
        return pesoEnvase;
    }

    public void setPesoEnvase(Double pesoEnvase) {
        this.pesoEnvase = pesoEnvase;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoPerecedero that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(fechaEnvasado, that.fechaEnvasado) && Objects.equals(pesoEnvase, that.pesoEnvase) && paisOrigen == that.paisOrigen;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaEnvasado, pesoEnvase, paisOrigen);
    }

    @Override
    public String toString() {
        return "ProductoPerecedero{" +
                "fechaEnvasado=" + fechaEnvasado +
                ", pesoEnvase=" + pesoEnvase +
                ", paisOrigen=" + paisOrigen +
                '}';
    }
}
