package ElazigOtoparkRandevu;
import java.util.Scanner;

public class Main {
    static Scanner tara = new Scanner(System.in);

    public static void main(String[] args) {
        RanedvuGirisEkrani();
        MevcutİlSwitchKodlari();
    }
    public static void MevcutİlSwitchKodlari() {
        iller.Mevcutİller();
    }
    private static void RanedvuGirisEkrani() {
        System.out.println();
        System.out.println("Elazığ Otopark Randevu Sistemine Hoş Geldiniz");
    }
}
class iller extends Main {
    public static void Mevcutİller() {
        System.out.println();
        System.out.println("Randevuya Başlamak İçin Lütfen Elazığ'ın Plaka Kodunu Giriniz. :)");
        int ilKodu = tara.nextInt();
        switch (ilKodu) {
            case 23: ilceler.ElazigIlceler();break;
            default: System.out.println("Lütfen doğru plaka kodunu giriniz."); Mevcutİller(); break;

        }
    }
}
class ilceler extends iller {

    public static void ElazigIlceler() {
        System.out.println("Elazığ'a Hoş Geldiniz.");
        Switch();
    }

    public static void Switch(){
        System.out.println();
        System.out.println("Mevcut Bir İlçenin Numarasını Giriniz.");
        System.out.println(
                "Merkez -------(1)\n" +
                        "Ağın ---------(2)\n" +
                        "Alacakaya ----(3)");
        int elazigIlceNo = tara.nextInt();
        switch (elazigIlceNo) {
            case 1: ElazigMerkez();break;
            case 2:ElazigAgin();break;
            case 3: ElazigAgin();break;
            default: System.out.println("Lütfen mevcut numaralar dışında numara girmeyiniz."); Switch();break;
        }
    }

    private static void ElazigAgin() {
        System.out.println("Mevcut Mahallenin Numarasını Giriniz.\n");
        System.out.println(
                "Akpınar Mahallesi --------(1)\n" +
                        "Başpınar Mahallesi -------(2)\n" +
                        "Şenpınar Mahallesi -------(3)\n" +
                        "Merkez Mahellesi ---------(4)");
        int ElazigMerkezMahalleNo = tara.nextInt();
        switch (ElazigMerkezMahalleNo) {
            case 1: ElazigMahOtoparklar();break;
            case 2: ElazigMahOtoparklar();break;
            case 3: ElazigMahOtoparklar();break;
            case 4: ElazigMahOtoparklar();break;
            default: System.out.println("Lütfen mevcut numaralar dışında numara girmeyiniz.");ElazigAgin();break;
        }
    }

    private static void ElazigMerkez() {
        System.out.println("Mevcut Mahallenin Numarasını Giriniz.\n");
        System.out.println(
                "Abdullah Paşa Mahallesi -----(1)\n" +
                        "Fevzi Çakmak Mahallesi ------(2)\n" +
                        "Bağlar Mahallesi ------------(3)\n" +
                        "Ataşehir Mahellesi ----------(4)\n" +
                        "Aksaray Mahallesi -----------(5)");
        int ElazigMerkezMahalleNo = tara.nextInt();
        switch (ElazigMerkezMahalleNo) {
            case 1: ElazigMahOtoparklar();break;
            case 2: ElazigMahOtoparklar();break;
            case 3: ElazigMahOtoparklar();break;
            case 4: ElazigMahOtoparklar();break;
            case 5: ElazigMahOtoparklar();break;
            default: System.out.println("Lütfen mevcut numaralar dışında numara girmeyiniz.");ElazigMerkez();break;
        }
    }

    private static void ElazigMahOtoparklar() {
        System.out.println("İstediğiniz Otoparkın Numarasını Giriniz");
        System.out.println(
                "Harput Otopark -----(1)\n" +
                        "Yılmaz Otopark -----(2)\n" +
                        "Deniz Otopark ------(3)\n" +
                        "Elazığ Otopark -----(4)\n" +
                        "Can Otopark --------(5)\n");
        int ElazigMerkezOtoparklar = tara.nextInt();
        switch (ElazigMerkezOtoparklar) {
            case 1: ElazigMerkezOtoparklarAlanlari();break;
            case 2: ElazigMerkezOtoparklarAlanlari();break;
            case 3: ElazigMerkezOtoparklarAlanlari();break;
            case 4: ElazigMerkezOtoparklarAlanlari();break;
            case 5: ElazigMerkezOtoparklarAlanlari();break;
            default:System.out.println("Lütfen mevcut numaralar dışında numara girmeyiniz");ElazigMahOtoparklar();break;
        }
    }

    private static void ElazigMerkezOtoparklarAlanlari() {
        System.out.println("Bir Park Alanı Numarası Giriniz / Örnek(11)");
        System.out.println("" +
                "A11          " + "A22           " + "         A33\n" +
                "B44          " + "B55           " + "         B66\n" +
                "C77          " + "C88           " + "         C99\n");
        int ElazigMerkezOtoparkAlan = tara.nextInt();
        switch (ElazigMerkezOtoparkAlan) {
            case 11: ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 22: ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 33: ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 44:ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 55:ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 66:ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 77:ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 88: ElazigMerkezOtoparkAraclarinBilgileri();break;
            case 99: ElazigMerkezOtoparkAraclarinBilgileri();break;
            default: System.out.println("Lütfen örnekteki gibi numara giriniz");ElazigMerkezOtoparklarAlanlari();break;
        }
    }

    private static void ElazigMerkezOtoparkAraclarinBilgileri() {
        System.out.println();
        tara.nextLine();
        System.out.println("Lütfen aracınızın plakasını giriniz.");
        String aracinizinPlakasi = tara.nextLine();
        System.out.println("Lütfen aracınızın rengini giriniz.");
        String aracinizinRengi = tara.nextLine();
        System.out.println("Lütfen randevu tarihini giriniz.");
        String aracinizinRandevuTarihi = tara.nextLine();
        System.out.println("Lütfen randevu saatini giriniz.");
        String aracinizinRandevuSaati = tara.nextLine();
        AracBilgileri a1 = new AracBilgileri(aracinizinPlakasi, aracinizinRengi, aracinizinRandevuTarihi, aracinizinRandevuSaati);
        System.out.println(a1.AracBilileriniGoster());
    }
}
