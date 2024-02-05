public class FirstJavaClass {
     public static void main(String[] args){
        // For, while, do-while

        System.out.println("For Loop");
        for(int i = 0; i<10; i++){
                System.out.println("Akash");
        }

        System.out.println("While Loop");
        int a = 2;
        while(a <= 10){
                System.out.println(a);
                a++;
        }

        int b = 3;
        System.out.println("Do While Loop");
        do {
                System.out.println(b);    //Atleast once this will be executed
                b++;
        } while(b > 10);

        System.out.println("While loop with continue");
        int c = 4;
        while(c <= 10){
                c++;
                if (c == 8) continue;
                System.out.println(a);
        }
   }
}
