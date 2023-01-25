import java.util.Arrays;
public class GreedyEx {
    public static void main(String[] args) {
        Solution greedyEx = new Solution();
        int[] stuff = {30,50,80,20,70};
        int limit=100;
        System.out.println(greedyEx.movingStuff(stuff,limit));
    }
}

/*
그레디 짐나르기

문제:
김코딩과 박해커는 사무실 이사를 위해 짐을 미리 싸 둔 뒤,
짐을 넣을 박스를 사왔다. 박스를 사오고 보니 각 이사짐의 무게는 들쭉날쭉한 반면,
박스는 너무 작아서 한번에 최대 2개의 짐 밖에 넣을 수 없었고 무게 제한도 있었다.
예를 들어, 짐의 무게가 [70kg, 50kg, 80kg, 50kg]이고 박스의 무게 제한이 100kg이라면
2번째 짐과 4번째 짐은 같이 넣을 수 있지만 1번째 짐과 3번째 짐의 무게의 합은
150kg이므로 박스의 무게 제한을 초과하여 같이 넣을 수 없다.
박스를 최대한 적게 사용하여 모든 짐을 옮기려고 합니다.
짐의 무게를 담은 배열 stuff와 박스의 무게 제한 limit가 매개변수로 주어질 때,
모든 짐을 옮기기 위해 필요한 박스 개수의 최소값을 return 하도록 movingStuff 함수를 작성하세요.

중요하게 보아야 할것!
1. 박스에는 최대 2개의 짐 밖에 넣을 수 없다.
2. 박스에 넣을 수있는 무게에는 제한이 있다. limit을 초과하면 안된다.
3. 박스를 최대한 적게 사용하여 모든 짐을 옮기고 싶다.
4. 필요한 박스 개수의 최소값을 리턴한다.

수도코드
1. 짐의 무게 오름차순을 정렬한다.
2. 가벼운짐과 무거운짐을 저장할 변수를 담는다.
3. 필요한 박스의 수를 카운트할 int타입의 변수를 만든다.
4. while(가벼운짐<=무거운짐) // 메소드 종료조건은 가벼운짐이 무거운 짐보다 값이 클때 종료된다.
    limit안에 가벼운짐+무거운짐의 합이 포함될 때, 무거운 짐만 들어갈 수 있을 때를 if문으로 분기한다.
   if(가벼운짐+무거운짐<=limit){
        가벼운짐의 주소값에 현재 저장되어있는 가벼운짐 다음으로 가벼운짐의 값을 할당하고
        무거운짐의 주소값에 현재 저장되어있는 무거운짐 다음으로 무거운짐의 값을 할당하고
        박스하나 카운팅해준다.
    else{
    무거운짐의 주소값에서 다음으로 무거운짐의 값을 할당
    박스 count++
    }
   }
*/
class Solution{
    public int movingStuff(int[] stuff, int limit) {
        Arrays.sort(stuff);
        int count =0;
        int left=0;
        int right=stuff.length-1;

        while (left <= right){
            if(stuff[left]+stuff[right] <= limit){
                left++;
                right--;
                count++;
            }else{
                right--;
                count++;
            }
        }
        return count;
    }
}
