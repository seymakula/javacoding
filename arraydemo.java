public class arraydemo {
    public static void main(String[] args) {
        double[] mylist={1.2,1.3,4.3,5.6};
        double total=0;
        double maxim=mylist[0];
        for(double number:mylist){
            if(maxim<number){
                maxim=number;
            }
            total+=number;
            System.out.println(number);
        }
        System.out.println(total);
        System.out.println(maxim);
    }
    
}
