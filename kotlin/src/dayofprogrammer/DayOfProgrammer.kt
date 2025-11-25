package dayofprogrammer

class DayOfProgrammer {
    fun dayofProgrammer(year: Int): String {
        return when{
            year == 1918 -> "26.09.1918"
            (year < 1918 && year % 4 == 0) || (year > 1918 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) -> "12.09.$year"
            else -> "13.09.$year"
        }
    }
}