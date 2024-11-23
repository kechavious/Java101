package Chapter03;

public class if_else {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        if (x > 2){
            if (y > 2){
                int z = x + y;
                System.out.println(z);
            }
        }else{
            System.out.println(x);
        }
    }
}
