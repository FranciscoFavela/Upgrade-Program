package app;

import interfaces.IPersons;

public class Main {
    public static void main(String[] args) {
    Factory factory = new Factory();
        IPersons p1 = factory.getPersona("DOCTOR");
        p1.insertarPersona("JAVIER");
        p1.borrarPersona("JAVIER");

        IPersons p2 = factory.getPersona("SECRETARIA");
        p2.insertarPersona("JOSE");
        p2.borrarPersona("JOSE");

        IPersons p3 = factory.getPersona("Administrador");
        p3.insertarPersona("Layla");
        p3.borrarPersona("Layla");
    }
}
