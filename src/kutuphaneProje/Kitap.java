package kutuphaneProje;

public class Kitap {

    /*
   1. Kullanıcının Kitap ekleme, silme ve listeleme gibi
      işlemleri yapmasına imkan tanıyan bir uygulama yazınız.
   2. Program, kitaplara 1000’den başlayarak sıralı ve otomatik numara vermeli.
      Bunun yanında, her bir kitap için Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir.
   3. Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
      Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.

      ========= KİTAP PROGRAMI =============
         1: Kitap ekle
         2: Numara ile kitap sil
         3: Tüm kitapları listele
         4: Bitir
    */

    private int no;
    private String kitapAdi;
    private String yazarAdi;
    private int yayinYili;
    private double fiyat;

    public Kitap() {
    }

    public Kitap(int no, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
        this.no = no;
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.yayinYili = yayinYili;
        this.fiyat = fiyat;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdi() {
        return yazarAdi;
    }

    public void setYazarAdi(String yazarAdi) {
        this.yazarAdi = yazarAdi;
    }

    public int getYayinYili() {
        return yayinYili;
    }

    public void setYayinYili(int yayinYili) {
        this.yayinYili = yayinYili;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "\nKitap{" +
                "no=" + no +
                ", kitapAdi='" + kitapAdi + '\'' +
                ", yazarAdi='" + yazarAdi + '\'' +
                ", yayinYili=" + yayinYili +
                ", fiyat=" + fiyat +
                '}';
    }
}
