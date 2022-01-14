package App;

import Implementacion.*;
import Personas.IPersona;

public class Factory {
    public IPersona getPersona(String persona){
        if(persona==null){
            return new NoRole();
        }
        if(persona.equalsIgnoreCase("Developer")){
            return new Developer();
        }else if(persona.equalsIgnoreCase("ERS")){
            return new ERS();
        }else if(persona.equalsIgnoreCase("FunctionalAnalyst")){
            return new FunctionalAnalyst();
        }
        else if(persona.equalsIgnoreCase("ProjectLeader")){
            return new ProjectLeader();
        }
        else if(persona.equalsIgnoreCase("QA")){
            return new QA();
        }
        return new NoRole();
}
}
