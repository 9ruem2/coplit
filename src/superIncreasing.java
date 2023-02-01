/*
* 수를 요소로 갖는 배열을 입력받아
* 각 요소들이 그 이전의 요소들의 합보다 큰지 여부를 리턴해야 합니다.
* 출력: boolean 타입을 리턴해야 합니다.
arr[i]는 arr[0]부터 arr[i-1]까지의 합보다 커야 합니다.
* */
public class superIncreasing {
    public static void main(String[] args) {
        boolean sol = SuperIncrea.superIncreasing(new int[]{1, 3, 6, 13, 54});
        System.out.println(sol); // --> true
    }
}

class SuperIncrea {
    public static boolean superIncreasing(int[] arr) {
        // TODO:
        if(arr.length == 0) return false;
        int sum=arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<=sum){
                return false;
            }
            sum += arr[i];
        }
        return true;
    }
}
