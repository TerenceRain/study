package org.example.servlet;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class User {
    private String UserName;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    private String PassWord;

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", PassWord='" + PassWord + '\'' +
                '}';
    }

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user = new User();
        user.setUserName("猴哥");
        user.setPassWord("悟空，快来救我");
        String json = mapper.writeValueAsString(user);
        System.out.println(json);

        //反序列化时，json键必须对应类中的成员变量，否则会报错
        String s = "{\"passWord\":\"悟空，快来救我\",\"userName\":\"猴哥\"}\n";
        User u2 = mapper.readValue(s,User.class);
        System.out.println(u2);
    }
}
