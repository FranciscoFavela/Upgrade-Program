package implementacion;

import interfaces.IPersons;

public class CRUDDoctor implements IPersons  {

    @Override
    public void insertarPersona(String name) {
        System.out.println("Doctor "+ name +" Insertado");

    }

    @Override
    public void actualizarPersona(String name) {
        System.out.println("Doctor "+ name +" Actualizado");
    }

    @Override
    public void borrarPersona(String name) {
        System.out.println("Doctor "+ name +" eliminado ");
    }
}
