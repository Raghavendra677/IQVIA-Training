public class sumofarray{
    public static void main(String[] args) {
        int[] prices={100, 200, 150, 50};
        int sum=0;

        for(int i=0; i<prices.length;i++) {
            sum=sum+ prices[i];
        }
        System.out.println("Total: " + sum);
    }
}


