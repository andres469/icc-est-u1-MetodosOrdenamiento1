
package models;

public class Persona {
    private int id;
    private String nombre;
    private int edad;

    public Persona(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.edad = 0;
    }

    // Constructor compatible con llamadas que proporcionan solo nombre y edad
    public Persona(String nombre, int edad) {
        this.id = 0;
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Compatibilidad con código que usa getAge()/setAge()
    public int getAge() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setAge(int age) {
        this.edad = age;
    }

    @Override
    public String toString() {
        return "Persona{id=" + id + ", nombre='" + nombre + "', edad=" + edad + "}";
    }

}

