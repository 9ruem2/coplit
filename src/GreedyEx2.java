import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class GreedyEx2 {
    public static void main(String[] args) {
        int output = Solution2.partTimeJob(5500);
        System.out.println(output);
    }
}

/*
문제
편의점에서 아르바이트를 하고 있는 중에, 하필이면 피크 시간대에 손님에게 거스름돈으로 줄 동전이 부족하다는 것을 알게 되었습니다.
현재 가지고 있는 동전은 1원, 5원, 10원, 50원, 100원, 500원으로 오름차순으로 정렬되어 있고, 각 동전들은 서로 배수 관계에 있습니다.
동전 개수를 최소화하여 거스름돈 K를 만들어야 합니다. 이때, 필요한 동전 개수의 최솟값을 구하는 함수를 작성해 주세요.


 */
class Solution2 {
    public static int partTimeJob(int k) {
        // 동전의 갯수를 카운트할 변수 만들기
        // 1~500원까지 내림차순으로 배열에 동전넣기
        // for(배열순회)
        // while(k>=배열[i])
        // k = k-배열[i]
        // 동전1 카운트
        int result = 0;
        int[] wallet = {1, 10, 5, 500, 50, 100};
        Integer b[] = Arrays.stream(wallet).boxed().toArray(Integer[]::new);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < b.length; i++) {
            int coin = wallet[i];
            //System.out.println(wallet[i]);
            while (k >= coin) { //거스름돈을 큰 단위의 동전과 더이상 바꿀 수 없을 때까지-> k >= coin 종료
                k = k - coin;
                //System.out.println(k);
                result++;
            }
        }
        return result;
    }
}


