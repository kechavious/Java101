package Assignment3;

public class Question3 {
    public static void main(String[] args) {
        int[] orgarr = new int[]{1,2,2,3,4,5};
        int[] newarr = new int[]{6,7,2,2,3,0};

        for (int i : orgarr){
            System.out.print(i + " ");
        }
        System.out.println();

       int[] printCotain = Result(orgarr, newarr);

        for (int i: printCotain){
            if (i == 0){
                continue;
            }
            System.out.print(i + " ");
        }

    }
    public static int[] Result(int[] orgarr, int[] newarr){
        int[] printContain = new int[orgarr.length];
        for (int i = 0; i < orgarr.length; i ++){
            for(int j =0; j < newarr.length; j ++){
                if (orgarr[i] == newarr[j]){
                    printContain[i] = newarr[j];
                }
            }
        }
        return printContain;
    }
}
