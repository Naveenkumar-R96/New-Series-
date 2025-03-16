package First_phase.searching.BinarySearching;

public class leet744 {
    /*public static void main(String[] args) {
        String[] letters = {"c", "f", "j"};
        String target = "c";
       *//* int ascii=(int) target.charAt(0);
        System.out.println(ascii);*//*
        int start = 0;
        int end = letters.length - 1;
        String ans = letters[0];
        System.out.println(ans);

        while (start <= end) {
            int mid = start + end / 2;
            int value = letters[mid].charAt(0);


            if (letters[mid].charAt(0) > target.charAt(0)) {
                end = mid - 1;
                ans = letters[mid];
            } else {
                start = mid + 1;
            }

        }
        System.out.println(ans);
    }*/
    public static void main(String[] args) {
        char a='j';
        char b='b';
        if(b>a){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
