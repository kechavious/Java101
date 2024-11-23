package Chapter02;

public class ShowCurrentTime {
    public static void main(String[] args) {
        long Currenttime = System.currentTimeMillis();

        long ShowTotalSec = Currenttime / 1000;

        long ShowCurrentSec = Currenttime % 60;

        long TotalMin = ShowTotalSec / 60;

        long CurrentMin = ShowCurrentSec% 60;

        long totalhour = TotalMin / 60;
        long currenthour =totalhour % 24;


        System.out.println(currenthour + " : " + CurrentMin + " : " + ShowCurrentSec);
    }
}
