public class ContohMethodStaticDanNonStatic {
    public static double hitungLuasPersegi(double sisi){
        return sisi * sisi;
    }
    public void tampilkanPesanSelamatDatang(String nama){
        System.out.println("Selamat datang, " + nama + "!");
    }
    public static void main(String[] args) {
        double luasPersegi = ContohMethodStaticDanNonStatic.hitungLuasPersegi(5);
        System.out.println("Luas Persegi dengan sisi 5: " + luasPersegi);
        ContohMethodStaticDanNonStatic objek = new ContohMethodStaticDanNonStatic();
        objek.tampilkanPesanSelamatDatang("John");  // Tidak perlu menyebutkan nama parameter
    }
}