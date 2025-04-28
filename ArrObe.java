public class ArrObe {
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        arr[6]=60; // here it will compile,but it will throw ArrayOutOfBoundExeption

    }
}
