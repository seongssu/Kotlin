package net.flow9.thisiskotlin.myapplication

fun main() {

}

class Character {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0


//    init {
//        println("매개변수 없는 생성자 실행 완료")
//    }

    constructor(_name: String, _hairColor: String, _height: Double) {
        println("${_name}을 생성자로 넘겼어요 \n ${_hairColor}을 생성자로 넘겼어요 \n ${_height}을 생성자로 넘겼어요")
    }


    fun fireBall() {
        println("파이어볼!")
    }

    fun composing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3} 입니다.")
        return device3
    }
}