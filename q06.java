class q06{
    public static void main(String[] args){
        
        int fat = 1, n= 5;

        for(int i=1;i<=n;i++){
            fat*= i;
        }
        System.out.println("Fatorial de "+n+" é : "+fat);
    }
} 