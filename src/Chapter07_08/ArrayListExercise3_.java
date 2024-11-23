package Chapter07_08;

public class ArrayListExercise3_ {
    public static void main(String[] args) {
        int[] arr = {4,1,3,5,2};
        //{4,1,3,5,2}
        //{1,4,3,5,2}
        //{1,3,4,5,2}

        //{1,3,4,5,2}
        //{1,3,4,5,2}
        //{1,3,4,5,2}
        //{1,3,4,2,5}

        //{1,3,4,2,5}
        //{1,3,4,2,5}
        //{1,3,2,4,5}
        //{1,3,2,4,5}

        //{1,3,2,4,5}
        //{1,2,3,4,5}

        increasing(arr);
        System.out.print("Increasing: ");
        print(arr);

        System.out.println();

        decreasing(arr);
        System.out.print("Decreasing: ");
        print(arr);


    }
    public static void increasing(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){
            for (int j = 0 ; j < n - 1 - i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
    public static void decreasing(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n ; i ++){
            for (int j = 0; j < n  - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void print(int[] arr){
        for (int i : arr){
            System.out.print(i + ",");
        }
    }
}
