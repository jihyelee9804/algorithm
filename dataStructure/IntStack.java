package algorithm.dataStructure;

/**
 * ADT
 * 스택 - 배열
 * top : push와 pop이 이루어지는 부분
 * bottom : 스택의 가장 아랫부분
 *
 * @field
 * stack: stack용 배열
 * capacity: stack 용량
 * pointer: 다음에 삽입될 인덱스
 *
 * @method
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
    private int[] stack;
    private int capacity;
    private int pointer;

    // 실행 시 예외 클래스 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }
    // 실행 시 예외 클래스 : 스택이 가득 참
    public class OverflowIntStackException extends  RuntimeException {
        public OverflowIntStackException () {}
    }
    // 생성자
    public IntStack(int maxlen) {
        pointer = 0;
        capacity = maxlen;
        try {
            stack = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException {
        if (pointer >= capacity)
            throw new OverflowIntStackException();
        return stack[pointer++] = x;
    }

    public int pop() throws EmptyIntStackException {
        if (pointer <= 0)
            throw new EmptyIntStackException();
        return stack[--pointer];
    }

    public int peek() throws EmptyIntStackException {
        if (pointer <= 0)
            throw new EmptyIntStackException();
        return stack[pointer - 1];
    }

    public void clear() {
        pointer = 0;
    }

    public int indexOf(int x) {
        for (int i = pointer - 1; i >= 0; i--)
            if (stack[i] == x)
                return i;
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return pointer;
    }

    public boolean isEmpty() {
        return pointer <= 0;
    }

    public boolean isFull() {
        return pointer >= capacity;
    }

    public void dump() {
        if (pointer <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < pointer; i++)
                System.out.println(stack[i] + " ");
            System.out.println();
        }
    }
}
