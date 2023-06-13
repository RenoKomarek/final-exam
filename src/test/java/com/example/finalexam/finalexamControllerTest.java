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

    @Test
    void usage() {
        Integer test1 = 3456;
        Integer test2 = 5463;
        Integer test3 = 6439;
        Integer expected2 = 3;

        finalexamController.digitsum(test1);
        finalexamController.digitsum(test2);
        finalexamController.digitsum(test3);

        assertEquals(expected2, finalexamController.usage());
    }
}