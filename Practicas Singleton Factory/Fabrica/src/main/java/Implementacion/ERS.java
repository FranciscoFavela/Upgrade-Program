package Implementacion;

import Personas.IPersona;

public class ERS implements IPersona {
    @Override
    public String Saludar() {
        return "Hola soy un ERS";
    }

    @Override
    public String Despedirse() {
        return "Adios soy un ERS";
    }

    @Override
    public void insertarPersona(String name) {
        System.out.println("ERS "+ name +" Insertado");
    }
}
