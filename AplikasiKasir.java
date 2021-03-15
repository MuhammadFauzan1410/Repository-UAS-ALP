import java.util.Scanner;

public class AplikasiKasir
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("--------------- APLIKASI KASIR --------------");
        System.out.println("-------------- Starbucks Coffee -------------");
        System.out.println("=============================================");
        System.out.println(" ___________________________________________");
        System.out.println("|                 DAFTAR MENU               |");
        System.out.println("|___________________________________________|");
        System.out.println("|           Menu          |      Harga      |");
        System.out.println("|1. Iced Shaken Tea       |   Rp 22000,00   |");
        System.out.println("|2. Ice Shaken Lemon Tea  |   Rp 40000,00   |");
        System.out.println("|3. Green Tea Latte       |   Rp 51000,00   |");
        System.out.println("|4. Black Tea Latte       |   Rp 39000,00   |");
        System.out.println("|5. Frappucino Coffee     |   Rp 39000,00   |");
        System.out.println("|6. Frappucino Mocha      |   Rp 47000,00   |");
        System.out.println("|7. Frappucino Java Chip  |   Rp 51000,00   |");
        System.out.println("|8. Cold Brew             |   Rp 38000,00   |");
        System.out.println("|9. Signature Chocolate   |   Rp 49000,00   |");
        System.out.println("|10. Freshly Brewed Coffee|   Rp 23000,00   |");
        System.out.println("|_________________________|_________________|");
        System.out.println("");

        int harga = 0;
        int h1 = 22000, h2 = 40000, h3 = 51000, h4 = 39000, h5 = 39000, h6 = 47000, h7 = 51000, h8 = 38000, h9 = 49000, h10 = 23000;
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("___________________________________________");
        System.out.print("Masukkan Nomor Pesanan : ");
        int inNomor = scan.nextInt();
        System.out.print("Masukkan Banyak Pesanan : ");
        int jumlah = scan.nextInt();
        System.out.println("___________________________________________");

        if (inNomor == 1)
        {
            menu = " Iced Shaken Tea";
            System.out.println("Pilihan anda nomor " +inNomor + menu);
            harga = harga + h1 * jumlah;
        }
            else if (inNomor == 2)
            {
                menu = " Ice Shaken Lemon Tea";
                System.out.println("Pilihan anda nomor " +inNomor + menu);
                harga = harga + h2 * jumlah;
            }
                else if (inNomor == 3)
                {
                    menu = " Green Tea Latte";
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                    harga = harga + h3 * jumlah;
                }
                    else if (inNomor == 4)
                    {
                        menu = " Black Tea Latte";
                        System.out.println("Pilihan anda nomor " +inNomor + menu);
                        harga = harga + h4 * jumlah;
                    }
                        else if (inNomor == 5)
                        {
                            menu = " Frappucino Coffee";
                            System.out.println("Pilihan anda nomor " +inNomor + menu);
                            harga = harga + h5 * jumlah;
                        }
                            else if (inNomor == 6)
                            {
                                menu = " Frappucino Mocha";
                                System.out.println("Pilihan anda nomor " +inNomor + menu);
                                harga = harga + h6 * jumlah;
                            }
                                else if (inNomor == 7)
                                {
                                    menu = " Frappucino Java Chip";
                                    System.out.println("Pilihan anda nomor " +inNomor + menu);
                                    harga = harga + h7 * jumlah;
                                }
                                    else if (inNomor == 8)
                                    {
                                        menu = " Cold Brew";
                                        System.out.println("Pilihan anda nomor " +inNomor + menu);
                                        harga = harga + h8 * jumlah;
                                    }
                                        else if (inNomor == 9)
                                        {
                                            menu = " Signature Chocolate";
                                            System.out.println("Pilihan anda nomor " +inNomor + menu);
                                            harga = harga + h9 * jumlah;
                                        }
                                            else if (inNomor == 10)
                                            {
                                                menu = " Freshly Brewed Coffee";
                                                System.out.println("Pilihan anda nomor " +inNomor + menu);
                                                harga = harga + h10 * jumlah;
                                            }
                        else
                    {
                        System.out.println("Nomor yang dipilih tidak ada dalam daftar menu.");
                    }
            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = scan.next();

        }
        System.out.println("___________________________________________");
        System.out.println("Total pembayaran sebesar " +harga+".");
        System.out.println("Terimakasih atas kunjungannya.");
    }
}
