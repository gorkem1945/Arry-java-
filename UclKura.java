package com.arslaner.collection;

import java.util.Random;

public class UclKura {
    int[] gruplar = new int[9];
    Random random = new Random();

    public void grupkura() {

        for (int x = 0; x <= 8; x++) {
            boolean kuralar = false;
            int cekıms = random.nextInt(11) + 1;

            for (int j = 0; j <= 8; j++) {
                if (gruplar[j] == cekıms){
                    kuralar = true;
                    break;
                }
            }


            if (!kuralar) {
                gruplar[x] = cekıms;
            }
            else {
                x--;
            }
        }
    }
}
