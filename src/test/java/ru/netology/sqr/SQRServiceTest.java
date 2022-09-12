package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"10, 99"})
    void calculateRange(int actual) {
        SQRService service = new SQRService();
        int expected = service.calculateRange(10,99);
    }
}