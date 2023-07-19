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

    fun purchaseWeapon(character: Character) {
        if (character is Archer) {
            character?.run {
                if (money >= bowPrice) {
                    println("[구매후 금액]: [${money} - ${bowPrice}] = ${money - bowPrice}")
                    money-=bowPrice
                    weapons.add("슈퍼 활")
                } else {
                    println("잔액이 부족합니다.")
                }
            }
        }
        if(character is Wizard){
            character?.run{
                if (money >= staffPrice){
                    println("[구매 후 금액] = [${money}-${staffPrice}]= ${money-staffPrice}")
                    money -= staffPrice
                    weapons.add("슈퍼 스태프")
                } else {
                    println("잔액이 부족합니다.")
                }
            }
        }

    }
}