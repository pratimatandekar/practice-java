public class ArrayEle {

    public static void main(String[] args) {
       chngeEle();

    }

    public static void chngeEle() {
        int arr[] = {1, 2, 3};
        arr[1]=5;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the array ele  index is "  + i+":" +arr[i]);
        }




    }
}
