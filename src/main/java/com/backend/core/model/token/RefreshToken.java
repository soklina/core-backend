package com.lina.cinema.model.token;

import javax.persistence.*;

/**
 * Created by Sok Lina
 * Date     : 5/21/2020, 11:13 AM
 * Email    : lina.sok@prasac.com.kh
 */
@Entity
@Table(name = "oauth_refresh_token")
public class RefreshToken {

    private int id;
    private String token_id;
    private byte[] token;
    private byte[] authentication;

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

    @Column(name = "authentication", columnDefinition = "LONGBLOB")
    public byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }
}
