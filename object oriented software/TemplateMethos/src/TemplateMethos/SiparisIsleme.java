package TemplateMethos;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SiparisIsleme {
    
    // Template Method sınıfı
    abstract static class SiparisIslemeTemplate {
        public final void siparisIsle() {
            urunleriHazirla();
            odemeyiAl();
            bildirimGonder();
            fisYazdir();
        }

        protected abstract void urunleriHazirla();
        protected abstract void odemeyiAl();
        protected abstract void bildirimGonder();
        protected abstract void fisYazdir();
    }

    // ConcreteClass: Online Sipariş İşleme
    static class OnlineSiparisIsleme extends SiparisIslemeTemplate {
        @Override
        protected void urunleriHazirla() {
            System.out.println("Ürünler hazırlanıyor (online sipariş)...");
        }

        @Override
        protected void odemeyiAl() {
            System.out.println("Ödeme alınıyor (online ödeme)...");
        }

        @Override
        protected void bildirimGonder() {
            System.out.println("Müşteriye bildirim gönderiliyor (e-posta)...");
        }

        @Override
        protected void fisYazdir() {
            System.out.println("Fatura e-posta ile gönderiliyor...");
        }
    }

    // ConcreteClass: Fiziksel Sipariş İşleme
    static class FizikselSiparisIsleme extends SiparisIslemeTemplate {
        @Override
        protected void urunleriHazirla() {
            System.out.println("Ürünler hazırlanıyor (fiziksel sipariş)...");
        }

        @Override
        protected void odemeyiAl() {
            System.out.println("Ödeme alınıyor (nakit/kredi kartı)...");
        }

        @Override
        protected void bildirimGonder() {
            System.out.println("Müşteriye bildirim veriliyor (fiş)...");
        }

        @Override
        protected void fisYazdir() {
            System.out.println("Fiziksel fatura yazdırılıyor...");
        }
    }

    // Swing Arayüzü
    public static void main(String[] args) {
        // Swing bileşenleri oluştur
        JFrame frame = new JFrame("Kafe Sipariş Sistemi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel label = new JLabel("Sipariş Tipi:");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        String[] siparisTipleri = {"Online Sipariş", "Fiziksel Sipariş"};
        JComboBox<String> siparisTipiComboBox = new JComboBox<>(siparisTipleri);
        siparisTipiComboBox.setBounds(150, 20, 165, 25);
        panel.add(siparisTipiComboBox);

        JButton siparisVerButton = new JButton("Sipariş Ver");
        siparisVerButton.setBounds(10, 80, 150, 25);
        panel.add(siparisVerButton);

        JTextArea sonucArea = new JTextArea();
        sonucArea.setBounds(10, 110, 350, 50);
        panel.add(sonucArea);

        siparisVerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String secilenSiparisTipi = (String) siparisTipiComboBox.getSelectedItem();
                SiparisIslemeTemplate siparisIsleme;

                if (secilenSiparisTipi.equals("Online Sipariş")) {
                    siparisIsleme = new OnlineSiparisIsleme();
                } else {
                    siparisIsleme = new FizikselSiparisIsleme();
                }

                // Siparişi işleme
                siparisIsleme.siparisIsle();
                sonucArea.setText("Sipariş işlemi tamamlandı: " + secilenSiparisTipi);
            }
        });
    }
}

