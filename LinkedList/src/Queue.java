 class Queue {


     int[] arr;
     int front;
     int rear;
     int cap;
     int count;
     int priority;



     Queue(int size) {
          arr = new int[size];
          cap = size;
          front = 0;
          rear = -1;
          count = 1;
          priority = 10;
     }
      public Boolean isEmpty() {
           return (size() == 0);
      }

      public Boolean isFull() {

         return (size() == cap);
      }

     public void dequeue() {
          if(isEmpty()) {
               System.out.println("Terminated");
               System.exit(1);
          }
          System.out.println("Removed " + arr[front]);
          front = (front + 1) % cap;
          count --;

     }

     public void enqueue(int thing) {
          if (isFull()) {
          System.out.println("Terminated");
          System.exit(1);
          }
          System.out.println("Adding " + thing);
          rear = (rear + 1) % cap;
          arr[rear] = thing;
          count++;

     }
     public int peek() {
          if(isEmpty()) {
               System.out.println("Terminated");
               System.exit(1);
          }
          return arr[front];
     }
     public int size() {

         return count;
     }


public void Prior() {
for (int i = 0; i > arr[size()];) {
    
    }
}

      public static void main (String[] args) {
          Queue spunchbop = new Queue(6);

          spunchbop.enqueue(2);
          spunchbop.enqueue(4);
          spunchbop.enqueue(6);
          spunchbop.enqueue(8);
          spunchbop.enqueue(10);

          System.out.println("Front: " + spunchbop.peek());
          spunchbop.dequeue();
          spunchbop.dequeue();

          System.out.println("New Front: " + spunchbop.peek());
          System.out.println("Size: " + spunchbop.size());
      }

 }
