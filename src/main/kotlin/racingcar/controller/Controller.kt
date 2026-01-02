package racingcar.controller

import racingcar.view.*

class Controller {
    val outputView = OutputView()
    val inputView = InputView()

    fun run() {
        beginning()
    }

    fun beginning() {
        outputView.guideName()
        val names = try {
            inputView.readNames()
        } catch(e: IllegalArgumentException) {
            println("[Error] 입력값이 잘못됐습니다.")
            return
        }
        outputView.guideTryCount()
        val tryCount = try {
            inputView.readTryCount()
        } catch(e: IllegalArgumentException) {
            println("[Error] 입력값이 잘못됐습니다.")
            return
        }
    }
}
