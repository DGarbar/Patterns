package Behavioral.Chain_of_Responsibility.Example;

import Behavioral.Chain_of_Responsibility.Example.Steps.Authentication;
import Behavioral.Chain_of_Responsibility.Example.Steps.Authorization;
import Behavioral.Chain_of_Responsibility.Example.Steps.Registration;
import Behavioral.Chain_of_Responsibility.Example.Steps.SpellCheck;
import Behavioral.Chain_of_Responsibility.Example.Steps.Step;

public class Ex {

  public static void main(String[] args) {
    Step spellCheck = new SpellCheck();
    Step registration = new Registration();
    Step authorization = new Authorization(registration);
    Step authentication = new Authentication();

    //First we check on correct symbols
    spellCheck.setNextStep(authorization);
    //then go to check if we have this name
    authorization.setNextStep(authentication);
    //if we haven't we go to registration
    registration.setNextStep(authentication);
    // we can add addPrevStep (in case if we don't want to reg) but y menya lapki

    //then we check password + name
    authentication.setNextStep(null);
    System.out.println("Dimasdasd + 112");
    spellCheck.check("Dimasdasd", 112);//wrong all
    System.out.println("Dima + 1");
    spellCheck.check("Dima", 12222); //wrong pass
    System.out.println("Admin + 0");
    spellCheck.check("Admin", 0); //all good
  }

}
