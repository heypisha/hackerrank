package dayofprogrammer

import org.junit.jupiter.api.Assertions.*
 class DayOfProgrammerTest{
  private val dayOfProgrammer = DayOfProgrammer();

  fun testTransitionYear(){
   assertEquals("26.09.1918",dayOfProgrammer.dayofProgrammer(1918))
  }

  fun testJulianLeapYear(){
   assertEquals("12.09.1700",dayOfProgrammer.dayofProgrammer(1700))
  }

  fun testJulianCommonYear(){
   assertEquals("13.09.1701",dayOfProgrammer.dayofProgrammer(1701))
  }

  fun testGregorianLeapYear(){
   assertEquals("26.09.1700",dayOfProgrammer.dayofProgrammer(1700))
  }
  fun testGregorianCommonYear(){
   assertEquals("26.09.1700",dayOfProgrammer.dayofProgrammer(1700))
  }
 }