public class perfectnumber {
    public static void main(String[] args) {
        int num=21;
        int total=0;
       for(int i=1;i<num;i++){
        if(num%i==0){
            total+=i;
        }
       }
       if(total==num){
        System.out.println("number is perfect number.");
       }
       else{
        System.out.println("number is not perfect number.");
       }

    }
    
}
