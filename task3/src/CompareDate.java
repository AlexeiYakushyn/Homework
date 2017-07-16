import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by alexei.yakushyn on 7/11/17.
 * Написать класс, имплементирующий Comparable,
 * в котором есть два целочисленных поля - месяц и день,
 * так, чтоб сначала сравнивались месяцы, потом дни.
 * (Проверить потом можно через Arrays.parallelSort())
 */

public class CompareDate implements Comparable<CompareDate> {
    private static int day;
    private static int month;

    public void CompareDate(int day, int month) {
        this.day = day;
        this.month = month;
    }

    @Override
    public int compareTo(CompareDate compareDate) {
        CompareDate entry = compareDate;
        int days = day - entry.day;
        int months = month - entry.month;

        return days + months;
    }

    public static void main(String[] args) {
        int[] days = new int[31];
        int[] months = new int[12];

        for (int i = 0; i < days.length; i++) {
            day = (int) ((Math.random() * 30) + 1);
            days[i] = day;
        }
        for (int i = 0; i < months.length; i++) {
            month = (int) (Math.random() * 11) + 1;
            months[i] = month;
        }

        Arrays.parallelSort(days);
        Arrays.parallelSort(months);

        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + " ");
        }
        System.out.println("");

        CompareDate compareDate1 = new CompareDate();
        compareDate1.day = 15;
        compareDate1.month = 12;

        CompareDate compareDate2 = new CompareDate();
        compareDate2.day = 25;
        compareDate2.month = 8;

        System.out.println(compareDate1.compareTo(compareDate2));


    }
}
