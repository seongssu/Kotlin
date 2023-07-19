package net.flow9.thisiskotlin.myapplication

fun main() {
    val worldName = "스코월드"

    var myName = InputMyInfo("name").toString()

    var myAge = InputMyInfo("age").toString().toInt()

    var myJob = InputMyInfo("job").toString()

    var myGender = InputMyInfo("gender").toString()

    var myMoney = InputMyInfo("money").toString().toInt()

    var myHp = InputMyInfo("hP").toString().toInt()


    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    for (name in names) {
        if (myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass = false
            break
        }
    }
    if (myAge < 12) {
        println("12세 미만은 이용할 수 없습니다.")
        isAgePass = false
    }

    if (myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass = false
    }

    if (isNamePass && isAgePass && isJobPass) {
        displayInfo(worldName, myName, myAge, myJob)

        if (myJob == "마법사") {
            println("마법사는 초기 mp도 입력해 주세요")
            var myMp = InputMyInfo("mp").toString().toInt()
            var myCharacter = Wizard(myName, myAge, myGender, myMoney, myHp, myMp)

            while (true) {
                println("[1]슬라임동굴 [2]좀비마을 [3]캐쉬샵 [4]종료")
                var selectNumber = InputMyInfo("selectNumber").toString().toInt()

                when (selectNumber) {
                    1 -> {
                        selectWorld(1, myCharacter)
                    }

                    2 -> {
                        selectWorld(2, myCharacter)
                    }

                    3 -> {
                        openCashShop(myCharacter)
                    }

                    4 -> {
                        println("게임 종료")
                        break
                    }

                    else -> {
                        break
                    }
                }
            }
        } else if (myJob == "궁수") {
            println("궁수를 선택했군요")
            var myCharacter = Archer(myName, myAge, myGender, myMoney, myHp)

            while (true) {
                println("[1]슬라임동굴 [2]좀비마을 [3]캐쉬샵 [4]종료")
                var selectNumber = InputMyInfo("selectNumber").toString().toInt()

                when (selectNumber) {
                    1 -> {
                        selectWorld(1, myCharacter)
                    }

                    2 -> {
                        selectWorld(2, myCharacter)
                    }

                    3 -> {
                        openCashShop(myCharacter)
                    }

                    4 -> {
                        println("게임 종료")
                        break
                    }

                    else -> {
                        break
                    }
                }
            }
        }
    }
}

fun displayInfo(worldName: String, myName: String, myAge: Int, myJob: String) {
    println("==================${worldName}에 오신것을 환영합니다==================")
    println("당신의 정보는 다음과 같습니다.")
    println("이름: ${myName}입니다.")
    println("나이는: ${myAge}입니다.")
    println("직업은: ${myJob}입니다.")
    println("모험을 떠나 볼까요?")
}

fun selectWorld(selectWorld: Int, myCharacter: Character) {
    if (selectWorld == 1) {
        if (myCharacter is Archer){
            var slime1 = Slime("초록슬라임","초록",30.2,200,10)
            slime1.attack()
            myCharacter.windArrow()
            slime1.poison()
        } else if(myCharacter is Wizard) {
            var slime1 = Slime("파랑슬라임", "파랑", 30.2, 200, 10)
            slime1.attack()
            myCharacter.fireBall()
            slime1.poison()
        }
        else if(selectWorld == 2){
            if(myCharacter is Archer){
                var zombie1 = Zombie("파랑좀비","파랑",142.2,500,25)
                zombie1.virus()
                myCharacter.windJump("아파트")
            } else if(myCharacter is Wizard){
                var zombie1 = Zombie("파랑좀비", "파랑", 142.2,500,25)
                zombie1.virus()
                myCharacter.teleport(10,20)
            }
        }
    }
}



fun InputMyInfo(type: String): Any? {
    return when (type) {
        "name" -> {
            println("이름을 입력해주세요")
            while (true) {
                try {
                    var originName = readLine()
                    if (originName?.first() != '_' && originName?.first() != '!') {
                        return originName
                    } else {
                        println("이름을 다시 입력해 주세요")

                    }
                } catch (e: Exception) {
                    println("이름을 다시 입력해주세요")
                }
            }
        }

        "age" -> {
            println("나이를 입력해주세요")
            while (true) {
                try {
                    var originAge: String? = readLine()
                    return originAge?.toInt() ?: -2
                } catch (e: Exception) {
                    println("나이를 입력해주세요")
                }
            }
        }

        "job" -> {
            println("직업을 입력해주세요")
            while (true) {
                try {
                    var originJob = readLine()
                    if (originJob?.equals("궁수") == true || originJob?.equals("마법사") == true) {
                        return originJob
                    } else {
                        println("직업을 다시 입력해주세요")
                    }
                } catch (e: java.lang.Exception) {
                    println("직업을 다시 입력해주세요")
                }
            }
        }

        "gender" -> {
            println("성별을 입력해주세요")
            while (true) {
                try {
                    var originGender = readLine()
                    if (originGender.equals("남") == true || originGender.equals("녀") == true) {
                        return originGender
                    } else {
                        println("성별을 다시 입력해 주세요")
                    }
                } catch (e: java.lang.Exception) {
                    println("성별을 다시 입력해주세요")
                }
            }
        }

        "money" -> {
            while (true) {
                try {
                    println("초기 자본을 입력해주세요")
                    var originMoney: String? = readLine()
                    return originMoney?.toInt() ?: -1

                } catch (e: java.lang.Exception) {
                    println("초기자본을 다시 입력해주세요")
                }
            }
        }

        "hP" -> {
            while (true) {
                try {
                    println("초기 HP를 입력해주세요")
                    var originHP: String? = readLine()
                    return originHP?.toInt() ?: -1
                } catch (e: java.lang.Exception) {
                    println("초기 HP를 다시 입력 해주세요")
                }
            }
        }

        "mP" -> {
            while (true) {
                try {
                    println("초기 MP를 입력해주세요")
                    var originMp: String? = readLine()
                    return originMp?.toInt() ?: -1
                } catch (e: java.lang.Exception) {
                    println("초기 MP를 다시 입력 해주세요")
                }
            }
        }

        "selectWorld" -> {
            print("던전을 선택해주세요")
            while (true) {
                try {
                    var selectWorld: String? = readLine()
                    return selectWorld?.toInt() ?: -1

                } catch (e: java.lang.Exception) {
                    println("던전을 다시 선택해주세요")
                }
            }
        }

        "selectNumber" -> {
            println("번호를 선택해주세요")
            while (true) {
                try {
                    var selectNumber: String? = readLine()
                    return selectNumber?.toInt() ?: -1
                } catch (e: java.lang.Exception) {
                    println("번호를 다시 선택해주세요")
                }
            }
        }

        else -> {
            return "no"
        }
    }
}

fun openCashShop(character: Character) {
    var cashShop = CashShop.getInstance()

    if(character is Archer){
        println("구매전 무기: ${character.weapons}")
        cashShop.purchaseWeapon(character)
        println("구매후 무기: ${character.weapons}")
    } else if(character is Wizard) {
        println("구매전 무기: ${character.weapons}")
        cashShop.purchaseWeapon(character)
        println("구매후 무기: ${character.weapons}")
    }

}

