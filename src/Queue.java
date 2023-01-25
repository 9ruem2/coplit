import java.util.ArrayList;

public class Queue {
    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println(queue.show());

        queue.pull();
        queue.pull();

        System.out.println(queue.show());
    }
}
class ArrayQueue{
    private ArrayList<Integer> listQueue = new ArrayList<>();

    public void add(Integer data){
        listQueue.add(data);
    }

    public Integer pull() {
        if(listQueue.isEmpty()) {
            return null;
        }else {
            return listQueue.remove(0);
        }
    }

    public int size() {
        return listQueue.size();
    }

    public Integer peek() {
        if(listQueue.isEmpty()) {
            return null;
        }else {
            return listQueue.get(0);
        }
    }

    public String show() {
        return listQueue.toString();
    }

    public void clear() {
        listQueue.clear();
    }
}