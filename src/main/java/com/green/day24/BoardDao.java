package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

// data access object
public class BoardDao {
    public static int insBoard(BoardEntity entity) { // title, ctnts,writer
        int result = 0;
       // String sql = String.format("INSERT INTO Board (title, ctnts, writer) " +
        //      "values"  + "('%s', '%s','%s')"
        //,entity.getTitle() , entity.getCtnts() , entity.getWriter());
       // System.out.println(sql);

        String sql = "INSERT INTO Board (title, ctnts, writer) " +
                "values" +
                "(?,?,?)"; //이거랑 위에 길게한거랑 같음

        try {
            Connection con = MyConn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
        }
        return result;
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
        boardEntity.setTitle("오늘 insert 배움");
        boardEntity.setCtnts("푸른눈의백룡");
        boardEntity.setWriter("신나지않다");
        BoardDao.insBoard(boardEntity);
    }
}