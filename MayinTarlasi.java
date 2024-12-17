import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class MayinTarlasi {
    private static final int SATIR = 10;
    private static final int SUTUN = 10;
    private static final int MAYIN_SAYISI = 10;

    private JButton[][] buttons;
    private boolean[][] mayinlar;
    private boolean[][] acilanKareler;
    private int[][] komsumayinSayisi;

    public MayinTarlasi() {
        JFrame frame = new JFrame("Mayın Tarlası");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(SATIR, SUTUN));

        buttons = new JButton[SATIR][SUTUN];
        mayinlar = new boolean[SATIR][SUTUN];
        acilanKareler = new boolean[SATIR][SUTUN];
        komsumayinSayisi = new int[SATIR][SUTUN];

        mayinlariYerlestir();
        komsumayinSayisiniHesapla();

        for (int i = 0; i < SATIR; i++) {
            for (int j = 0; j < SUTUN; j++) {
                buttons[i][j] = new JButton();
                buttons[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        JButton button = (JButton) e.getSource();
                        int row = -1, col = -1;
                        for (int m = 0; m < SATIR; m++) {
                            for (int n = 0; n < SUTUN; n++) {
                                if (buttons[m][n] == button) {
                                    row = m;
                                    col = n;
                                    break;
                                }
                            }
                        }
                        if (e.getButton() == MouseEvent.BUTTON1) { // Sol tıklama
                            tikla(row, col);
                        } else if (e.getButton() == MouseEvent.BUTTON3) { // Sağ tıklama
                            button.setText(button.getText().equals("F") ? "" : "F");
                        }
                    }
                });
                frame.add(buttons[i][j]);
            }
        }

        frame.pack();
        frame.setVisible(true);
    }

    private void mayinlariYerlestir() {
        Random rand = new Random();
        int yerlestirilenMayinSayisi = 0;
        while (yerlestirilenMayinSayisi < MAYIN_SAYISI) {
            int sat = rand.nextInt(SATIR);
            int sut = rand.nextInt(SUTUN);
            if (!mayinlar[sat][sut]) {
                mayinlar[sat][sut] = true;
                yerlestirilenMayinSayisi++;
            }
        }
    }

    private void komsumayinSayisiniHesapla() {
        for (int i = 0; i < SATIR; i++) {
            for (int j = 0; j < SUTUN; j++) {
                if (!mayinlar[i][j]) {
                    int count = 0;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int newI = i + di;
                            int newJ = j + dj;
                            if (newI >= 0 && newI < SATIR && newJ >= 0 && newJ < SUTUN && mayinlar[newI][newJ]) {
                                count++;
                            }
                        }
                    }
                    komsumayinSayisi[i][j] = count;
                }
            }
        }
    }

    private void tikla(int row, int col) {
        if (mayinlar[row][col]) {
            buttons[row][col].setText("X");
            JOptionPane.showMessageDialog(null, "Mayına bastın! Oyun bitti!");
            System.exit(0);
        } else {
            if (!acilanKareler[row][col]) {
                acilanKareler[row][col] = true;
                buttons[row][col].setText(komsumayinSayisi[row][col] == 0 ? "" : String.valueOf(komsumayinSayisi[row][col]));
                buttons[row][col].setEnabled(false);
                if (komsumayinSayisi[row][col] == 0) {
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int newI = row + di;
                            int newJ = col + dj;
                            if (newI >= 0 && newI < SATIR && newJ >= 0 && newJ < SUTUN && !acilanKareler[newI][newJ]) {
                                tikla(newI, newJ);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new MayinTarlasi();
    }
}
