# Выделение частного класса данных

![UML](/src/AdditionalDocs/uml/Private_Class_Data.png)

Инкапсулирует данные перемещая их в другой класс. **Не дает возможности изменять переменные даже самому классу (так как они в другом классе)**

(Замена `final`)

!!!

[Java - не нужно. Больше для С#](https://stackoverflow.com/questions/42540998/private-class-data-design-pattern-in-java)

!!!
## Применимость
  
  - Когда мы хотим сделать `final after constructor`.

  - Когда у класса много атрибутов.
    
    - Мы выделяем новый класс, (или классы) которые вмещают в себя все нужные данные.

## Шаги реализации

1. Создать Дата-класс, который будет иметь одну ответственность, используя методы рефакторинга: **выделения поля и выделения метода**. Добавить все поля, которые нужно сокрыть.

2. Создайте **связь между старым и новым классом**. Старый класс, должен создавать Дата-класс передавая данные через конструктор.



[Abstract_Factory]: </src/Creational/Factorys/Abstract_Factory/Abstract_Factory.md>
[Factory_Method]: </src/Creational/Factorys/Factory_Method/Factory_Method.md>
[Object_Pool]: </src/Creational/Object_Pool/Object_Pool.md>
[Builder]: </src/Creational/Builder/Builder.md>
[Prototype]: </src/Creational/Prototype/Prоtotype.md>
[Singleton]: </src/Creational/Singleton/Singleton.md>

[Adapter]: </src/Structural/Adapter/Adapter.md>
[Bridge]: </src/Structural/Bridge/Bridge.md>
[Composite]: </src/Structural/Composite/Composite.md>
[Decorator]: </src/Structural/Decorator/Decorator.md>
[Facade]: </src/Structural/Facade/Facade.md>
[Flyweight]: </src/Structural/Flyweight/Flyweight.md>
[Proxy]: </src/Structural/Proxy/Proxy.md>
[Proxy]: </src/Structural/Private_Class_Data/Private_Class_Data.md>


[Chain_of_Responsibility]: </src/Behavioral/Chain_of_Responsibility/Chain_of_Responsibility.md>
[Command]: </src/Behavioral/Command/Command.md>
[Iterator]: </src/Behavioral/Iterator/Iterator.md>
[Mediator]: </src/Behavioral/Mediator/Mediator.md>
[Memento]: </src/Behavioral/Memento/Memento.md>
[Observer]: </src/Behavioral/Observer/Observer.md>
[State]: </src/Behavioral/State/State.md>
[Strategy]: </src/Behavioral/Strategy/Strategy.md>
[Template_Method]: </src/Behavioral/Template_Method/Template_Method.md>
[Visitor]: </src/Behavioral/Visitor/Visitor.md>