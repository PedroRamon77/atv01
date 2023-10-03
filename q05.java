class q05{
    public static void main(String[] args){ 
        int[] fib = {0, 1};

        System.out.print(fib[0] + ", " + fib[1]);

        for (int n3 = 0; n3 <= 100;) {
            n3 = fib[0] + fib[1];
            if (n3 > 100) {
                break;
            }
            System.out.print(", " + n3);
            
            fib[0] = fib[1];
            fib[1] = n3;
        }
    }
}
