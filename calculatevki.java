public class calculatevki {

  public static class Insan {

      public String isim;
      public int kilo;
      public double boy;

      public Insan() {
          isim = "";
          kilo = 0;
          boy = 0.0;
      }

      void yemek(int mik){
        kilo += mik/100;
      }

      void endeksHesapla() {
        double endeks = kilo / ((double) boy * boy);

        String saglik;

        if( endeks < 24.9 && endeks > 18.5){
          saglik = "Sağlıklı";
        }
        else {
          saglik = "Sağlıksız";
        };

        System.out.println("\n" + isim + ":" + "\nVücut kitle endeksi: " + endeks + "\nDurum: " + saglik);
      };

  }

  public static class Yiyecek {
      public int besin;
  }

  public static void main(String[] args) {
      Insan ali = new Insan();
      ali.isim = "Ali";
      ali.boy = 1.80;
      ali.kilo = 75;
      
      Insan veli = new Insan();
      veli.isim = "Veli";
      veli.boy = 1.85;
      veli.kilo = 90;

      Yiyecek doner = new Yiyecek();
      doner.besin = 250;

      Yiyecek hamburger = new Yiyecek();
      doner.besin = 350;
      
      Yiyecek corba = new Yiyecek();
      corba.besin = 50;

      System.out.println("\nYemekten Önce:");
      ali.endeksHesapla();
      veli.endeksHesapla();

      ali.yemek(doner.besin);
      ali.yemek(hamburger.besin);
      ali.yemek(corba.besin);
      veli.yemek(corba.besin);
      
      System.out.println("\nYemekten Sonra:");
      ali.endeksHesapla();
      veli.endeksHesapla();
  }
}
