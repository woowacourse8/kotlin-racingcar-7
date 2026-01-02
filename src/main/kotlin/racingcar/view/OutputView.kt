package racingcar.view

import racingcar.model.Car

class OutputView {
    fun guideName() = println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,)기준으로 구분)")

    fun guideTryCount() = println("시도할 횟수는 몇 회인가요?")

    fun guideResult() = println("실행 결과")

    fun printResult(car: Car) = println(formatCarResult(car))

    fun printWinner(winners: List<Car>) {
        val winners = winners.map { car ->
            car.name
        }
        println("최종 우승자 : ${winners.joinToString(",")}")
    }

    fun formatCarResult(car: Car): String {
        return "${car.name} : ${"-".repeat(car.position)}"
    }
}
