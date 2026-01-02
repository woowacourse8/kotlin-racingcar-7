package racingcar.view

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import racingcar.model.Car

class OutputViewTest {
    @Test
    fun `자동차의 이름과 위치가 잘 출력된다`() {
        // given
        val pobiCar = Car("pobi")
        pobiCar.position = 3
        val expected = "pobi : ---"

        // when
        val actual = OutputView().formatCarResult(pobiCar)

        // then
        assertThat(actual).isEqualTo(expected)
    }
}
