package racingcar.model

import camp.nextstep.edu.missionutils.Randoms
import racingcar.view.OutputView

data class Race(val cars: List<Car>, val tryCount: Int) {
    val outputView = OutputView()

    fun runRound(cars: List<Car>) {
        for (car in cars) {
            moveOrStop(car)
            outputView.printResult(car)
        }
    }

    private fun moveOrStop(car: Car) {
        val randomNum = Randoms.pickNumberInRange(0,9)
        if (randomNum >= 4)
            car.position++
    }
}
