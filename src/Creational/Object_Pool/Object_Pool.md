# Объектный пул

![UML](/src/AdditionalDocs/uml/ObjectPool.png)

набор инициализированных и **готовых к использованию объектов**. Когда системе требуется объект, он не создаётся, а берётся из пула. Когда объект больше не нужен, он не уничтожается, а возвращается в пул.

**!!!**

*не рекомендуется использовать объединение объектов с определенными языками, такими как **Java**, особенно для объектов, которые используют только память и не имеют внешних ресурсов. Распределение объектов относительно **быстро на современных языках с сборщиками мусора**; Большинство сборщиков мусора сканируют «живые» ссылки на объекты, а не память, которую эти объекты используют для своего контента. Это означает, что любое количество «мертвых» объектов без ссылок может быть отброшено с минимальными затратами. Напротив, **сохранение большого количества «живых», но неиспользуемых объектов увеличивает продолжительность сбора мусора.***

**!!!**

Java supports thread pooling via java.util.concurrent.ExecutorService and other related classes.

## Применимость

- Когда **создание объекта в начале работы и уничтожение его в конце приводит к большим затратам**.
 
  - Особенно заметно повышение производительности, когда объекты **часто создаются-уничтожаются, но одновременно существует лишь небольшое их число**.
  
- Когда есть нескольким клиентам нужен **один и тот же ресурс в разное время**.

## Шаги реализации

1. Создайте класс `ObjectPool` с `private` массивом объектов внутри;

2. Создайте `acquire и release` методы в классе `ObjectPool`;

3. Убедитесь, что ваш **ObjectPool** - [**Singleton**][Singleton]

## Преимущества и недостатки

 | + | - |
 | ------ | ------ |
|Повышает производительность приложения| **JAVA использует сборщик мусора**|
|управляет соединениями и обеспечивает способ повторного использования и обмена ими|Существуют ["ловушки"](https://en.wikipedia.org/wiki/Object_pool_pattern) при использовании таких объектов|
|Может предоставить ограничение для максимального количества объектов, которые могут быть созданы|

## Отношения с другими паттернами

- [**Фабричный метод**][Factory_method] может использоваться для инкапсуляции логики создания объектов. Однако после их создания он не управляет ими,  **Пул объектов** отслеживает созданные им объекты.
 
- Пулы объектов обычно реализуются как [**Singleton**][Singleton].

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
