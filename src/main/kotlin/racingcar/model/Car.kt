package racingcar.model

data class Car(val name: String, private var _position: Int = 0) {
    val position: Int get() = _position

    fun move(randomNum: Int) {
        if (randomNum >= MOVING_THRESHOLD)
            _position++
    }

    companion object {
        private const val MOVING_THRESHOLD = 4
    }
}
