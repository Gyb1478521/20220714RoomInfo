/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmaingamen;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yb
 */
public class BukenInfoCrud {

    String url = "jdbc:postgresql://localhost:5432/GYBYB";
    String user = "postgres";
    String password = "postgres";
    Connection conn = null;
    Statement stmt = null;
    ResultSet rset = null;

    //データベーステーブルを取得

    public Connection getDbcom() throws ClassNotFoundException {
        if (conn == null) {
            Class.forName("org.postgresql.Driver");
            try {
                conn = DriverManager.getConnection(url, user, password);
                stmt = conn.createStatement();
            } catch (SQLException ex) {
            }
        }
        return conn;

    }

    //物件の登録メソッド
    public void conn(String homeid , String bukenname, String address, String eki, String grade) {

        LocalDateTime date = LocalDateTime.now();

        try {

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement query = conn.createStatement();

            String sql = "insert into buken_info( homeid , buken_name , address , eki , grade , create_date , modify_date) "
                    + "values('" + homeid + "','" + bukenname + "','" + address + "','" + eki + "','" + grade + " ','" + date + "','" + date + "'" + ")";

            query.execute(sql);
            System.out.println(sql);
        } catch (SQLException ex) {
            System.out.println("SQLException");
        }

    }

    public void cud(String sql) throws SQLException {

        stmt.execute(sql);

        System.out.println(sql);

    }

    public void BukenDelete(Buken bk) {

        
        try {

            Connection conn = DriverManager.getConnection(url, user, password);

            Statement query = conn.createStatement();
            StringBuffer sb = new StringBuffer();
            sb.append("delete from buken_info ");
            sb.append(" where ");
            sb.append(" homeid = '" + bk.getId()+ "'");
            sb.append(";");
            System.out.println(sb.toString());
            query.execute(sb.toString());

            
           
        } catch (SQLException ex) {
            System.out.println("SQLException");
        }

    }
    public void BukenUpdate(Buken bk){
          
        try {
            conn = DriverManager.getConnection(url, user, password);
            
            Statement query = conn.createStatement();
            
            StringBuffer sb = new StringBuffer();
            sb.append("Update buken_info set ");
            sb.append("buken_name = ' "+bk.getBuken_name()+"',");
            sb.append("address = '"+bk.getAddress()+"',");
            sb.append("eki = '"+bk.getEki()+ "',");
            sb.append("grade = '"+bk.getGrade()+"'");
            sb.append(" where ");
            sb.append("homeid = " +bk.getId());
            sb.append(";");
            System.out.println(sb.toString());
            query.executeUpdate(sb.toString());
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(BukenInfoCrud.class.getName()).log(Level.SEVERE, null, ex);
        }

    
    
    }
    
    
    
    
}
