package co.edu.uniquindio.model;

import java.util.Objects;

public class DetalleVenta extends VentaAlmacen{
    private Integer cantidad;
    private Double subtotal;
    private Producto producto;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer cantidad, Double subtotal, Producto producto) {
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetalleVenta that)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(cantidad, that.cantidad) && Objects.equals(subtotal, that.subtotal) && Objects.equals(producto, that.producto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cantidad, subtotal, producto);
    }

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", producto=" + producto +
                '}';
    }
}
