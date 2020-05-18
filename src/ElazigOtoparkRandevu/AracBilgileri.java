package ElazigOtoparkRandevu;

public class AracBilgileri extends Main{
    private   String aracPlakasi;
    private  String aracRengi;
    private  String randevuTarihi;
    private  String randevuSaati;

    public AracBilgileri(String aracPlakasi, String aracRengi, String tarih,String randevuSaati) {
        this.aracPlakasi = aracPlakasi;
        this.aracRengi = aracRengi;
        randevuTarihi = tarih;
        this.randevuSaati=randevuSaati;
    }

    public String getRandevuSaati() {
        return randevuSaati;
    }

    public void setRandevuSaati(String randevuSaati) {
        this.randevuSaati = randevuSaati;
    }

    public String getAracPlakasi() {
        return aracPlakasi;
    }

    public void setAracPlakasi(String aracPlakasi) {
        this.aracPlakasi = aracPlakasi;
    }

    public String getAracRengi() {
        return aracRengi;
    }

    public void setAracRengi(String aracRengi) {
        this.aracRengi = aracRengi;
    }

    public String getTarih() {
        return randevuTarihi;
    }

    public void setTarih(String tarih) {
        randevuTarihi = tarih;
    }

    public String AracBilileriniGoster(){
        return " Aracınızın Plakası: "+aracPlakasi+"\n Aracınızın Rengi: "+aracRengi+"\n Randevu Tarihiniz: "
                +randevuTarihi+"\n Randevu Saati: "+randevuSaati+"\n Randevunuz başarıyla oluşturulmuştur.";
    }
}
