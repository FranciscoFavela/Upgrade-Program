package App;

import Personas.IPersona;

public class Main {
    public static void main(String[] args) {
    Factory factory = new Factory();
        IPersona p1 = factory.getPersona("QA");
        p1.insertarPersona("Javier");
        p1.Despedirse();

        IPersona p2 = factory.getPersona("Developer");
        p2.insertarPersona("Zamira");
        p2.Saludar();

        IPersona p3 = factory.getPersona("Testers");
        p3.insertarPersona("Sal");
        p3.Saludar();
    }
}
