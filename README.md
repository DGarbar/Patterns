# Patterns of c programming java

## Принципы проектирования: 

* **Изменяемые аспекты** приложения должны быть **отделенны** от постоянных;

* Программировать на уровне **интерфейсов**, а не на уровне реализаций;

* [**Композиция**][Composition]* лучше наследования;

* Стремиться к [**слабой связанности**][LowCoupling]* взаимодействующих объектов;
  - Выделять уровень абстракции, чтобы работать с **супер типом** (Полиморфизм);
  
* Классы открыты для расширения, но закрыты для изменения([Open/closed][OCP]).



[LowCoupling]: </src/AdditionalDocs/LowCoupling.md>
[Composition]: </src/AdditionalDocs/Composition.md>
[OCP]: </src/AdditionalDocs/SOLID/Open-Closed_principle.md>
