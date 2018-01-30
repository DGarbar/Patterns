package Behavioral.Chain_of_Responsibility.Example.Steps;

public abstract class Step {

  private Step nextStep;

  //We also can put NextStep in constructor
  //Also can be previous step (Deque) but y menya lapki
  public void setNextStep(Step step) {
    this.nextStep = step;
  }

  public abstract boolean check(String name, int pas);

  public boolean checkNext(String name, int pas) {
    if (nextStep == null) {
      return true;
    }
    return nextStep.check(name, pas);
  }

}
