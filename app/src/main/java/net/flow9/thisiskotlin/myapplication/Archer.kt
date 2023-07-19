package net.flow9.thisiskotlin.myapplication

class Archer : Character {
    var name: String
    var age: Int
    var gender: String
    var money: Int
    var hp: Int
    var weapons:MutableList<String> //무기가 여러개 있을수도있으니까 가변 리스트로 저장

    constructor(_name: String, _age: Int, _gender: String, _money: Int, _hp: Int) {
        weapons = mutableListOf<String>()   //별다른값 지정x 객체만 만들어준다.
        name = _name
        age = _age
        gender = _gender
        money = _money
        hp = _hp
        println("${name}의 이름을 가진 궁수 생성")
    }

    override fun attack() {
        println("활쏘기")
    }

    fun windArrow() {
        println("바람의 화살")
    }

    fun windJump(destination: String) {
        println("${destination}까지 도약")
    }
}