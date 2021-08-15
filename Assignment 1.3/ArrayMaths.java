
class ArrayMaths {

    static int arr[] = {5,2,23,4,2,7};
    static int sum=0,min=arr[0],max=arr[0], average,count;
    
    public static void main(String[] args) {
        

        
        System.out.println("Numbers in an array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //Min of array
        for (int i = 0; i < arr.length; i++) {
        if (arr[i]<min) {
            min=arr[i];
        } 
        else{
            continue;
        }
        }
        System.out.println("Min value: "+ min);
        
        //Max of array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            } 
            else{
                continue;
            }
            
        }
        System.out.println("Max value: " + max);

        
        
       
            
        //Sum of array
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("Sum of array: " + sum);

        
   
        //Average of array
        
        count=arr.length;
        average=sum/count;
        System.out.println("Average of array: " + average);
    }

        
}