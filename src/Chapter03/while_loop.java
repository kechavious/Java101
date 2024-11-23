package Chapter03;

public class while_loop {
    public static void main(String[] args) {
        int counter = 0;
        int x = 0;
        int j = 0;


        while (counter < 100 || x < 100){
            counter++;
            j = ++x;

        }
        System.out.println(counter);
        System.out.println(j);
        System.out.println(x);

    }
}
