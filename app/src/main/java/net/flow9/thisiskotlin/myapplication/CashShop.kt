package net.flow9.thisiskotlin.myapplication

class CashShop private constructor() {
    private val bowPrice = 150
    private val staffPrice = 120

    companion object {
        @Volatile
        private var instance: CashShop? = null

        fun getInstance(): CashShop {
            if (instance == null) {
                synchronized(this) {
                    instance = CashShop()
                }
            }
            return instance!!
        }
    }

    fun purchaseBowByArcher(character: Archer) {
        if (character.money >= bowPrice) {
            println("[구매후 금액]: [${character.money} - ${bowPrice} = ${character.money - bowPrice} ")
            character.money -= bowPrice
            character.weapons.add("슈퍼 활")
        } else {
            println("돈이 부족합니다.")
        }
        if (character.money >= staffPrice){
            println("[구매후 금액]: [${character.money}-${staffPrice}= ${character.money-staffPrice}")
            character.money -= staffPrice
            character.weapons.add("슈퍼 스태프")
        } else {
            println("돈이 부족합니다.")
        }
    }}