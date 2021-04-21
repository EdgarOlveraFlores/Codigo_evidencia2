package com.domain;

public class Paciente {

    private String nombre; //Variable para almacenar el nombre del paciente
    private String id; //Variable para almacenar el id del paciente
    
    
    //Constructor sin parametros
    public Paciente() {

    }
    //Constructor con los parametrso de la clase paciente
    public Paciente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    //Metodos GET y SET de las variables de la clase paciente
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    

}
