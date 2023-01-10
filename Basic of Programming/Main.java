// import java.io.*;
// import java.util.*;
// class Main {
//     class Student{
//         int scholarNumber;
//         int marks;
//         String name;
//         public Student(String name, int scholarNumber, int marks) {
//             this.name = name;
//             this.scholarNumber = scholarNumber;
//             this.marks = marks;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int t=  sc.nextInt();
//         Student[] students = new Student[t];
//         sc.nextLine();
//         for (int i = 0; i < students.length; i++) {
//             // String s = sc.nextLine();
//             // String[] parts = s.split(" ");
//             students[i].name= sc.nextLine();
//             students[i].scholarNumber = sc.nextInt();//Integer.parseInt(parts[1]);
//             students[i].marks = sc.nextInt();//Integer.parseInt(parts[2]);
//         }

//         Arrays.sort(students, (s1, s2) -> {
//             if (s1.marks != s2.marks) {
//               return Integer.compare(s2.marks, s1.marks);
//             }
//             return Integer.compare(s1.scholarNumber, s2.scholarNumber);
//           });
//           // print the ranklist
// //           for (int i = 0; i < t; i++) {
// //             System.out.printf("%s %d %d\n", i+1, students[i].name, students[i].scholarNumber, students[i].marks);
// //           }

// //     }
// public static void main(String[] args) {
//     // read the input
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     Student[] students = new Student[n];
//     sc.nextLine();
//     for (int i = 0; i < n; i++) {
//       String[] parts = sc.nextLine().split(" ");
//       String name = parts[0];
//       int scholarNumber = Integer.parseInt(parts[1]);
//       float marks = Float.parseFloat(parts[2]);
//       students[i] = new Student(name, scholarNumber, marks);
//     }

//     // sort the list of students
//     Arrays.sort(students, (s1, s2) -> {
//       if (s1.marks != s2.marks) {
//         return Float.compare(s2.marks, s1.marks);
//       }
//       return Integer.compare(s1.scholarNumber, s2.scholarNumber);
//     });

//     // print the ranklist
//     for (int i = 0; i < n; i++) {
//       System.out.printf("%s %d %.0f\n", i+1, students[i].name, students[i].scholarNumber, students[i].marks);
//     }
//   }
// }
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        // Read in the values of n and k
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        // Read in the values of the coins
        int[] c = new int[k];
        for (int i = 0; i < k; i++) {
          c[i] = scanner.nextInt();
        }

        long[][] dp = new long[k + 1][n + 1];
        for (int i = 0; i <= k; i++) {
        dp[i][0] = 1;
        }
    for (int i = 1; i <= k; i++) {
      for (int j = 1; j <= n; j++) {
        dp[i][j] = dp[i - 1][j] + (j >= c[i - 1] ? dp[i][j - c[i - 1]] : 0);
      }
    }

    System.out.println(dp[k][n]);
    }
}


