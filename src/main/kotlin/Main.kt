//fun main() {
////    val a = 21;
////    val b = 6;
////    val c: Int = a + b;
////    val v = "HAMBOO";
////    println("Hello World! congrats you just wrote your first app with kotlin");
////    println(c);
////    println(v)
////    print("Введите имя: ");
////    val name = readLine()
////    print("Введите возраст: ")
////    val age = readLine()
////
////    println("Ваше имя: $name" + "\t" + "Ваше возраст: $age")
////    for(i in 1..9){
////        for(j in 1..9){
////            print("${i * j} \t")
////        }
////        println()
////    }
////    var i = 10
////    while(i > 0){
////        println(i*i)
////        i--;
////    }
//
////    for(n in 1..8){
////        if(n == 5) continue;
////        println(n * n)
////    }
////    val people = arrayOf("Tom", "Sam", "Bob")
////    for(person in people){
////        print("$person \t")
////    }
//
//
//}

// fun main() {

//     displayUser("Tom", 23)
//     displayUser("Alice", 19)
//     displayUser("Kate", 25)
// }
// fun displayUser(name: String, age: Int){
//     println("Name: $name   Age: $age")
// }

// fun main() {
//     val tom: Person = Person()
//     val bob: Person = Person()
//     val alice: Person = Person()
// } 
// class Person
/*Если свойство определено с помощью val, то значение такого свойства можно установить только один раз, 
то есть оно immutable. Если свойство определено с помощью var, 
то значение этого свойства можно многократно изменять.*/

// fun main() {
//     val bob: Person = Person() // создаем объект
//     println(bob.name)       // Undefined
//     println(bob.age)        // 18

//     bob.name = "Berik"
//     bob.age = 25

//     println(bob.name)       // Bob
//     println(bob.age)
// }
// class Person{
//     var name: String = "Serik"
//     var age: Int = 18
// }

//Функции класса

/*fun main() {
    val tom = Person()
    tom.name = "Kambar"
    tom.age = 37

    tom.sayHello()
    tom.go("смолға")
    println(tom.personToString())
}
class Person{
    var name: String = "Берік"
    var age: Int = 18

    fun sayHello(){
        println("Салем менің атым $name")
    }

    fun go(location: String){
        println("$name $location,ға бара жатыр")
    }

    fun personToString() : String{
        return "аты: $name  жасы: $age"
    }
}*/
//constructor
fun main() {
    val tom = Person("Tom")
    val bob = Person("Bob", 41)
    val sam = Person("Sam", 32, "JetBtains")

    println("Name: ${tom.name}  Age: ${tom.age}  Company: ${tom.company}")
    println("Name: ${bob.name}  Age: ${bob.age}  Company: ${bob.company}")
    println("Name: ${sam.name}  Age: ${sam.age}  Company: ${sam.company}")
}
class Person(_name: String){
    val name = _name
    var age: Int = 0
    var company: String = "Undefined"

    constructor(_name: String, _age: Int) : this(_name){
        age = _age
    }

    constructor(_name: String, _age: Int, _comp: String) : this(_name, _age){
        company = _comp
    }
}

Вычисляемый геттер
fun main() {
    val tom = Person("Tom", "Smith")
    println(tom.fullname)   // Tom Smith
    tom.lastname = "Simpson"
    println(tom.fullname)   // Tom Simpson
}
class Person(var firstname: String, var lastname: String){
    val fullname: String
        get() = "$firstname $lastname"
}   

Использование полей для хранения значений
fun main() {
    val tom = Person("ХЭНКС")
    println(tom.age)    // 1
    tom.age = 37
    println(tom.age)    // 37
    tom.age = 156
    println(tom.age)    // 37
}
class Person(val name: String){
    private var _age = 1
    var age: Int
        set(value){
            if((value > 0) and (value < 110))
                _age = value
        }
        get()=  _age
}

Интерфейсы
interface Movable{
    var speed: Int  // объявление свойства
    fun move()      // определение функции без реализации
    fun stop(){     // определение функции с реализацией по умолчанию
        println("Остановка")
    }
}
class Car : Movable{

    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}
class Aircraft : Movable{

    override var speed = 600
    override fun move(){
        println("Самолет летит со скоростью $speed км/ч")
    }
    override fun stop(){
        println("Приземление")
    }
}
fun main() {
    val m1: Movable = Car()
    val m2: Movable = Aircraft()
    // val m3: Movable = Movable() напрямую объект интерфейса создать нельзя
    m1.move()
    m1.stop()
    m2.move()
    m2.stop()
}

Реализация свойств
interface Info{
    val model: String
        get() = "Undefined"
    val number: String
}
class Car(override val model: String, override var number: String) : Movable, Info{
 
    override var speed = 60
    override fun move(){
        println("Машина едет со скоростью $speed км/ч")
    }
}
fun main() {
 
    val tesla: Car = Car("Tesla", "2345SDG")
    println(tesla.model)
    println(tesla.number)
 
    tesla.move()
    tesla.stop()
}





