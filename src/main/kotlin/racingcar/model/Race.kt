package racingcar.model

import camp.nextstep.edu.missionutils.Randoms

class Race(cars: List<Car>, tryCount: Int) {
    fun moveOrStop(car: Car) {
        val randomNum = Randoms.pickNumberInRange(0,9)
        if (randomNum >= 4)
            car.position++
    }
}
