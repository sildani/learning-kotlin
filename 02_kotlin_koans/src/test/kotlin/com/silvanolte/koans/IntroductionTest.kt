/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.silvanolte.koans

import kotlin.test.Test
import kotlin.test.assertEquals

class IntroductionTest {

    @Test fun testHelloWorld() {
        val classUnderTest = Introduction()
        assertEquals("OK", classUnderTest.start(), "start() should return \"OK\"")
    }
    
}
