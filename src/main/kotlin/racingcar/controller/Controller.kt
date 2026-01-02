package racingcar.controller

import racingcar.model.Car
import racingcar.model.Race
import racingcar.view.InputView
import racingcar.view.OutputView

class Controller {
    val outputView = OutputView()
    val inputView = InputView()

    fun run() {
        val race = beginning()
    }

    fun beginning(): Race {
        outputView.guideName()
        val names = getValidNames()
        outputView.guideTryCount()
        val tryCount = getValidTryCount()

        val cars = names.map { name ->
            val car = Car(name)
            car
        }
        return Race(cars, tryCount)
    }

    fun middle() {
    }

    private fun getValidNames(): List<String> {
        return try {
            inputView.readNames()
        } catch (e: IllegalArgumentException) {
            println("[Error] 입력값이 잘못됐습니다.")
            getValidNames()
        }
    }

    private fun getValidTryCount(): Int {
        return try {
            inputView.readTryCount()
        } catch (e: IllegalArgumentException) {
            println("[Error] 입력값이 잘못됐습니다.")
            getValidTryCount()
        }
    }
}
