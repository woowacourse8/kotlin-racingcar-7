package racingcar.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    fun readNames(): List<String> {
        val input = Console.readLine() ?: throw IllegalArgumentException("[Error] 입력값이 없습니다.")
        return input
            .split(",")
            .map { it.trim() }
            .apply { validateNames(this) }
    }

    fun readTryCount(): Int {
        val input = Console.readLine()
        return input.toIntOrNull() ?: throw IllegalArgumentException("[Error] 숫자를 입력해 주세요.")
    }

    private fun validateNames(names: List<String>) {
        names.forEach { name ->
            require(name.isNotEmpty()) { "[Error] 이름은 빈 값일 수 없습니다." }
            require(name.length <= 5) { "[Error] 자동차 이름은 5글자를 초과할 수 없습니다. " }
        }
    }
}
