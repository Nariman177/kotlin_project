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
fun main() {

    displayUser("Tom", 23)
    displayUser("Alice", 19)
    displayUser("Kate", 25)
}
fun displayUser(name: String, age: Int){
    println("Name: $name   Age: $age")
}