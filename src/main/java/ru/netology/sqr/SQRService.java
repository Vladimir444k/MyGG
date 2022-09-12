package ru.netology.sqr;

public class SQRService {
    public int calculateRange (int number, int amount) {
        for (int i = 1; i < number; i++) {
            if (i * i > number && i * i < amount){
                return i;
            }
        }
        return 6;
    }
}
