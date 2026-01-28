public class method2 {
    // methodlarda static olması o methodu bir nesne oluşturmadan çalıştırmak için gereklidir.
    // method denilen kavram c ve pythondaki fonskiyon kavramı ile benzerlik göstermekte.
    // void yazıyorsa döndürdüğü bir şey yok diyebiliriz.
    public static void ekle(){
        System.out.println("eklendi.");
    }
    public static void sil(){
        System.out.println("silindi.");
    }
    public static void guncellel(){
        System.out.println("güncellendi.");
    }
    public static int topla(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {
        int total=topla(3, 4);
        System.out.println(total);
        int total3=topla2(2,3,4);
        System.out.println(total3);
    }
    //variable arguments ile çalışma
    public static int topla2(int...sayilar){
        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }
}
      