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
        middle(race)
        end(race)
    }

    fun beginning(): Race {
        outputView.guideName()
        val names = inputView.readNames()
        outputView.guideTryCount()
        val tryCount = inputView.readTryCount()

        val cars = names.map { name ->
            val car = Car(name)
            car
        }
        return Race(cars, tryCount)
    }

    fun middle(race: Race) {
        outputView.guideResult()

        for (i in 1..race.tryCount) {
            race.runRound(race.cars)
        }
    }

    fun end(race: Race) {
        val winners = race.findWinner()
        outputView.printWinner(winners)
    }
}
