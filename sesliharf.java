public class sesliharf {
    public static void main(String[] args) {
        String harf="O";
        String kalinharf[]={"A","O","U","I"};
        String inceharf[]={"E","İ","Ü","Ö"};
        for(int i=0;i<kalinharf.length;i++){
            if(kalinharf[i]==harf){
                System.out.println("harf kalın seslidir.");
            }
        }
        for(int i=0;i<inceharf.length;i++){
            if(inceharf[i]==harf){
                System.out.println("harf ince seslidir.");
            }
        }

    }
}
