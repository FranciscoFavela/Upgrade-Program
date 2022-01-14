package Implementacion;

import Personas.IPersona;

public class QA implements IPersona {
    @Override
    public String Saludar() {
        return "Hola soy un controlador de calidad";
    }

    @Override
    public String Despedirse() {
        return "Adios soy un controlador de calidad";
    }

    @Override
    public void insertarPersona(String name) {
        System.out.println("QA "+ name +" Insertado");
    }
}
