
package prolab24;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Tablo extends javax.swing.JFrame {
private String kullaniciadi="root";
    private String parola="";
    private String host="127.0.0.1";
    private String db="prolab4";
    private int port=3306;
         private Connection conn=null;
    private ResultSet rs=null;
    private Statement pst=null;
    DefaultTableModel model=new DefaultTableModel();
    Object[] kolon={"No","İsim","Soyisim","Veli","asdasd","sads","kalsl"};
    Object[] satir= new Object[7];
    public Tablo() throws SQLException {
        String url="jdbc:mysql://"+this.host+":"+this.port+"/"+this.db;
               try{
                   Class.forName("com.mysql.jdbc.Driver");
               }
               catch(ClassNotFoundException e){
                   System.out.println("mysql connector yok");
                   e.printStackTrace();
               }
               try{
                   this.conn= (Connection) DriverManager.getConnection(url,kullaniciadi,parola);
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
               model.setColumnIdentifiers(kolon);
               jTable1.setModel(model);
               Statement ac=(Statement)conn.createStatement();
               ResultSet tablo=ac.executeQuery("SELECT * from tbl_ilan");
              while(tablo.next()){
                  satir[0]=tablo.getString("IlanID");
                  satir[1]=tablo.getString("Ilan_Adi");
                  satir[2]=tablo.getString("Ilan_Fiyat");
                  satir[3]=tablo.getString("Ilan_Km");
                  satir[4]=tablo.getString("Ilan_Tarih");
                  satir[5]=tablo.getString("Ilan_ArabaID");
                  satir[6]=tablo.getString("Ilan_SehirID");
                          model.addRow(satir);
                  
              }
               
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Tablo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Tablo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
