package percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 25000;
        double uangDiDompet = 50000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang Kurang, Kurangi jajan Anda");}
        else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, angsul : "+angsul);}
        else{
            System.out.println("uang pas.. Hiks..");
        }

    }
}
