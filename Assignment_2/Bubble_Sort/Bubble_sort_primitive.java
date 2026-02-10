class Bubble_sort_primitive {
    
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped=false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}