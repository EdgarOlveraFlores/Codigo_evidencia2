
package com.domain;

public class Doctor {
    private String nombre; //Variable para almacenar el nombre del doctor
    private String id; //Variable para almacenar el id del doctor
    private String especialidad; //Variable para almacenar la variable del doctor

    //Constructor vacio
    public Doctor() {

    }
    //Constructor con los parametros de las variables de la clase del doctor
    public Doctor(String nombre, String id, String especialidad) {
        this.nombre = nombre;
        this.id = id;
        this.especialidad = especialidad;
    }

    //Metodos GEY y SET de las variables de la clase del doctor
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
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
