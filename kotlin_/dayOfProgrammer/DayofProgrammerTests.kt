package dayOfProgrammer

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DayofProgrammerTest {

    private val dayOfProgrammer = DayofProgrammer()

    @Test
    fun testTransitionYear1918() {
        assertEquals("26.09.1918", dayOfProgrammer.dayOfProgrammer(1918))
    }

    @Test
    fun testJulianLeapYear() {
        assertEquals("12.09.1700", dayOfProgrammer.dayOfProgrammer(1700))
    }

    @Test
    fun testJulianCommonYear() {
        assertEquals("13.09.1701", dayOfProgrammer.dayOfProgrammer(1701))
    }

    @Test
    fun testGregorianLeapYear() {
        assertEquals("12.09.2000", dayOfProgrammer.dayOfProgrammer(2000))
    }

    @Test
    fun testGregorianCommonYear() {
        assertEquals("13.09.2100", dayOfProgrammer.dayOfProgrammer(2100))
    }

    @Test
    fun testPostTransitionYear() {
        assertEquals("13.09.1919", dayOfProgrammer.dayOfProgrammer(1919))
    }

    @Test
    fun testPreJulianYear() {
        assertEquals("12.09.1600", dayOfProgrammer.dayOfProgrammer(1600))
    }
}