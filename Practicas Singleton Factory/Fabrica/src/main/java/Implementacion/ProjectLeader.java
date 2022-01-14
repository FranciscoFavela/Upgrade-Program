package Implementacion;

import Personas.IPersona;

public class ProjectLeader implements IPersona {
    @Override
    public String Saludar() {
        return "Hola Soy un ProjectLeader";
    }

    @Override
    public String Despedirse() {
        return "Hola Soy un ProjectLeader";
    }

    @Override
    public void insertarPersona(String name) {
        System.out.println("ProjectLeader "+ name +" Insertado");
    }

    public String Programar(){
        return "Adios Soy un ProjectLeader";
    }
}
