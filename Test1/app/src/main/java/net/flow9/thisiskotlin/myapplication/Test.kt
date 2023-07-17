package net.flow9.thisiskotlin.myapplication

fun main() {
    var mathScore = readLine()!!.toInt()
    var myRank = checkRank(mathScore)
    println("내 등급은 ${myRank}")
}

fun checkRank(score: Int) : String {
    return when (score) {
        in 90..100 -> return "A"
        in 80..89 -> return "B"
        in 70..79 -> return "C"
        else -> return "F"
    }
}