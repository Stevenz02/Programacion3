package co.edu.uniquindio.model;

import java.util.Date;
import java.util.Objects;

public class ClienteNatural {
    private String email;
    private Date fechaNacimiento;

    public ClienteNatural() {
    }

    public ClienteNatural(String email, Date fechaNacimiento) {
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClienteNatural that)) return false;
        return Objects.equals(email, that.email) && Objects.equals(fechaNacimiento, that.fechaNacimiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, fechaNacimiento);
    }

    @Override
    public String toString() {
        return "ClienteNatural{" +
                "email='" + email + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
