import java.util.Scanner;
public class Array3DInput {
    public static void main(String[] args) {
        
        System.out.println("Hello World!");
        System.out.println("Hello Wrodl Code With Bhaskar!");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number of Class:");
      int clas = sc.nextInt();
      System.out.println("Enter the Number of Student:");
      int student = sc.nextInt();
      System.out.println("Enter the Number OF 3D Array:");
      int Array3D = sc.nextInt();
      int arr[][][]=new int[clas][student][Array3D];
      for(int i=0; i<arr.length; i++){
        //   System.out.println("Enter The Number of Class:");
        for(int j=0; j<arr[i].length; j++){
            for(int k=0; k<arr[j].length; k++){

                System.out.println("Enter the Marks Number Of Student:");
                // System.out.println(arr[i][j]+" ");
                arr[i][j][k]=sc.nextInt();
            }
        }
      }
      System.out.println("The Class & Student Marks is Below in the Number:");
      for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            for(int k=0; k<arr[j].length;k++){

                // System.out.println("Below the code:");
                System.out.print(arr[i][j][k]+" ");
            }
        }
        System.out.println();
      }
    }
}
