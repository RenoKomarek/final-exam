package com.example.finalexam;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class finalexamControllerTest {

    public finalexamController finalexamController = new finalexamController();

    @Test
    void digitsum() {
        Integer given = 1234;
        Integer expected = 10;
        assertEquals(expected, finalexamController.digitsum(given));
    }
}