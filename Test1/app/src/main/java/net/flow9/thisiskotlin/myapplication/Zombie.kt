package net.flow9.thisiskotlin.myapplication

class Zombie {
    var name: String = ""
    var color: String = ""
    var height: Double = 0.0
    var hp: Int = 0
    var damage: Int = 0

    constructor(_name: String, _color: String, _height: Double, _hp: Int, _damage: Int) {
        name = _name
        color = _color
        height = _height
        hp = _hp
        damage = _damage

        println("${name}좀비 생성")

    }
    fun attack(){
        println("물어뜯기 공격!!!!!")
    }
    fun virus(){
        println("바이러스 퍼뜨리기!!!!!!")
    }
}