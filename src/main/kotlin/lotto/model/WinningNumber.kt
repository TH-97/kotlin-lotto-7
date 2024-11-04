package lotto.model

class WinningNumber(private val numbers: List<Int>) {
    init {
        require(numbers.size == numbers.distinct().size) { "[ERROR] 중복된 값이 도출되었습니다" }
    }

    fun addBonusNumber(bonusNumber: Int): WinningNumber {
        val updatedNumbers = numbers + bonusNumber
        return WinningNumber(updatedNumbers)
    }

    override fun toString(): String {
        return numbers.toString()
    }
}