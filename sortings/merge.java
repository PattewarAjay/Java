public class merge{
    public static void mergesort(int[] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);

            mergee(arr, l, mid, r);
        }
    }

    public static void mergee(int[] arr,int l,int mid,int r){
        int n1 = mid - l+1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }

        for(int i=0;i<n2;i++){
            right[i] = arr[mid+1+i];
        }

        int i =0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = left[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args){
        int[] arr = {3,1,8,2,9,5};
        int size = arr.length;
        mergesort(arr, 0, size-1);
        for(int nums : arr){
            System.out.print(nums+" ");
        }

    }
}