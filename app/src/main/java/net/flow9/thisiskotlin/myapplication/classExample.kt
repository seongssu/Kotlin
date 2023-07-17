package net.flow9.thisiskotlin.myapplication

fun main() {
    var s1 = Student()
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student {
    lateinit var name:String
    var age:Int = 0

    fun displayInfo(){
        println("내이름은: ${name}")
        println("나이는 ${age}살 입니다.")
    }
}

