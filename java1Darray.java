import java.util.Scanner;

public class java1Darray {

    public static boolean canWin(int leap, int[] game){
        return isSolvable(leap, game, 0);
    }
    public static boolean isSolvable(int m, int[] arr, int i){
        if(i < 0 || arr[i] == 1){
            return false;
        }
        if((i == arr.length - 1) || i+m > arr.length-1){
            return true;
        }
        arr[i] = 1;

        return isSolvable(m, arr, i+1) || isSolvable(m, arr, i-1) || isSolvable(m, arr, i+m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while(q-- > 0){
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for(int i = 0; i < n; i++){
                game[i] = scan.nextInt();
            }
            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}
// move backward: if cell i-1 exists you can walk to i+1
// move forward: if cell i+1 contains a zero, you can walk to cell i+1
//               if cell i+leap contains a zero, you can walk to cell i+1
// if you are standing in cell n-1 or the value of i+leap >= n you can walk or jump off the end of the array and win the game.
// in other words, you can move from index i to index i+1, i-1 or i+leap as long as the destination index is a cell containing a 0.
// if the destination index is greater than n-1, you win the game.

// canWin function has parameter as: int leap, int[n] game returns boolean true if the game can be won, otherwise false.
