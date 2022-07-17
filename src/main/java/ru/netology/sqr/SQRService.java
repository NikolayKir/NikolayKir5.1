package ru.netology.sqr;

public class SQRService {

    public int myCount(int minLimit, int maxLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (minLimit <= x & x <= maxLimit) {
                count++;
            }
        }
        return count;
    }
}
