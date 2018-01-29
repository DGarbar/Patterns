# Dynamic binding, Runtime binding

Присоединение вызова метода к телу метода называется связыванием.

- **Поздним**, потому что мы связываем объект и реализацию уже после компиляции.
- **Динамическим**, потому что мы делаем это при каждом прохождении через этот участок.
***

```
class Exporter is
    method export(s: Shape) is
        print("Exporting shape")
    method export(d: Dot)
        print("Exporting dot")
    method export(c: Circle)
        print("Exporting circle")
    method export(r: Rectangle)
        print("Exporting rectangle")
    method export(cs: CompoundGraphic)
        print("Exporting compound")
```

Кажется, что всё хорошо. Но давайте испробуем такой класс в деле:

```
class App() is
    method export(shape: Shape) is
        Exporter exporter = new Exporter()
        exporter.export(shape);

app.export(new Circle());
// К сожалению, выведет "Exporting shape".
```

Итак, вызов метода `draw` в классе `Shape`. Но нам известно ещё и о четырёх классах переопределяющих этот метод. Можно ли уже сейчас понять какую реализацию нужно выбрать? Похоже, что нет, ведь для этого придётся запустить программу и узнать какой же объект будет подан в параметр. Но одно вы знаете точно — какой бы объект ни был передан, он точно будет иметь реализацию `draw`. *(Для примера, можно заполнять массив через рандом фигур)*

В результате машинный код, который вы создадите, будет **каждый раз при проходе через этот участок проверять что за объект этот `s`**, и выбирать реализацию метода `draw` из соответствующего класса.


```java
class King {
    King() {
        System.out.println("Call King constructor");
        speech();   //polymorphic method overriden in AerysTargaryen 
    } 
    public void speech() {
        System.out.println("I'm the King of the Andals!");
    }
}
 
class AerysTargaryen extends King {
    private String victimName;
 
    AerysTargaryen() {
        System.out.println("Call Aerys Targaryen constructor");
        victimName = "Lyanna Stark";
        speech();
    }
 
    @Override
    public void speech() {
        System.out.println("Burn " + victimName + "!");
    }
}
 
class Kingdom {
    public static void main(String[] args) {
        King king = new AerysTargaryen();
    }
}
```
Результат работы программы обусловлен выполнение алгоритма инициализации объекта:

1. Память, выделенная под новый объект, заполняется двоичными нулями.

2. Конструкторы базовых классов вызываются по иерархии. В этот момент вызывается переопределенный метод `speech()` ( перед вызовом конструктора класса `AerysTargaryen`), где обнаруживается, что переменная `victimName` равна null из-за первого этапа.

3. Вызываются инициализаторы членов класса в порядке их определения.

4. Исполняется тело конструктора производного класса.

**В частности из-за таких поведенческих моментов стоит придерживаться следующего правила написания конструкторов:**

 - **выполняйте в конструкторе лишь самые необходимые и простые действия по инициализации объекта**;
 
 - **по возможности избегайте вызова методов, не определенных как `private` или `final` (что в данном контексте одно и то же)**. 