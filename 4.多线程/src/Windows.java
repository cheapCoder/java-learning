 class Windows  extends Thread{
    static private int lastTickets = 100;
     @Override
     public void run() {
         while (Windows.lastTickets > 0) {
             System.out.println(this.getName() + ": " + lastTickets--);
//             lastTickets--;
         }
     }
//     public void start(){
//
//     }
 }

 class Test {
     public static void main(String[] args) {
//         Windows w1 = new Windows();
//         Windows w2 = new Windows();
//         Windows w3 = new Windows();
            new Windows().start();
            new Windows().start();
            new Windows().start();
     }
 }

