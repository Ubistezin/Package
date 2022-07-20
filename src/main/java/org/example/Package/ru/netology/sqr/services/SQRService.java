package org.example.Package.ru.netology.sqr.services;

public class SQRService {

    public int CalcSqrt(int x) {
        for (int i = 10; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}