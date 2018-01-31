# Одиночка

![UML](/src/AdditionalDocs/uml/Singleton.png)

Гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.

**Одиночка** решает сразу две проблемы **(нарушая принцип единственной ответственности класса)**.

## Применимость
  - Когда в программе **должен быть единственный экземпляр** какого-то класса, доступный всем клиентам (например, общий доступ к базе данных из разных частей программы).

    - Одиночка **скрывает от клиентов все способы создания нового объекта**, кроме специального метода. Этот метод либо создаёт объект, либо отдаёт существующий объект, если он уже был создан.

  - Когда вам хочется иметь больше контроля над глобальными переменными.

    - В отличие от глобальных переменных, **Одиночка** гарантирует, что никакой другой код не заменит созданный экземпляр класса, поэтому вы всегда уверены в наличие лишь одного объекта-одиночки.

      Тем не менее, в любой момент вы можете расширить это ограничение и позволить любое количество объектов-одиночек, поменяв код в одном месте (метод `getInstance()`).

 ## Шаги реализации
1. Добавьте в класс **приватное статическое поле** (+ `volatile` ), которое будет содержать одиночный объект.

2. Объявите **статический создающий метод**(+ `synchronized` ), который будет использоваться для получения одиночки.

3. Добавьте **«ленивую инициализацию»** (создание объекта при первом вызове метода) в создающий метод одиночки.

4. Сделайте **конструктор класса приватным**.

5. В клиентском коде замените вызовы конструктора вызовами создающего метода.

 ## Преимущества и недостатки
 | + | - |
 | ------ | ------ |
 |Гарантирует наличие единственного экземпляра класса. |Нарушает принцип единственной ответственности класса.
 |Предоставляет к нему глобальную точку доступа. |Маскирует плохой дизайн.
 |Реализует отложенную инициализацию объекта-одиночки. |Проблемы мультипоточности.
 | |Требует постоянного создания Mock-объектов при юнит-тестирования.


 
 ## Отношения с другими паттернами

- [**Фасад**][Facade] можно сделать **Одиночкой**, так как обычно нужен только один объект-фасад.

- Паттерн [**Легковес**][Flyweight] может напоминать **Одиночку**, если для конкретной задачи у вас получилось уменьшить количество объектов к одному. Но помните, что между паттернами есть два кардинальных отличия:

    1. В отличие от **Одиночки**, вы можете иметь множество объектов-легковесов.
    2. Объекты-легковесов должны быть неизменяемыми, тогда как объект-одиночки допускает изменение своего состояния.
 
- [**Абстрактная фабрика**][Abstract_Factory], [**Строитель**][Builder] и [**Прототип**][Prototype] могут быть реализованы при помощи **Одиночки**.


[Abstract_Factory]: </src/Creational/Factorys/Abstract_Factory/Abstract_Factory.md>
[Factory_Method]: </src/Creational/Factorys/Factory_Method/Factory_Method.md>
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
