import java.util.Arrays;
import java.util.Random;

public class Boxes {
    public static void main(String[] args) {
        Ex01 ex = new Ex01();

//        int[] boxes = new int[]{5, 1, 4, 6};
//        int output = ex.paveBox(boxes);
//        System.out.println(output); // 3
//
//        int[] boxes2 = new int[]{3, 4, 9, 8, 8, 4, 3, 1, 10, 1, 7, 3, 10, 9, 7, 8, 7, 8, 5, 6};
//        System.out.println(Arrays.toString(boxes2));
//        int output2 = ex.paveBox(boxes2);
//        System.out.println(output2); // 1

        int[] arr = new int[20];
        Random r = new Random();
        for(int i = 0; i<arr.length; i++) {
            arr[i] = r.nextInt(10)+1;
        }

        System.out.println(Arrays.toString(arr));
        int output3 = ex.paveBox(arr);
        System.out.println(output3); // 1

    }
}


class Ex01 {
    public int paveBox(int[] boxes) {
        // TODO:

        // 입력 : 배열 -> 포장해야 하는 박스가 담겨 있다
        // 들어온 순서대로 한 명씩 나가야 합니다.
        // 뒷사람이 포장을 전부 끝냈어도 앞사람이 끝내지 못하면 기다려야 합니다.
        // 최대 몇 명이 한꺼번에 나가는지 알 수 있도록 함수를 구현해 주세요

        // 1. 앞사람이 뒷사람보다 박스의 수가 많다면 연속으로 나갈 수 있음
        // 2. 연속으로 나갈 수 있는 최대 인원을 구하기 위해서는 카운트를 해야 함
        // 3. 카운트 시작할 때의 사람보다 박스 수가 많으면 카운트 리셋 후 다시 카운트
        // 4. 카운트의 최대값을 구함

        // 예외처리 : 박스가 하나도 없을 때
        if(boxes.length == 0)   return 0;

        // 가장 많은 박스를 지정
        int numberOfBoxes = 0;  // 현재 박스 작업을 하는 작업자의 박스 개수
        int count = 0;          // 연속으로 빠져나갈 수 있는 인원 수
        int max = 0;            // count의 최대값

        // 입력 배열 순회
        for (Integer box : boxes) {
            if (box > numberOfBoxes) {
                if (count > max ) max = count; // 현재까지의 연속 인원이 최대 연속카운트보다 크면 바꿔주고
                numberOfBoxes = box;    // 바뀐 조건을 적용 ( 대기열이 생기게 하는 작업자의 박스 수 )
                count = 1;              // 현재 작업자는 나가야하니 1로 초기화
            } else {
                count++;        // 뒷사람이 작업해야하는 박스 수와 같거나 더 적으면 카운팅(같이 나갈 수 있다!)
            }
        }
        // 마지막까지 탈출 했을 때 카운트도 비교해줘야함
        if (count > max ) max = count;

        return max;
    }
}