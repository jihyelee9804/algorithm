package algorithm.dataStructure;

/**
 * top : push와 pop이 이루어지는 부분
 * bottom : 스택의 가장 아랫부분
 *
 * push() : 데이터를 삽입한다.
 * pop() : 데이터를 제거하고 반환한다.
 * peek() : top에 있는 데이터를 반환한다.
 * clear() : 모든 요소를 삭제한다.
 * indexOf() : 데이터를 검색한다.
 * getCapacity() : 용량을 확인한다.
 * size() : stack에 쌓인 데이터 개수를 확인한다.
 * isEmpty() : 스택이 비어있는지 확인한다.
 * isFull() : 스택이 가득찼는지 확인한다.
 * dump() : 스택에 쌓인 모든 데이터를 출력한다.
 */
public class IntStack {
    private int[] stk; // 스택용 배열
    private int capacity; // 용량
    private int ptr; // 스택 포인터

    // 예외 클래스
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }
    // 예외 클래스
    public class OverflowIntStackException extends  RuntimeException {
        public OverflowIntStackException () {}
    }
    // 생성자
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public void clear() {
        ptr = 0;
    }

    public int indexOf(int x) {
        for (int i = ptr - 1 ; i >= 0; i--)
            if (stk[i] == x)
                return i;
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr <= 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.println(stk[i] + " ");
            System.out.println();
        }
    }
}
