
package com.ejemplo;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persona {
    private String nombre;
    private int edad;
    private boolean mayor;

    public Persona() {}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.mayor = false;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public boolean isMayor() { return mayor; }
    public void setMayor(boolean mayor) { this.mayor = mayor; }

    @Override
    public String toString() {
        return "Persona[nombre=" + nombre + ", edad=" + edad + ", mayor=" + mayor + "]";
    }

}
