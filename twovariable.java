import java.util.*;
public class twovariable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the target:");
int target = sc.nextInt();
int arr[] = {1,2,3,4,5,6,7,8,9,10};
for(int i = 0 ; arr.length>0; i++){
    for(int j = i+1 ; arr.length>j ; j++){
        if( arr[i] + arr[j] == target ){
            System.out.println(i + " " +j);
        }
    }
}
}
}
