class Insertion_sort_primitive {
    
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            int key=arr[i+1];
            int j=i;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}