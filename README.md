# Принципы проектирования
(НЕ ЗАКОНЫ)

* **Изменяемые аспекты** приложения должны быть **отделенны** от постоянных;

* Программировать на уровне **интерфейсов**, а не на уровне реализаций;

* [**Композиция**][Composition]* лучше наследования;

* Стремиться к [**слабой связанности**][LowCoupling]* взаимодействующих объектов;

  - Выделять уровень абстракции, чтобы работать с **супер типом** (Полиморфизм)
  
* Используйте только одну точку. `(Class.method())`[**Принцип минимальной информированности**][Demetra];
  
## Solid
 
* У класса должна быть только 1 обязанность. Только 1 причина для изменения. [**Single Responsibility S_olid**][SRP];

* Классы открыты для расширения, но закрыты для изменения. [**Open/closed s_O_lid**][OCP];

* Наследующий класс должен дополнять, а не замещать поведение базового класса. [**Liskov Substitution so_L_id**][LSP];

* Клиенты не должны зависеть от методов, которые они не используют. [**Interface Segregation sol_I_d**][ISP];

* [**Инверсия управления (Голливудский принцип)**][IoC] ->>> [**Dependency-Inversion soli_D**][DIP];

## Ключевые принципы

* Don’t repeat yourself - [DRY][DRY];

* Keep it simple stupid - [KISS][KISS];

* You ain’t gonna need it - [YAGNI][YAGNI];

## Паттерны проектирования 

 | [**Порождающие**][Creational]: удобное и безопасное **создание** новых объектов | [**Структурные**][Structural]: **построение** удобных в поддержке иерархий классов | [**Поведенческие**][Behavioral]: эффективного и безопасного **взаимодействия** между объектами программы |
 | :------: | :------: |:------: |
 | [**Фабричный метод**][Factory_Method] | [**Адаптер**][Adapter] | [**Цепочка обязанностей**][Chain_of_Responsibility] |
 | [**Абстрактная фабрика**][Abstract_Factory] | [**Мост**][Bridge] | [**Команда**][Command] |
 | [**Строитель**][Builder] | [**Компоновщик**][Composite] | [**Итератор**][Iterator] |
 | [**Пул объектов**][Object_Pool] |[**Декоратор**][Decorator] | [**Посредник**][Mediator] |
 | [**Прототип**][Prototype] | [**Фасад**][Facade] | [**Снимок**][Memento] |
 | [**Одиночка**][Singleton] | [**Легковес**][Flyweight] | [**Наблюдатель**][Observer] |
 |  | [**Заместитель**][Proxy] |[**Состояние**][State] |
 |  | [**Выделение частного класса данных**][Private_Class_Data] |  [**Стратегия**][Strategy] |
 |  |  | [**Шаблонный метод**][Template_Method] |
 |  |  | [**Посетитель**][Visitor] |
 |  |  | [**Null объект**][Null_Object] |
 
 
[DRY]: </src/AdditionalDocs/DRY.md>
[KISS]: </src/AdditionalDocs/KISS.md>
[YAGNI]: </src/AdditionalDocs/YAGNI.md>

[BindingTypes]: </src/AdditionalDocs/BindingTypes/>  
[LowCoupling]: </src/AdditionalDocs/LowCoupling.md>
[Composition]: </src/AdditionalDocs/Composition.md>
[Demetra]: </src/AdditionalDocs/Principle_of_Least_Knowledge.md>
[IoC]: </src/AdditionalDocs/Inversion_of_Control.md>
[God-Object]: </src/AdditionalDocs/AntiPatterns/God-Object.md>
[SRP]: </src/AdditionalDocs/SOLID/Single_Responsibility_principle.md>
[OCP]: </src/AdditionalDocs/SOLID/Open-Closed_principle.md>
[LSP]: </src/AdditionalDocs/SOLID/Liskov_Substitution_principle.md>
[ISP]: </src/AdditionalDocs/SOLID/Interface_Segregation_principle.md>
[DIP]: </src/AdditionalDocs/SOLID/Dependency_Inversion_principle.md>


[Creational]: </src/Creational/>
[Abstract_Factory]: </src/Creational/Factorys/Abstract_Factory/Abstract_Factory.md>
[Factory_Method]: </src/Creational/Factorys/Factory_Method/Factory_Method.md>
[Object_Pool]: </src/Creational/Object_Pool/Object_Pool.md>
[Builder]: </src/Creational/Builder/Builder.md>
[Prototype]: </src/Creational/Prototype/Prоtotype.md>
[Singleton]: </src/Creational/Singleton/Singleton.md>

[Structural]: </src/Structural/>
[Adapter]: </src/Structural/Adapter/Adapter.md>
[Bridge]: </src/Structural/Bridge/Bridge.md>
[Composite]: </src/Structural/Composite/Composite.md>
[Decorator]: </src/Structural/Decorator/Decorator.md>
[Facade]: </src/Structural/Facade/Facade.md>
[Flyweight]: </src/Structural/Flyweight/Flyweight.md>
[Proxy]: </src/Structural/Proxy/Proxy.md>
[Private_Class_Data]: </src/Structural/Private_Class_Data/Private_Class_Data.md>


[Behavioral]: </src/Behavioral/>
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
[Null_Object]: </src/Behavioral/Null_Object/Null_Object.md>
