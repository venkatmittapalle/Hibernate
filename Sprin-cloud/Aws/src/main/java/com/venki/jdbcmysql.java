package com.venki;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class jdbcmysql {
    public static void main(String[] args) throws ClassNotFoundException,SQLException {

Connection con = DriverManager.getConnection("jdbc:oracle:thin:@venkat.cwn3blrzaviw.us-east-1.rds.amazonaws.com:1521:orcl","cogent","Cogent123");
Statement st= con.createStatement();
st.execute("create table empbatch(eno int, ename varchar2(50),esal int, primary key(eno))");

st.execute("insert into empbatch values(1,'Tosha',9999999)");
st.execute("insert into empbatch values(2,'Sarth',9999988)");
st.execute("insert into empbatch values(3,'Priya',9998988)");
st.execute("insert into empbatch values(4,'Mukund',9999999)");
st.execute("insert into empbatch values(5,'QAZ',9999999)");
/*st.execute("update empbatch2 set esal=99999999 where eno=3");
st.execute("delete from empbatch2 where eno=5");*/
ResultSet rs= st.executeQuery("select * from empbatch");
while(rs.next())
{
    System.out.println("Emp no:    "+ rs.getInt(1));
    System.out.println("Emp Name:   "+rs.getString("ename"));
    System.out.println("Emp sal:    "+ rs.getInt(3));
}
rs.close();
st.close();
con.close();
    }

}
