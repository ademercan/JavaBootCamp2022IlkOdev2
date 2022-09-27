public class Main {
    public static void main(String[] args) {
        sayiBulucu();
    }
    public static void  sayiBulucu(){
        int [] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak =1;
        for (int i=0;i<=sayilar.length;i++){
            if (aranacak==sayilar[i]) {
                mesajVer("Aranacak Sayıyı Buldunuz."+sayilar[i]);
                return;
            }else{
                mesajVer("Aranan sayı dizi kümesinde yok!");
                return;
            }
        }

    }
    public static void  mesajVer (String mesaj){
        System.out.println(mesaj);
    }
}