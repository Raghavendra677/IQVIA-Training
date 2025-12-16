package Day2;

public class breakcontinue {
        public static void main(String[] args) {
            for (int i=1;i<=10;i++){

                if (i%2== 0){
                    continue;
                }
                if (i== 9){
                    System.out.println("Reached 9 stopped");
                    break;
                }
                System.out.println("odd number: " + i);
            }
        }
    }


