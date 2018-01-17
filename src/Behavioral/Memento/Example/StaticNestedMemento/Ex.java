package Behavioral.Memento.Example.StaticNestedMemento;

//If we want to, we can create Memento in package class
// Encapsulation is still worked,
// bc new Memento is created by Creator(can use private fields)
// Also can create common interface for Memento
public class Ex {

  public static void main(String[] args) {
    Creator ork = new Creator("Ork", "Bowman", "dang");
    Creator undead = new Creator("Undead", "Wizard", "world");

    Caretaker caretaker = new Caretaker();
    caretaker.addSave(ork.save()); //First save

    System.out.println(ork.toString());
    ork.upLvl();
    ork.upLvl();
    ork.setState("world");
    ork.setType("Super Bowman");
    System.out.println(ork.toString());
    caretaker.addSave(ork.save()); // Next save

    ork.upLvl();
    ork.setState("Super dang");
    ork.upLvl();
    ork.upLvl();
    System.out.println(ork.toString());
    System.out.println("SORRY YOU DIED LOL");
    ork.load(caretaker.getLastSave());
    System.out.println(ork.toString());


  }
}
