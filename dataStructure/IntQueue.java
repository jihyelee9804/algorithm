package algorithm.dataStructure;

/**
 * ADT
 * 원형 큐
 * front: 논리적인 맨 앞 요소의 인덱스
 * rear: 논리적인 맨 뒤 요소 하나 뒤의 인덱스(다음 요소를 인큐할 위치의 인덱스)
 *
 * @field
 * que: 큐용 배열
 * capacity: 큐의 용량
 * front: 맨 앞의 요소 커서
 * rear: 맨 뒤의 요소 커서
 * num: 현재 큐에 있는 데이터 개수
 *
 * @method
 * enqueue(): 큐에 데이터를 넣는다.
 * dequeue(): 큐에서 데이터를 꺼낸다.
 */
public class IntQueue {
    private int[] queue;
    private int capacity;
    private int front;
    private int rear;
    private int num;

    // 실행 시 예외 클래스: 큐가 비어있음
    public class EmptyIntQueueException extends  RuntimeException {
        public EmptyIntQueueException() {}
    }

    // 실행 시 예외: 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            queue = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enqueue(int x) throws OverflowIntQueueException {
        if (num >= capacity) {
            throw new OverflowIntQueueException();
        }
        queue[rear++] = x;
        num++;

        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public int dequeue() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = queue[front++];
        num--;

        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    public int peek() throws EmptyIntQueueException {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return queue[front];
    }

    public void clear() {
        num = front = rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (queue[idx] == x)
                return idx;
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        }
        else {
            for (int i = 0; i < num; i++) {
                System.out.println(queue[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }
}
