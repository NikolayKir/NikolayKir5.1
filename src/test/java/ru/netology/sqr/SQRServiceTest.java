package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService service = new SQRService();

        int actual = service.myCount(200, 700);
        int exptected = 12;

        Assertions.assertEquals(exptected, actual);
    }
}
