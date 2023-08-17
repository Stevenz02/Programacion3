package co.edu.uniquindio.model;

import java.util.Objects;

public class ProductoRefrigerado extends Producto{
    private String codigoAprovacion;
    private Double temperaturaRefri;

    public ProductoRefrigerado() {
    }

    public ProductoRefrigerado(String codigoAprovacion, Double temperaturaRefri) {
        this.codigoAprovacion = codigoAprovacion;
        this.temperaturaRefri = temperaturaRefri;
    }

    public String getCodigoAprovacion() {
        return codigoAprovacion;
    }

    public void setCodigoAprovacion(String codigoAprovacion) {
        this.codigoAprovacion = codigoAprovacion;
    }

    public Double getTemperaturaRefri() {
        return temperaturaRefri;
    }

    public void setTemperaturaRefri(Double temperaturaRefri) {
        this.temperaturaRefri = temperaturaRefri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoRefrigerado that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(codigoAprovacion, that.codigoAprovacion) && Objects.equals(temperaturaRefri, that.temperaturaRefri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), codigoAprovacion, temperaturaRefri);
    }

    @Override
    public String toString() {
        return "ProductoRefrigerado{" +
                "codigoAprovacion='" + codigoAprovacion + '\'' +
                ", temperaturaRefri=" + temperaturaRefri +
                '}';
    }
}
