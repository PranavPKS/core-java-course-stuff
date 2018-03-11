import java.util.Scanner;
class Binary_Search {
 
    public static int recursiveBinary_Search(int[] sortedArray, int start, int end, int key) {
         
        if (start < end) {
            int mid = start + (end - start) / 2; 
            if (key < sortedArray[mid]) {
                return recursiveBinary_Search(sortedArray, start, mid, key);
                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinary_Search(sortedArray, mid+1, end , key);
                 
            } else {
                return mid;  
            }
        }
        return -(start + 1); 
    }
 
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("Enter the number to search");
		int num=input.nextInt();
        int[] arr1 = {10,45,900};
        int index = recursiveBinary_Search(arr1,0,arr1.length,num);
		if (index<0){
			System.out.println("Number "+num+" not found");
		}else{
			System.out.println("Found "+num+" at index "+index);
		}
        
    }
}