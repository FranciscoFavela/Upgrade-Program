package Implementacion;

import Personas.IPersona;

public class NoRole implements IPersona {
    @Override
    public String Saludar() {
        return null;
    }

    @Override
    public String Despedirse() {
        return null;
    }

    @Override
    public void insertarPersona(String name) {
        System.out.println("NoRole "+ name +" no Insertado");
    }
}
