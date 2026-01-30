package racingcar.view

import camp.nextstep.edu.missionutils.Console

class InputView {
    private val namePattern = Regex("^([a-zA-Z가-힣]{1,5})(,[a-zA-Z가-힣]{1,5})*$")

    fun readNames(): List<String> {
        val input = Console.readLine() ?: throw IllegalArgumentException("[Error] 입력값이 없습니다.")

        if (!namePattern.matches(input)) {
            throw IllegalArgumentException("[Error] 이름은 5글자 이하의 영문/한글이어야 하며, 쉼표로 구분해야 합니다.")
        }

        return input
            .split(",")
            .map { it.trim() }
    }

    fun readTryCount(): Int {
        val input = Console.readLine()

        return input?.takeIf { it.matches(Regex("^[0-9]+$")) }?.toInt()
            ?: throw IllegalArgumentException("[Error] 올바른 숫자를 입력해 주세요.")
    }
}
