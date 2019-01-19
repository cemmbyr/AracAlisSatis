
package prolab24;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ArayuzKayitGüncelleme extends javax.swing.JFrame {
    
    private String kullaniciadi="root";
    private String parola="";
    private String host="127.0.0.1";
    private String db="prolab4";
    private int port=3306;
         private Connection conn=null;
    private ResultSet rs=null;
    private Statement pst=null;
    public ArayuzKayitGüncelleme() {
        String url="jdbc:mysql://"+this.host+":"+this.port+"/"+this.db;
               try{
                   Class.forName("com.mysql.jdbc.Driver");
               }
               catch(ClassNotFoundException e){
                   System.out.println("mysql connector yok");
                   e.printStackTrace();
               }
               try{
                   this.conn= (com.mysql.jdbc.Connection) DriverManager.getConnection(url,kullaniciadi,parola);
               }
               catch(SQLException e){
                   System.out.println("Baglanti basarisiz");
                   e.printStackTrace();
               }
               if(conn!=null){
                   System.out.println("Bağlantı Başarılı");
               }
               else{
                   System.out.println("Bağlantı Başarısız");
               }
        initComponents();
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        jTextField11.setEditable(false);
        jComboBox7.setEnabled(false);
        jComboBox4.setEnabled(false);
        jComboBox5.setEnabled(false);
        jComboBox6.setEnabled(false);
        jComboBox1.setEnabled(false);
        jComboBox2.setEnabled(false);
        jComboBox3.setEnabled(false);
        jComboBox7.setEnabled(false);
        jComboBox7.setEnabled(false);
        jButton1.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField7 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(831, 831));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setText("KAYIT GÜNCELLEME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("İLAN ADI");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("FİYATI");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("ŞEHİR");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("İLAN TARİHİ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("MARKASI");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("MODELİ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("PLAKA");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("KM");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("YAKIT TÜRÜ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("RENK");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("VİTES TÜRÜ");
        jLabel8.setToolTipText("");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Manuel", "Otomatik", "Yarı Otomatik" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Beyaz (Opak)", "Mistral Mavi (Opak)", "Alev Kırmızı (Metalik)", "Atlas Mavi (Metalik)", "Bakır Kahve (Metalik)", "Bulut Gri (Metalik)", "Platin Gri (Metalik)", "Yıldız Siyah (Metalik)", " " }));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Benzin", "LPG", "Dizel", "Elektrik", "Hibrit" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "31", "30", "29", "28", "27", "26", "25", "24", "23", "22", "21", "20", "19", "18", "17", "16", "15", "14", "13", "12", "11", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz", "Adana ", "Adıyaman ", "Afyonkarahisar ", "Ağrı ", "Amasya ", "Ankara ", "Antalya ", "Artvin ", "Aydın ", "Balıkesir ", "Bilecik ", "Bingöl ", "Bitlis ", "Bolu ", "Burdur ", "Bursa ", "Çanakkale ", "Çankırı ", "Çorum ", "Denizli ", "Diyarbakır ", "Edirne ", "Elazığ ", "Erzincan ", "Erzurum ", "Eskişehir ", "Gaziantep ", "Giresun ", "Gümüşhane ", "Hakkari ", "Hatay ", "Isparta ", "Mersin ", "İstanbul ", "İzmir ", "Kars ", "Kastamonu ", "Kayseri ", "Kırklareli ", "Kırşehir ", "Kocaeli ", "Konya ", "Kütahya ", "Malatya ", "Manisa ", "K.maraş ", "Mardin ", "Muğla ", "Muş ", "Nevşehir ", "Niğde ", "Ordu ", "Rize ", "Sakarya ", "Samsun ", "Siirt ", "Sinop ", "Sivas ", "Tekirdağ ", "Tokat ", "Trabzon ", "Tunceli ", "Şanlıurfa ", "Uşak ", "Van ", "Yozgat ", "Zonguldak ", "Aksaray ", "Bayburt ", "Karaman ", "Kırıkkale ", "Batman ", "Şırnak ", "Bartın ", "Ardahan ", "Iğdır ", "Yalova ", "Karabük ", "Kilis ", "Osmaniye ", "Düzce" }));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("GÜNCELLE");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("GERİ DÖN");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("GÜNCELLEMEK İSTEDİĞİNİZ ARABANIN PLAKASINI GİRİNİZ");

        jButton4.setText("SORGULA");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField7)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel13)
                .addGap(33, 33, 33)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       String Plaka=jTextField3.getText();
        int Ilan_Sehir = jComboBox7.getSelectedIndex()+2;
        String Ilan_Adi=jTextField1.getText();
        String Ilan_Fiyat=jTextField2.getText();
        String Ilan_Tarih=(String)jComboBox4.getSelectedItem()+"-"+jComboBox5.getSelectedIndex()+"-"+jComboBox6.getSelectedItem();
        String Ilan_Marka=jTextField5.getText();
        String Ilan_Model=jTextField6.getText();
        String Ilan_Plaka=jTextField11.getText();
        String Ilan_Km=jTextField7.getText();
        int Ilan_Yakit=jComboBox1.getSelectedIndex();
        int Ilan_Vites=jComboBox2.getSelectedIndex();
        int Ilan_Renk=jComboBox3.getSelectedIndex();
        String Sehir=(String) jComboBox7.getSelectedItem();
        String Yakit=(String) jComboBox1.getSelectedItem();
        String Vites=(String) jComboBox2.getSelectedItem();
        String Renk=(String) jComboBox3.getSelectedItem();
        String Tarih=(String) jComboBox4.getSelectedItem()+jComboBox5.getSelectedItem()+jComboBox6.getSelectedItem();
        String ara1="Seçiniz";
        String ara2="SeçinizSeçinizSeçiniz";
        String ara="";
        try{
            Statement ac1=(Statement)conn.createStatement();
           if(!Ilan_Adi.equals(ara)){
            String sql1 = "UPDATE tbl_ilan SET Ilan_Adi = '"+Ilan_Adi+"' WHERE Ilan_ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql1);
           }if(!Ilan_Fiyat.equals(ara)){
               Integer.parseInt(Ilan_Fiyat);
            String sql2 = "UPDATE tbl_ilan SET Ilan_Fiyat = '"+Ilan_Fiyat+"' WHERE Ilan_ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql2);
           }if(!Ilan_Km.equals(ara)){
               Integer.parseInt(Ilan_Km);
            String sql3 = "UPDATE tbl_ilan SET Ilan_Km = '"+Ilan_Km+"' WHERE Ilan_ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql3);
           }if(!Tarih.equals(ara2)){
            String sql4 = "UPDATE tbl_ilan SET Ilan_Tarih = '"+Ilan_Tarih+"' WHERE Ilan_ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql4);
           }if(!Ilan_Plaka.equals(ara)){
            String sq114="SELECT Ilan_ARABAID FROM tbl_ilan";
            ResultSet sonuc2=ac1.executeQuery(sq114);
            ArrayList<String> plakalar1=new ArrayList<>();
            while(sonuc2.next()){
                plakalar1.add(sonuc2.getString("Ilan_ARABAID"));
            }
            if(plakalar1.contains(Ilan_Plaka)){
                System.out.println("Veri tabanında aynı plakadan var!");   
            }else{
               String sql5 = "UPDATE tbl_ilan SET Ilan_ArabaID = '"+Ilan_Plaka+"' WHERE Ilan_ArabaID = '"+Plaka+"'";
            String sql7 = "UPDATE tbl_araba SET ArabaID = '"+Ilan_Plaka+"' WHERE ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql5);
           ac1.executeUpdate(sql7);
            }
           }if(!Sehir.equals(ara1)){
            String sql6 = "UPDATE tbl_ilan SET Ilan_SehirID = '"+Ilan_Sehir+"' WHERE Ilan_ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql6);
           }if(!Ilan_Marka.equals(ara)){
            String sql8 = "UPDATE tbl_araba SET Araba_Marka = '"+Ilan_Marka+"' WHERE ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql8);
           }if(!Ilan_Model.equals(ara)){
            String sql9 = "UPDATE tbl_araba SET Araba_Model = '"+Ilan_Model+"' WHERE ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql9);
           }if(!Vites.equals(ara1)){
            String sqll1 = "UPDATE tbl_araba SET Araba_VitesTuruID = '"+Ilan_Vites+"' WHERE ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sqll1);
           }if(!Yakit.equals(ara1)){
            String sql12 = "UPDATE tbl_araba SET Araba_YakitTuruID = '"+Ilan_Yakit+"' WHERE ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql12);
           }if(!Renk.equals(ara1)){
            String sql13 = "UPDATE tbl_araba SET Araba_RenkID = '"+Ilan_Renk+"' WHERE ArabaID = '"+Plaka+"'";
           ac1.executeUpdate(sql13);
           }
            conn.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(ArayuzKayitGüncelleme.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
        new ArayuzKayitGüncelleme().setVisible(true);
        new Basarili().setVisible(true);
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        dispose();
        new ArayüzVeriIslemleri().setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String Plaka=jTextField3.getText();
        try{
            Statement ac=(Statement)conn.createStatement();
            String sq1="SELECT Ilan_ARABAID FROM tbl_ilan";
            ResultSet sonuc1=ac.executeQuery(sq1);
            ArrayList<String> plakalar=new ArrayList<>();
            while(sonuc1.next()){
                plakalar.add(sonuc1.getString("Ilan_ARABAID"));
            }
            System.out.println(plakalar);
                if(plakalar.contains(Plaka)){
                   jTextField1.setEditable(true);
        jTextField2.setEditable(true);
        jTextField5.setEditable(true);
        jTextField6.setEditable(true);
        jTextField7.setEditable(true);
        jTextField11.setEditable(true);
        jComboBox7.setEnabled(true);
        jComboBox4.setEnabled(true);
        jComboBox5.setEnabled(true);
        jComboBox6.setEnabled(true);
        jComboBox1.setEnabled(true);
        jComboBox2.setEnabled(true);
        jComboBox3.setEnabled(true);
        jComboBox7.setEnabled(true);
        jComboBox7.setEnabled(true);
        jButton1.setEnabled(true);
        jLabel14.setVisible(false);
               
                }else{
                    System.out.println("Böyle bir ilan yok");
                    jLabel14.setText("Böyle bir ilan yok");
                }
            
        } catch (SQLException ex) {
            Logger.getLogger(ArayuzKayitGüncelleme.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ArayuzKayitGüncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ArayuzKayitGüncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ArayuzKayitGüncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ArayuzKayitGüncelleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ArayuzKayitGüncelleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
