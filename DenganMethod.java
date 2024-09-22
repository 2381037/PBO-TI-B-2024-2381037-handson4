public class DenganMethod {
    public static void main(String[] args) {
     int gajipokok = 5000000;
     int tunjanganTransport = 5000000;
     int tunjanganMakan = 3000000;
     int bonus = 1000000;

     int Penghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
     int pajak = hitungPajak(totalpenghasilan);
     int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

     tampilkanDetailGaji(gajiPokok, tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }

    public static int hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus) {
        return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;
    }

    public static int hitungPajak(int totalPenghasilan) {
        return totalPenghasilan *
    }
}
