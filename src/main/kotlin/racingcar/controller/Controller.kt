package racingcar.controller

import camp.nextstep.edu.missionutils.Console
import racingcar.view.OutputView

class Controller {
    val outputView = OutputView()

    fun run() {
        beginning()
    }

    fun beginning() {
        outputView.GuideName()
        outputView.GuideNumOfTrying()
    }
}
