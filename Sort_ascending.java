   //Section C Q1
public class Sort_ascending {

    public static void main(String[] args) {
        int arr[] = {8,5,2,4,9,6,10,3,7,1};
        
        System.out.println(" University Roll no:20105023");
        int temp = 0;
        // Displaying Original Array
        System.out.print("Array before Sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        //Sort Array
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println();
            System.out.print("Array after Sorting :");

        //After Sorting
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }    
    }   
}
