package racingcar.controller

import racingcar.model.Car
import racingcar.model.Race
import racingcar.view.InputView
import racingcar.view.OutputView

class Controller {
    val inputView = InputView()
    val outputView = OutputView()

    fun run() {
        val race = setupRace()
        playGame(race)
        concludeGame(race)
    }

    private fun setupRace(): Race {
        outputView.guideName()
        val names = inputView.readNames()
        val cars = names.map { Car(it) }

        return Race(cars)
    }

    private fun playGame(race: Race) {
        outputView.guideTryCount()
        val tryCount = inputView.readTryCount()

        outputView.guideResult()

        repeat(tryCount) {
            race.playRound()
            outputView.printRoundResult(race.cars)
        }
    }

    private fun concludeGame(race: Race) {
        val winners = race.findWinner()
        outputView.printWinner(winners)
    }
}
