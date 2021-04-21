
package RelacionCita;

import com.domain.*;
import java.util.HashMap;        //Ereda de Map
import java.util.Map;            //Importamos para usar tablas hash 

public class RelacionCita {
    //variables privadas de la clase
    private static RelacionCita id=null;
    private static RelacionCita fecha=null;
    private static RelacionCita motivo=null;
    
    //Tablas hash
    private Map<String, Paciente> pacientes;  //Para la informacion del paciente
    private Map<String, Doctor> doctor;   //Para la informacion del doctor
    
    //Constructor vacio para instanciar las tablas
    private RelacionCita(){ 
        pacientes = new HashMap<String, Paciente>();
        doctor = new HashMap<String, Doctor>();
    }
    public RelacionCita getId(){
        if (id == null) {
            id = new RelacionCita();
        }
        return id;
    }
    public RelacionCita getFecha(){
        if (fecha == null) {
            fecha = new RelacionCita();
        }
        return fecha;
    }
    public RelacionCita getMotivo(){
        if (motivo == null) {
            motivo = new RelacionCita();
        }
        return motivo;
    }
    
    //Agregamos paciente  (DarPacienteDeAlta)
    public void addPaciente(Paciente x){
        Paciente p = pacientes.get(x.getId());
        if (p == null){                             //verificamos que el paciente existe y si no, lo creamos
            pacientes.put(x.getId(), x);
        }else{
            System.out.println("El PACIENTE ya existe");
        }
    }
    //Agregamos doctor (DarDoctorDeAlta)
    public void addDoctor(Doctor x){
        Paciente p = pacientes.get(x.getId());
        if (p == null){                             //verificamos que el paciente existe y si no, lo creamos
            doctor.put(x.getId(), x);
        }else{
            System.out.println("El DOCTOR ya existe");
        }
    }
    
}
