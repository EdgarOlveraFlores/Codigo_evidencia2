
package com.test;

import com.domain.Doctor;
import com.domain.Paciente;

public class Principal {
    public static void main(String[] args) {
        //Creamos 4 doctores con los parametros (nombre, id, especialidad)
        Doctor doctor1 = new Doctor("Marco","101","Cirujano");
        Doctor doctor2 = new Doctor("Fernanda","101","Terapeuta");
        Doctor doctor3 = new Doctor("Alejandro","101","Pediatria");
        Doctor doctor4 = new Doctor("Ana","101","Cirujano");
        
        
        //Creamos 4 Pacientes con los parametros (id, nombre)
        Paciente paciente1 = new Paciente("0001","Edgar");
        Paciente paciente2 = new Paciente("0002","Ivan");
        Paciente paciente3 = new Paciente("0003","Andres");
        Paciente paciente4 = new Paciente("0004","Ximena");
        
        //relacionando clientes y doctores
        
    }
}
