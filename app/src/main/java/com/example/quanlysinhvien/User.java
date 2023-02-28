package com.example.quanlysinhvien;
import java.util.HashMap;
import java.util.Map;
public class User {
    private int id;
    private String name;
    private int vanghoc;
    public User(int id, String name, int vanghoc) {
        this.id = id;
        this.name = name;
        this.vanghoc = vanghoc;
    }

    public User(String name, int vanghoc) {

        this.name = name;
        this.vanghoc = vanghoc;
    }
    public User() {}
    public int getVanghoc() {
        return vanghoc;
    }
    public void setVanghoc(int vanghoc) {
        this.vanghoc = vanghoc;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("name", name);
        result.put("vanghoc", vanghoc);
        return result;
    }
}
