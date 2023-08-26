import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String str = "";
        
        for(int i=1; i<=a; i++){
            str += "*";
        }
        for(int j=1; j<=b; j++){
            System.out.println(str);    
        }
    }
}


// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();

//         for (int i = 0; i < b; i++) {
//             for (int j = 0; j < a; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
   