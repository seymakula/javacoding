public class methods {
    public static void isPerfect() {
        //camel casing methodlarda yazım kuralı gibi ikinci kelimenin ilk harfinin büyük.
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
    public static void main(String[] args) {
        isPerfect();
    }
    
}