package com.example.testfirst;

public class Hero {

//    private String name;
//    private  String realname;
//    private String team;
//
//    public Hero(String name, String realname, String team) {
//        this.name = name;
//        this.realname = realname;
//        this.team = team;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getRealname() {
//        return realname;
//    }
//
//    public String getTeam() {
//        return team;
//    }

    private String title;
    private String body;

    public Hero(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
