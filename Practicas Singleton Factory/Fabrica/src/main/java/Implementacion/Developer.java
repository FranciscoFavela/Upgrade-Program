package Implementacion;

import Personas.IPersona;

public class Developer implements IPersona {
    @Override
    public String Saludar() {
        return "Hola soy un desarrolador";
    }

    @Override
    public String Despedirse() {
        return "Adios soy un desarrollador";
    }

    @Override
    public void insertarPersona(String name) {
        System.out.println("Developer "+ name +" Insertado");
    }
}
