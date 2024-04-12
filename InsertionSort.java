import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
     }

     sortig(n,a);
     for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
     }
    }
    static void sortig(int n,int a[]){

        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0&&a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
    }
}
