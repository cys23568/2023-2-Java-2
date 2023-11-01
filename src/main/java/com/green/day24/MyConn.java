package com.green.day24;

import java.sql.*;

public class MyConn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver"); // 패키지이다.
            conn = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (Exception e) {
            System.out.println("에러발생!!");
            e.printStackTrace();
        }
        System.out.println("접속 성공");
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps) {
        //ps.close(); // 이것만하면 오류뜸 왜 why 오류나면 던질꺼래  throws
        // 오류 안뜨게 할려면 try catch 로 해결가능 혹은 나도 던질래하면가능
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if (conn != null) {
            try {
                conn.close(); //닫아줘야하는 이유가 ??? 엄청 잡아먹는데
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
                                //연결할때사용       ?를 사용하기위해서   next() 사용가능 리턴
        if (rs != null) {
            try {
                rs.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn,ps);
    }



    // 한번에 하지말고 각각하는게좋다 하나가 예외 발생하면 다른거는 실행을 하지않는다.

}
