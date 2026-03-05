import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in)  ;
     System.out.print("enter no of elements: ");
     int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     //bubble sort logic 
     for(int i=0;i<n-1;i++){  //passing the elements
        for(int j=0;j<n-i-1;j++){ //swapping the elements
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
     }
     System.out.print("sorrted array is:");
     for(int i=0;i<n;i++){
        System.out.println(arr[i]+"  "); // To display the sorted elements
     }
    }
    
}
