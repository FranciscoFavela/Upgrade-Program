package Implementacion;

import Personas.IPersona;

public class FunctionalAnalyst implements IPersona {
    @Override
    public String Saludar() {
        return "Hola soy un analista";
    }

    @Override
    public String Despedirse() {
        return "Adios soy un analista";
    }

    @Override
    public void insertarPersona(String name) {
        System.out.println("FunctionalAnalyst "+ name +" Insertado");
    }
}
