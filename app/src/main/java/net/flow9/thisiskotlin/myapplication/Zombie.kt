package net.flow9.thisiskotlin.myapplication

class Zombie : Monster {
    var name: String
    var color: String
    var height: Double
    var hp: Int
    var damage: Int

    constructor(_name: String, _color: String, _height: Double, _hp: Int, _damage: Int) {
        name = _name
        color = _color
        height = _height
        hp = _hp
        damage = _damage
        println("${name}좀비 생성")
    }

    override fun attack() {
        println("물어 뜯기")
    }

    fun virus() {
        println("바이러스 퍼뜨리기")
    }
}