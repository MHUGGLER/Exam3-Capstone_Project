import java.time.LocalDateTime;
import java.util.ArrayList;

public class TaskManagerTest {

    // --- Task class ---
    static class Task {
        String title;
        LocalDateTime dueDate;
        int priority;
        String reminderType;

        public Task(String title, LocalDateTime dueDate, int priority, String reminderType) {
            this.title = title;
            this.dueDate = dueDate;
            this.priority = priority;
            this.reminderType = reminderType;
        }

        public int getPriority() { return priority; }

        public String toString() {
            return "[" + title + ", priority=" + priority + ", due=" + dueDate + ", alert=" + reminderType + "]";
        }
    }

    // --- Priority Queue (Heap) ---
    static class PriorityQueueHeap {
        ArrayList<Task> heap = new ArrayList<>();

        public boolean isEmpty() { return heap.isEmpty(); }

        public void add(Task t) {
            heap.add(t);
            bubbleUp(heap.size() - 1);
        }

        public Task removeMax() {
            if (isEmpty()) return null;
            Task max = heap.get(0);
            Task last = heap.remove(heap.size() - 1);
            if (!heap.isEmpty()) {
                heap.set(0, last);
                bubbleDown(0);
            }
            return max;
        }

        private void bubbleUp(int index) {
            while (index > 0) {
                int parent = (index - 1) / 2;
                if (heap.get(index).getPriority() <= heap.get(parent).getPriority()) break;
                swap(index, parent);
                index = parent;
            }
        }

        private void bubbleDown(int index) {
            int size = heap.size();
            while (true) {
                int left = 2 * index + 1;
                int right = 2 * index + 2;
                int largest = index;

                if (left < size && heap.get(left).getPriority() > heap.get(largest).getPriority()) largest = left;
                if (right < size && heap.get(right).getPriority() > heap.get(largest).getPriority()) largest = right;
                if (largest == index) break;

                swap(index, largest);
                index = largest;
            }
        }

        private void swap(int i, int j) {
            Task temp = heap.get(i);
            heap.set(i, heap.get(j));
            heap.set(j, temp);
        }
    }

    // --- Main ---
    public static void main(String[] args) {
        PriorityQueueHeap pq = new PriorityQueueHeap();

        pq.add(new Task("Finish Homework", LocalDateTime.of(2025,12,10,18,0), 5, "Email"));
        pq.add(new Task("Buy Groceries", LocalDateTime.of(2025,12,5,12,0), 2, "App"));
        pq.add(new Task("Prepare Presentation", LocalDateTime.of(2025,12,8,9,0), 8, "SMS"));
        pq.add(new Task("Doctor Appointment", LocalDateTime.of(2025,12,6,14,0), 7, "App"));

        System.out.println("Tasks by Priority:");
        while (!pq.isEmpty()) {
            System.out.println(pq.removeMax());
        }
    }
}