package AdvancedTasks;

public class AmtNum {

    /* Подсчитываем число '2' между 0 и n */
    int numberOf2sInRange(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) { // Можем начать с 2
            count += numberOf2s(i);
        }
        return count;
    }

    /* подсчитываем число '2' в одном числе */
    int numberOf2s(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 10 == 2) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
