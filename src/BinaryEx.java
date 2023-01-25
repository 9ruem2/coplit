public class BinaryEx {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//                        {1,2,3,4},
//                        {5,6,7,8},
//                        {9,10,11,12},
//                        {13,14,15}
//                       };
        int sum=0;
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
//                System.out.println("i="+ arr[i][0]);
//                System.out.println("j="+ arr[0][j]);
//                System.out.println("[i][j]="+ arr[i][j]);
                System.out.println("i" + arr[i]);
                System.out.println("j" + arr[j]);
                sum++;
            }
        }
        System.out.println(sum);
    }
}
