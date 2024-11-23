package Chapter05;

public class jj {
    public static void main(String[] args) {
        int x = 5;
        int n = 4;

        int total = 0;

        for (int i = x; i >=0; i--){

            total += (i+n);
            System.out.println(total);
        }
        System.out.println(total);

    }
}
