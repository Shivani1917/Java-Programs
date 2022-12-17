   //Section C Q4
public class MaximumElement_array{

    public static void main(String[] args) {
        
        int arr[] = {3,6,7,4,12,1,17,19,23,2};
        System.out.println(" University Roll no:20105023");
        int max = arr[0];
        for (int i= 0;i<arr.length;i++){         
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array:" + max);
    }
}
