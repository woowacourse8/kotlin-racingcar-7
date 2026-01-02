package racingcar.view

import racingcar.model.Car

class OutputView {
    fun guideName() = println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)")
    fun guideTryCount() = println("시도할 횟수는 몇 회인가요?")
    fun guideResult() = println("\n실행 결과")

    fun printRoundResult(cars: List<Car>) {
        cars.forEach { car ->
            println("${car.name} : ${"-".repeat(car.position)}")
        }
        println()
    }

    fun printWinner(winners: List<Car>) {
        println("최종 우승자 : ${winners.joinToString(",") { it.name }}")
    }
}
