# Интерпретатор 

![UML](/src/AdditionalDocs/uml/Interpreter/Interpreter.png)

Предоставляет возможность оценить грамматику или выражение языка. Этот шаблон предполагает **реализацию интерфейса выражения, который интерпретирует конкретный контекст**. Этот шаблон используется в разборе SQL, движке обработки символов и т. д.

или

Позволяет **описать алгоритм со своей грамматикой и определенными правилами для решения конкретной задачи**. Короче говоря, данный шаблон позволяет описать механизм вычисления конкретной задачи с заданным синтаксисом.

## Применимость

- Когда нужно **реализовать простой язык**.
  
  - Уместен для языков с простой грамматикой, где простота важнее эффективности 
  
  - Может использоваться как со сценарными языками, так и с языками программирования.

## Шаги реализации

1. Создайте интерфейс выражения.
  
    - Как правило, будет вмещать в себя метод `interpret(String context)`

2. Создайте конкретные классы реализаций. Которые предусматривают в себе все нужные варианты интерпретаций.

## Преимущества и недостатки
 
 | + | - |
 | ------ | ------ |
 |Грамматику легко изменять и расширять.|Сложные грамматики трудно сопровождать.
 |Простая реализация грамматики.
 
## Отношения с другими паттернами

- Обычно вместе с паттерном **Интерпретатор** используется [**Компоновщик**][Composite]
 
 - **Абстрактное синтаксическое дерево** - это пример применения паттерна [**Компоновщик**][Composite].

![UML](/src/AdditionalDocs/uml/Interpreter/AbstractSyntaxTree.png)
 
- [**Приспособленец**][Flyweight] показывает варианты совместного использования терминальных символов в абстрактном синтаксическом дереве. 

- **Интерпретатор** может пользоваться [**Итератором**][Singleton] для обхода структуры.

- [**Посетителя**][Visitor] можно использовать для инкапсуляции в одном классе поведения каждого узла абстрактного синтаксического дерева.


[Abstract_Factory]: </src/Creational/Factorys/Abstract_Factory/Abstract_Factory.md>
[Factory_Method]: </src/Creational/Factorys/Factory_Method/Factory_Method.md>
[Builder]: </src/Creational/Builder/Builder.md>
[Prototype]: </src/Creational/Prototype/Prototype.md>
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