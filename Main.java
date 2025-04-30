
class Main {
    public static void main(String[] args) {
        //printArray();
       // evenArray();
       // sumOfArray();
        arrEle();
    }

    public static  void printArray(){
        int arr[] = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void evenArray(){
        int arr[] = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.println("odd numebr"+arr[i]);
            }else {
                System.out.println("even number is" +arr[i]);
            }
        }
    }

    //question 3 : WAP to calculte the sum of the total element in aray
    public static void sumOfArray(){
        int arr[]={9,0,2,8,9,8,8,4,3};
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];

        }
        System.out.println("The sum of array is" +sum);
    }


    //trying array traversing using for each loop
    public static void arrEle(){
          int  []arr={1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);

        }
        System.out.println();
        //  for each loop
        for (int i :arr) {
            System.out.println(i);
            
        }
    }

    }



