# Двойная диспетчеризация

**Двойная диспетчеризация** (double dispatch) - это трюк, позволяющий **обойти ограниченность раннего связывания в перегруженных методах**.
***

Вот как это делается:

```
class Visitor is
    method visit(s: Shape) is
        print("Visited shape")
    method visit(d: Dot)
        print("Visited dot")

interface Graphic is
    method accept(v: Visitor)

class Shape implements Graphic is
    method accept(v: Visitor)
        // Компилятор знает, что здесь `this` это `Shape`.
        v.visit(this)

class Dot extends Shape is
    method accept(v: Visitor)
        // Компилятор знает, что здесь `this` это `Dot`.
        // А значит можно статически связать этот вызов
        // с реализацией visit(d: Dot).
        v.visit(this)


Visitor v = new Visitor();
Graphic g = new Dot();

// Метод accept() – переопределен, но не перегружен. А значит, связан
// динамически. Поэтому реализация `accept` будет выбрана во время выполнения 
// уже из того класса, объект которого его вызвал (класс Dot).
g.accept(v);

// Выведет "Visited dot".
```
