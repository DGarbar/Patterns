# Null Object

![UML](/src/AdditionalDocs/uml/Null_Object.png)

 Объекты могут иметь значение NULL, они нуждаются в проверке на NULL-значение перед использованием, так как методы класса «нулевого» объекта, как правило, не могут вызываться.

**Null-object инкапсулирует отсутствие объекта путём замещения его другим объектом, который ничего не делает**.

## Применимость

- Когда объект требует взаимодействия с другими объектами. **Null Object не устанавливает нового взаимодействия - он использует уже установленное взаимодействие**;

- Когда какие-то из взаимодействующих объектов должны бездействовать;

- Когда требуется абстрагирование **«общения» с объектами, имеющими NULL-значение**.

## Шаги реализации

- Описать существующий интерфес, оставляя методы пустыми или описать "заглушки".

## Преимущества и недостатки

| + | - |
| ------ | ------ |
|Замена всех проблем с Null.|

## Отношения с другими паттернами

- Класс **Null Object** часто реализуется как [**Singleton**][Singleton]. Поскольку **Null Object** обычно не имеет какого-либо состояния, его состояние не может измениться, поэтому несколько экземпляров идентичны. Вместо того, чтобы использовать несколько одинаковых экземпляров, система может просто использовать один экземпляр повторно.

- Если некоторые клиенты ожидают, что **Null Object** ничего не сделает в одном направлении, а некоторые в другом, потребуются несколько классов NullObject. Класс NullObject потребует подключаемых переменных, чтобы клиент мог указать, как нулевой объект ничего не должен делать. Это может быть признаком абстрактного объекта, не имеющего четко определенного (семантического) интерфейса.

- **Null Object** не может стать реальным объектом. Если объект может стать реальным объектом - это не **Null Object**. Это может быть реальный объект с режимом do-nothing, например, контроллер, который может переключаться и находиться в режиме только для чтения. Если это один объект, он должен быть реализован с шаблоном State или, возможно, с  [**Proxy**][Proxy] шаблоном. В этом случае может использоваться Null State или прокси может содержать **Null Object**

- **Null Object** может быть аналогично использованию [**Proxy**][Proxy], но оба шаблона имеют разные цели. [**Proxy**][Proxy] обеспечивает уровень косвенности при доступе к объекту. **Null Object** не скрывает реального объекта и не контролирует доступ к нему, он заменяет реальный объект. [**Proxy**][Proxy] может в конечном итоге мутировать, чтобы начать действовать как настоящий субъект. **Null Object** не будет мутировать для запуска.

- **Null Object** может быть частным случаем шаблона [**Strategy**][Strategy]. [**Strategy**][Strategy] определяет несколько ConcreteStrategy классов как разные подходы к выполнению задачи. Если один из этих подходов должен ничего не делать, тогда этот ConcreteStrategy является NullObject. Например, контроллер представляет собой представление по стратегии для обработки ввода, а NoController - это стратегия, которая игнорирует все входные данные.

- **Null Object** может быть частным случаем [**State**][State]. Обычно у каждого ConcreteState есть некоторые методы для этого состояния. Фактически, данный метод часто реализуется, чтобы сделать что-то полезное в большинстве состояний. Если конкретный ConcreteState реализует большинство методов, так что они пустые или по крайней мере дают нулевые результаты, он становится **Null Object**.

- **Null Object** может использоваться, чтобы позволить [**Visitor**][Visitor] безопасно посещать иерархию и обрабатывать нулевую ситуацию.
  

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
[Private_Class_Data]: </src/Structural/Private_Class_Data/Private_Class_Data.md>


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