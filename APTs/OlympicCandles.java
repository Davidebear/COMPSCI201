import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.ArrayList;

public class OlympicCandles{
    public int numberOfNights(int[] candles){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i : candles) pq.add(i);
        int night = 0;
        while(true) {
            if (night + 1 > candles.length) return night;

            int[] candlesToBurn = new int[night+1];
            for (int i = 0; i < night+1; i++) {candlesToBurn[i] = pq.remove();}

            for (int k = 0; k < candlesToBurn.length; k++) {
                if (candlesToBurn[k] == 0) return night;
                candlesToBurn[k] = candlesToBurn[k] - 1;
            }

            for (int candle : candlesToBurn) {
                pq.add(candle);
            }

            night++;
        }
    }
}