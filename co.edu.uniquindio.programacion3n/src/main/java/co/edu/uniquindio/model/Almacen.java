package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Almacen {
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Producto> listaProductos = new ArrayList<Producto>();
    private List<VentaAlmacen> listaVentas = new ArrayList<VentaAlmacen>();

    public Almacen() {
    }

    public Almacen(List<Cliente> listaClientes, List<Producto> listaProductos, List<VentaAlmacen> listaVentas) {
        this.listaClientes = listaClientes;
        this.listaProductos = listaProductos;
        this.listaVentas = listaVentas;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<VentaAlmacen> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(List<VentaAlmacen> listaVentas) {
        this.listaVentas = listaVentas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Almacen almacen)) return false;
        return Objects.equals(listaClientes, almacen.listaClientes) && Objects.equals(listaProductos, almacen.listaProductos) && Objects.equals(listaVentas, almacen.listaVentas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listaClientes, listaProductos, listaVentas);
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "listaClientes=" + listaClientes +
                ", listaProductos=" + listaProductos +
                ", listaVentas=" + listaVentas +
                '}';
    }
}
