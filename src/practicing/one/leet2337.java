package practicing.one;

public class leet2337 {
    public static void main(String[] args) {
        String start = "_L__R__R_L";
        String target = "L_____RL_R";


        char[] arr = start.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // Run this loop enough times
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == '_' && arr[j + 1] == 'L') {
                    swap(arr, j, j + 1);
                } else if (arr[j] == 'R' && arr[j + 1] == '_') {
                    swap(arr, j, j + 1);
                }
            }
        }

        String result = new String(arr);
        System.out.println(result.equals(target));
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
