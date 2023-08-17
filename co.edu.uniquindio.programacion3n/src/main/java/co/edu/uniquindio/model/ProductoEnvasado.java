package co.edu.uniquindio.model;

import java.util.Date;
import java.util.Objects;

public class ProductoEnvasado extends Producto{
    private Date fechaVencimiento;

    public ProductoEnvasado() {
    }

    public ProductoEnvasado(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductoEnvasado that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(fechaVencimiento, that.fechaVencimiento);
    }

    @Override
    public String toString() {
        return "ProductoEnvasado{" +
                "fechaVencimiento=" + fechaVencimiento +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), fechaVencimiento);
    }
}
