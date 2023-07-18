package net.flow9.thisiskotlin.myapplication

class Wizard {
    var name: String = ""
    var age: Int = 0
    var gender: String = ""
    var money: Int = 0
    var hp: Int = 0
    var mp: Int = 0

    constructor(_name: String, _age: Int, _gender: String, _money: Int, _hp: Int, _mp: Int) {
        var name = _name
        var age = _age
        var gender = _gender
        var money = _money
        var hp = _hp
        var mp = _mp
    }

    fun attack() {
        println("에너지 볼")
    }

    fun fireBall() {
        println("파이어볼")
    }

    fun teleport() {
        println("${src}에서 ${dst}로 텔레포트")
    }
}