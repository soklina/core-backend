package com.lina.cinema.model.token;

import javax.persistence.*;

/**
 * Created by Sok Lina
 * Date     : 5/21/2020, 11:12 AM
 * Email    : lina.sok@prasac.com.kh
 */
@Entity
@Table(name = "oauth_access_token")
public class AccessToken {

    private int id;
    private String token_id;
    private byte[] token;
    private String authentication_id;
    private String user_name;
    private String client_id;
    private byte[] authentication;
    private String refresh_token;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "token_id", length = 255)
    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    @Column(name = "token", columnDefinition = "LONGBLOB")
    public byte[] getToken() {
        return token;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    @Column(name = "authentication_id", length = 255)
    public String getAuthentication_id() {
        return authentication_id;
    }

    public void setAuthentication_id(String authentication_id) {
        this.authentication_id = authentication_id;
    }

    @Column(name = "user_name", length = 255)
    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Column(name = "client_id", length = 255)
    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    @Column(name = "authentication", columnDefinition = "LONGBLOB")
    public byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }

    @Column(name = "refresh_token", length = 255)
    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
}
