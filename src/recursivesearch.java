public class recursivesearch {
//    public static void main(String[] args) {
//        int [] arr = {52,45,66,87,12,101,-8};
//        int max = arr[0];
//        for (int i=0;i<arr.length;i++){
//            max = MaxNum(arr[i],max);
//        }
//        System.out.println(max);
//    }
//
//    static int MaxNum(int elem, int max){
//        if(elem>max){
//            max = elem;
//        }
//        return max;
//    }

    public static void main(String[] args) {
        int [] arr = {1,2,45,-88,66,147,052,147};
        int ans = findmax(arr, arr.length-1);
        System.out.println(ans);
    }

    static int findmax(int [] arr, int index){
        int max = arr[0];
        if(index>0){
            return (arr[index]>=findmax(arr,index-1)?arr[index]:findmax(arr,index-1));
        }
        else{
            return arr[0];
        }
    }
}
