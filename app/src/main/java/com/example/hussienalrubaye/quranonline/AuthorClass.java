package com.example.hussienalrubaye.quranonline;

/*
  Created by hussienalrubaye on 12/26/15.
 */
/**
 * Created by ASUS S550C on 18/01/2015.
 */
class AuthorClass {
    String RealName ;
    String ServerName ;
    String StateName ;
    String ImgUrl ;
    AuthorClass(){}
    AuthorClass(String ServerName, String RealName)
    { this.ServerName=ServerName;
        this.RealName=RealName;
    }
    AuthorClass(String ServerName, String RealName, String StateName, String ImgUrl)
    { this.ServerName=ServerName;
        this.RealName=RealName;
        this.StateName=StateName;
        this.ImgUrl=ImgUrl;
    }
}
