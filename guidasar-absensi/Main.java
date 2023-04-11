import javax.swing.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        //CARI TANGGAL
        Calendar cal=Calendar.getInstance();
        System.out.println("Current Date:"+cal.get(Calendar.DATE));
        System.out.println("Current Month:"+(cal.get(Calendar.MONTH)+1));
        System.out.println("Current Year:"+cal.get(Calendar.YEAR));


        //INISISASI KELAS
        String kelasMhs[] = {"1 REG A","1 REG B","1 REG C","1 REG D","1 BIL A","1 BIL B",
                "3 REG A","3 REG B","3 REG C","3 REG D","3 BIL A","3 BIL B",};

        //BUAT KONTAINER
        JFrame Aplikasi = new JFrame("ABSENSI MAHASISWA TI");
        Aplikasi.setSize(400,550);
        Aplikasi.setLayout(null);
        Aplikasi.setLocationRelativeTo(null);
        Aplikasi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Judul
        JLabel jJudulAplikasi = new JLabel("ABSENSI MAHASISWA TI");
        jJudulAplikasi.setBounds(130,0,150,80);
        Aplikasi.add(jJudulAplikasi);

        //Tanggal
        JLabel lTanggal = new JLabel("Tanggal Absensi: ");
        lTanggal.setBounds(20,80,150,30);
        Aplikasi.add(lTanggal);

        JLabel lTanggalHariIni = new JLabel((cal.get(Calendar.DATE))+" / "+(cal.get(Calendar.MONTH)+1)+" / "+cal.get(Calendar.YEAR));
        lTanggalHariIni.setBounds(170,80,150,30);
        Aplikasi.add(lTanggalHariIni);

        //Nama Mahasiswa
        JLabel lNama = new JLabel("Nama Mahasiswa: ");
        lNama.setBounds(20,130,150,30);
        Aplikasi.add(lNama);

        JTextField tfNama = new JTextField();
        tfNama.setBounds(170,130,160,30);
        Aplikasi.add(tfNama);

        //NIM Mahasiswa
        JLabel lNIM = new JLabel("NIM Mahasiswa:");
        lNIM.setBounds(20,180,150,30);
        Aplikasi.add(lNIM);

        JTextField tfNIM = new JTextField();
        tfNIM.setBounds(170,180,160,30);
        Aplikasi.add(tfNIM);

        //Kelas
        JLabel lKelas = new JLabel("Kelas:");
        lKelas.setBounds(20,230,150,30);
        Aplikasi.add(lKelas);

        JComboBox cbKelas = new JComboBox(kelasMhs);
        cbKelas.setBounds(170,230,160,30);
        Aplikasi.add(cbKelas);

        //HADIR / IZIN
        JLabel lHadir = new JLabel("Kategori:");
        lHadir.setBounds(20,280,150,30);
        Aplikasi.add(lHadir);

        JRadioButton rdHadir = new JRadioButton("Hadir");
        rdHadir.setBounds(165,280,70,30);
        Aplikasi.add(rdHadir);

        JRadioButton rdIzin = new JRadioButton("Izin");
        rdIzin.setBounds(70+165,280,70,30);
        Aplikasi.add(rdIzin);
                //BIAR CUMAN PACAK MILIH SIKOK BAE
        ButtonGroup bgKategori = new ButtonGroup();
        bgKategori.add(rdHadir);
        bgKategori.add(rdIzin);

        //KONFIRMASI
        JCheckBox cbKonfirmasi = new JCheckBox("Saya sudah mengisi absensi dengan jujur!");
        cbKonfirmasi.setBounds(18,330,300,30);
        Aplikasi.add(cbKonfirmasi);

        //SUBMIT
        JButton bKirim = new JButton("Kirim");
        bKirim.setBounds(145,380,100,30);
        Aplikasi.add(bKirim);


        //Nampilin form, dan buat ga repot2 narik2 biar munculin element
        Aplikasi.setVisible(true);
    }
}
