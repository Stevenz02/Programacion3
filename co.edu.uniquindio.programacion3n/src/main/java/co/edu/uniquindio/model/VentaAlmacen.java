package co.edu.uniquindio.model;

import java.util.Date;
import java.util.Objects;

public class VentaAlmacen {
    private String codigo;
    private Date fecha;
    private Double total;
    private Double iva;
    private Cliente cliente;

    public VentaAlmacen() {
    }

    public VentaAlmacen(String codigo, Date fecha, Double total, Double iva, Cliente cliente) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.total = total;
        this.iva = iva;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VentaAlmacen that)) return false;
        return Objects.equals(codigo, that.codigo) && Objects.equals(fecha, that.fecha) && Objects.equals(total, that.total) && Objects.equals(iva, that.iva) && Objects.equals(cliente, that.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, fecha, total, iva, cliente);
    }

    @Override
    public String toString() {
        return "VentaAlmacen{" +
                "codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", total=" + total +
                ", iva=" + iva +
                ", cliente=" + cliente +
                '}';
    }
}
