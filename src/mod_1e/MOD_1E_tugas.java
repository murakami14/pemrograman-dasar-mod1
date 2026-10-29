/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mod_1e;

import javax.swing.JOptionPane;

public class MOD_1E_tugas {
    public static void main(String[] args) {
        String pesan = "<html>"
            + "<b>===== KARTU TANDA MAHASISWA =====</b><br>"
            + "UNIVERSITAS KUNINGAN<br>"
            + "-----------------------------------<br>"
            + "<table>"
            + "<tr><td>Nama</td><td>: Fabio Alifabiandra</td></tr>"
            + "<tr><td>NIM</td><td>: 20250910028</td></tr>"
            + "<tr><td>Jenis Kelamin</td><td>: L</td></tr>"
            + "<tr><td>TTL</td><td>: 14 April 2007</td></tr>"
            + "<tr><td>Program Studi</td><td>: Sistem Informasi (S1)</td></tr>"
            + "<tr><td>Fakultas</td><td>: Ilmu Komputer</td></tr>"
            + "<tr><td>Angkatan</td><td>: 2025</td></tr>"
            + "</table>"
            + "</html>";

        JOptionPane.showMessageDialog(null, pesan,
            "Kartu Tanda Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
    }
}