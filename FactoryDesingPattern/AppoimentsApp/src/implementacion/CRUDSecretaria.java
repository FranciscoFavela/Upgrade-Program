package implementacion;

import interfaces.IPersons;

public class CRUDSecretaria implements IPersons {

    @Override
    public void insertarPersona(String name) {
        System.out.println("Secretaria "+ name +" Creada");
    }

    @Override
    public void actualizarPersona(String name) {
        System.out.println("Secretaria "+ name +" actualizada");
    }

    @Override
    public void borrarPersona(String name) {
        System.out.println("Secretaria "+ name +" eliminada");
    }
}
