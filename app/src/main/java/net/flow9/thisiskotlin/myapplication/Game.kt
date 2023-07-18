package net.flow9.thisiskotlin.myapplication

fun main() {

}

class Character() {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0

    fun fireBall() {
        println("파이어볼!")
    }

    fun composing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3} 입니다.")
        return device3
    }
}