public class TaskPriorityQueue {
    private Task[] heap;        // Array de Tasks
    private int size;           // Quantidade de tasks na heap
    private int capacity;

    public TaskPriorityQueue(int capacity) {
        this.capacity = capacity;
        heap = new Task[capacity];
        size = 0;
    }

    public void add(Task task) {
        // Inserir no final e "bubble up" para manter a propriedade de heap
    }

    public Task remove() {
        // Remover o topo da heap (maior prioridade) e "bubble down"
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}