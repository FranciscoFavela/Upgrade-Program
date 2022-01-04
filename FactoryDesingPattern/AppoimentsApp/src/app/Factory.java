package app;

import implementacion.*;
import interfaces.IPersons;

public class Factory {

    public IPersons getPersona(String persona){
        if(persona==null){
            return new CRUDVacio();
        }
        if(persona.equalsIgnoreCase("DOCTOR")){
            return new CRUDDoctor();
        }else if(persona.equalsIgnoreCase("SECRETARIA")){
            return new CRUDSecretaria();
        }
        return new CRUDVacio();
    }
}
