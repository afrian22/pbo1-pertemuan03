package percabangan;

public class Switch2 {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya!!!\"");
                break;
            case 'B' :
                System.out.println("Mhs   : \"ulun harus dapat A pak!\"");
                System.out.println("Dosen : \"Kasar bet dah\"");
            case 'C' :
                System.out.println("Mhs   : \"Ulun turun trs pa ai, tugas gin pul\"");
                System.out.println("Dosen : \"kada betakun\"");
                System.out.println("Mhs   : \"zzzzz\"");
                break;
            default:
                System.out.println("Mhs   : \"ulun turun pul pa ai, tugas pul jua\"");
                System.out.println("Dosen : \"bujur jua kah anak amat ngini\"");
                System.out.println("Dosen : \"memeriksa berkas\"");
                System.out.println("Dosen : \"nah karamput\"");
                System.out.println(("Mhs  : \"Kaboorr..\""));
                break;

        }
    }
}
