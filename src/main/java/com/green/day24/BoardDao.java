package com.green.day24;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BoardDao { // data access object
 /*
 Vo : Value Object  set으로 값 빼야함
 Dto : Data Transfer Object 데이터 옮길때 사용
 Entity : Entity
*/
    public static int insBoard(BoardEntity entity) { // title, ctnts,writer
                                       //값을 여러개 담아서 한번에 ?
        int result = 0;
        String sql = "INSERT INTO board SET title = ?, ctnts = ?, writer = ?";
       // String sql = String.format("INSERT INTO Board (title, ctnts, writer) " +
       //      "values"  + "('%s', '%s','%s')"
       //,entity.getTitle() , entity.getCtnts() , entity.getWriter());
       // System.out.println(sql);

        /*String sql = "INSERT INTO Board (title, ctnts, writer) " +
                "values" +
                "(?,?,?)"; //이거랑 위에 길게한거랑 같음 문자열에 낵 ㅏ원하는거 넣고싶어서 ????
        */System.out.println(sql);
        Connection c = null;
        PreparedStatement ps = null;
        try {
            c = MyConn.getConn();
            ps = c.prepareStatement(sql);
            ps.setString(1, entity.getTitle()); // 문자열이라 set String
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(c, ps);
        }
        return result;
    }
    public static int delBoard(BoardEntity entity) {
        String sql = "delete from board where iboard = ? ";
        Connection c = null;
        PreparedStatement ps = null;
        int result = 0;

        try{
            c = MyConn.getConn();
            ps = c.prepareStatement(sql);
            ps.setInt(1,entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyConn.close(c,ps);
        }
        return result;
    }
    public static int updBoard (BoardEntity entity) {
        String sql = "update board set title = ? , ctnts = ?,writer = ? ,updated_at = now() where iboard = ?";
        Connection c = null;
        PreparedStatement ps = null;

        int result = 0;
        try {
             c = MyConn.getConn();
             ps = c.prepareStatement(sql);

             ps.setString(1,entity.getTitle());
             ps.setString(2,entity.getCtnts());
             ps.setString(3,entity.getWriter());
             ps.setInt(4,entity.getIboard());
             result = ps.executeUpdate();

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyConn.close(c,ps);
        }
        return result;
    }
    public static List<BoardEntity> seLBoardList() { // 파라미터 안에 값없으면 다 쓰겟다는 말
        List<BoardEntity> list = new ArrayList();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT iboard, title,writer, created_at from board";

        try {
            con  = MyConn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) { // 레코드를 가르킴 그리고 가진 수 만큼 실행
                int iboard = rs.getInt("iboard");  //첫번째줄
                String title = rs.getString("title");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");

                BoardEntity boardEntity = new BoardEntity();

                boardEntity.setIboard(iboard);
                boardEntity.setTitle(title);
                boardEntity.setWriter(writer);
                boardEntity.setCreatedAt(createdAt);

                list.add(boardEntity);
            }

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps,rs);
        }
        return list;
    }

    public static BoardEntity seLBoardById(int num) { // 파라미터 안에 값없으면 다 쓰겟다는 말
        //List<BoardEntity> list = new ArrayList(); 주소값 하나 리턴 두개 안댐
        // array list 사용하는 이유는 값 사용할려고
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT * from board where iboard = ?";
        BoardEntity boardEntity = new BoardEntity();

        try {
            con = MyConn.getConn();
            ps = con.prepareStatement(sql); // 준비
            ps.setInt(1,num); // 첫 번째 ? num 값 넣기
            rs = ps.executeQuery(); // 전송 마지막에 해줘야함 경우의 수 두가지 다 1 혹은 0
            
            /*if (rs.next()) { // 레코드를 가르킴 그리고 가진 수 만큼 실행 / 0개가 넘어올수도있기 때문에 if로해준다
                int iboard = rs.getInt("iboard");  //첫번째줄
                String title = rs.getString("title");
                String ctnts = rs.getString("ctnts");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                //BoardEntity entity = new BoardEntity();
                boardEntity.setIboard(iboard);
                boardEntity.setTitle(title);
                boardEntity.setCtnts(ctnts);
                boardEntity.setWriter(writer);
                boardEntity.setCreatedAt(createdAt);
            }*/

            rs.next(); // do while인경우 rs.next()를 먼저 실행
            do {
                BoardEntity entity = new BoardEntity();
                entity.setIboard(num);
                entity.setWriter(rs.getString("writer"));
                entity.setTitle(rs.getString("title"));
                entity.setCreatedAt(rs.getString("created_at"));
                entity.setCtnts(rs.getString("ctnts"));
                entity.setUpdatedAt(rs.getString("updated_at"));
                return entity;
            }while(!rs.next()); // 언제까지? rs 값아닐때까지?

        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyConn.close(con,ps,rs);
        }
        return boardEntity;
    }
}
class MyconnTest2 {
    public static void main(String[] args) {
        //title :처음작성
        //ctnts : 처음작성하는 내용입니다.
        //wirter : 홍길동
        BoardEntity boardEntity = new BoardEntity();
        //boardEntity.setTitle("처음 작성");
        //boardEntity.setCtnts("처음 작성 하는 내용 입니다.");
        //boardEntity.setWriter("홍길동");
        boardEntity.setTitle("쉽지가않다");
        boardEntity.setCtnts("집에가고싶다");
        boardEntity.setWriter("신나지않다");
        BoardDao.insBoard(boardEntity);
    }
}
class MyconnTest3{
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(7);

        int row = BoardDao.delBoard(entity);
        System.out.println(row);
    }
}
class MyconnTest4 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(5);
        entity.setTitle("리빙데드");
        entity.setCtnts("가");
        entity.setWriter("부르는 소리");

        int row = BoardDao.updBoard(entity);
        System.out.println("row : " + row);
    }
}
class MyConnTest5{
    public static void main(String[] args) {
        List<BoardEntity> list =  BoardDao.seLBoardList();
        for (BoardEntity entity : list) {
            System.out.println(entity);
        }
    }
}

class MycoonTest6{
    public static void main(String[] args) {
        BoardEntity result = BoardDao.seLBoardById(4);
        System.out.println(result);
    }
}