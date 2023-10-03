class q07{
    public static void main(String[] args){
        int x = 13;

        for(int i=x;i>1;i--){
            if(x==1){
                break;
            }
            else if(x%2==0){
                x=(x/2);
            }else{
                x= 3*x+1;
            }
            System.out.println("X: "+x);
            
        }
    }
}