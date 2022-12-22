
public class inse {  
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  
    
        public static void selectionSort(int[] arr){  
            for (int i = 0; i < arr.length - 1; i++)  
            {  
                int index = i;  
                for (int j = i + 1; j < arr.length; j++){  
                    if (arr[j] < arr[index]){  
                        index = j;//searching for lowest index  
                    }  
                }  
                int smallerNumber = arr[index];   
                arr[index] = arr[i];  
                arr[i] = smallerNumber;  
            }  
        }
    
    static void print(int arr1[]){
        for(int i:arr1){    
            System.out.print(i+" ");    
        }   

    }
       
    public static void main(String a[]){    
        int[] arr1 = {9,14,3,2,43,11,58,22};
        int[] arr2 = {9,1413,22323,23,23,2,32,32,31,24465,77,87,23,4477,1234,13,5231,2232};     
        insertionSort(arr2);
        selectionSort(arr1);  
        print(arr1);
        System.out.println("\n");
        print(arr2);
       
    }    
}      
