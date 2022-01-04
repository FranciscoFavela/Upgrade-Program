package implementacion;

import interfaces.IPersons;

public class CRUDVacio implements IPersons {
    @Override
    public void insertarPersona(String name) {
        System.out.println(name +" no se Inserto");
    }

    @Override
    public void actualizarPersona(String name) {
        System.out.println(name +" no se actualizo");
    }

    @Override
    public void borrarPersona(String name) {
        System.out.println(name +" no se elimino ");
    }
}
