package racingcar.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNames(): List<String> {
        val inputNames = Console.readLine() ?: throw IllegalArgumentException("[Error] 입력값이 없습니다.")
        val names = checkCarNames(inputNames)
        return names
    }

    fun readTryCount(): Int {
        val inputTryCount = Console.readLine()
        val tryCount = inputTryCount.toIntOrNull() ?: throw IllegalArgumentException("[Error] 숫자 값이 입력되지 않았습니다.")
        return tryCount
    }

    private fun checkCarNames(inputNames: String): List<String> {
        val names = inputNames.split(",")

        names.forEach { n ->
            require(n.length <= 5)
        }

        return names
    }
}
