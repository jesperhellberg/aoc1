package com.jjhellberg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicTest {

    Logic logic = new Logic();

    @Test
    void aoc1() {
        assertEquals("3", logic.aoc1("1122"));
        assertEquals("4", logic.aoc1("1111"));
        assertEquals("0", logic.aoc1("1234"));
        assertEquals("9", logic.aoc1("91212129"));

    }

    @Test
    void aoc12() {
        assertEquals("6", logic.aoc12("1212"));
        assertEquals("0", logic.aoc12("1221"));
        assertEquals("4", logic.aoc12("123425"));
        assertEquals("12", logic.aoc12("123123"));
        assertEquals("4", logic.aoc12("12131415"));

    }
}