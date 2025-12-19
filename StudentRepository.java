package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {

    @Autowired
    private JdbcTemplate jd;

    public void createTable(){
        String sql= "create table dummy (" +
                "id int," +
                "name varchar(20)," +
                "age int)";
        jd.execute(sql);
    }

    public int insertValues(int id,String name,int age){
        String sql="insert into dummy (id,name,age) values (?,?,?)";
        return jd.update(sql,id,name,age);
    }

    public List<Map<String,Object>> selectAll(){
        String sql="select * from dummy";
        return jd.queryForList(sql);
    }

    public int update(int id,String name){
        String sql="update dummy set name=? where id=?";
        return jd.update(sql,name,id);
    }

    public int delete(int id){
        String sql="delete from dummy where id=?";
        return jd.update(sql,id);
    }
}
