package racingcar.model

import camp.nextstep.edu.missionutils.Randoms

class Race(val cars: List<Car>) {
    fun playRound() {
        cars.forEach { car ->
            car.move(Randoms.pickNumberInRange(0, 9))
        }
    }

    fun findWinner(): List<Car> {
        val maxPosition = cars.maxOf { it.position }

        return cars.filter { it.position == maxPosition }
    }
}
