package racingcar.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RaceTest {
    @Test
    fun `차량이 주어졌을 때 우승자를 찾을 수 있다`() {
        // given
        val pobiCar = Car("pobi")
        pobiCar.position = 5
        val woniCar = Car("woni")
        woniCar.position = 3
        val expected = listOf(pobiCar)

        // when
        val actual = Race(listOf(pobiCar, woniCar), 5).findWinner()

        // then
        assertEquals(expected, actual)
    }
}
