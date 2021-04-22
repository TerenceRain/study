package org.example.servlet;

public class User {
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    //    public static void main(String[] args) throws JsonProcessingException {
//        ObjectMapper mapper = new ObjectMapper();
//        User user = new User();
//        user.setUsername("猴哥");
//        user.setPassWord("悟空，快来救我");
//        String json = mapper.writeValueAsString(user);
//        System.out.println(json);
//
//        //反序列化时，json键必须对应类中的成员变量，否则会报错
//        String s = "{\"passWord\":\"悟空，快来救我\",\"userName\":\"猴哥\"}\n";
//        User u2 = mapper.readValue(s,User.class);
//        System.out.println(u2);
//    }
}
