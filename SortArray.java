class sort {
    void show(int arr[]) {
        int t;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
}

class SortArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter the elements of array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        sort s = new sort();
        s.show(arr);
        System.out.println("after sorting");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i] + " ");
            
        }

    }
}
