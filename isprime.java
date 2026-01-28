public class isprime {
    public static void main(String[] args) {
        int number=11;
        boolean isprime=true;
        if(number==1){
            System.out.println("sayi asal değil.");
        }
        else{
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isprime=false;
                }
            }
            if(isprime){
                System.out.println("sayi asal");
            }
            else{
                System.out.println("sayi asal değil.");
            }
            
        }
        
    }
}
