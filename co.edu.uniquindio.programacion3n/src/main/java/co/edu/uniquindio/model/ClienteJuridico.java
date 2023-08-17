package co.edu.uniquindio.model;

import java.util.Objects;

public class ClienteJuridico {
    private String nit;

    public ClienteJuridico() {
    }

    public ClienteJuridico(String nit) {
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteJuridico that)) return false;
        return Objects.equals(nit, that.nit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nit);
    }

    @Override
    public String toString() {
        return "ClienteJuridico{" +
                "nit='" + nit + '\'' +
                '}';
    }
}
