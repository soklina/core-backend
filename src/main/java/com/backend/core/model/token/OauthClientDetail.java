package com.lina.cinema.model.token;

import javax.persistence.*;

/**
 * Created by Sok Lina
 * Date     : 5/21/2020, 11:13 AM
 * Email    : lina.sok@prasac.com.kh
 */
@Entity
@Table(name = "oauth_client_details")
public class OauthClientDetail {

    private Long id;
    private String clientId;
    private String resourceId;
    private String clientSecret;
    private String scope;
    private String authGrantType;
    private String urlDirection;
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokeValidity;
    private String additionalInformation;
    private String autoApprove;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Column(name = "resource_ids")
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Column(name = "client_secret")
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @Column(name = "scope")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Column(name = "authorized_grant_types")
    public String getAuthGrantType() {
        return authGrantType;
    }

    public void setAuthGrantType(String authGrantType) {
        this.authGrantType = authGrantType;
    }

    @Column(name = "web_server_redirect_uri")
    public String getUrlDirection() {
        return urlDirection;
    }

    public void setUrlDirection(String urlDirection) {
        this.urlDirection = urlDirection;
    }

    @Column(name = "authorities")
    public String getAuthorities() {
        return authorities;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities;
    }

    @Column(name = "access_token_validity")
    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    @Column(name = "refresh_token_validity")
    public Integer getRefreshTokeValidity() {
        return refreshTokeValidity;
    }

    public void setRefreshTokeValidity(Integer refreshTokeValidity) {
        this.refreshTokeValidity = refreshTokeValidity;
    }

    @Column(name = "additional_information")
    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Column(name = "autoapprove")
    public String getAutoApprove() {
        return autoApprove;
    }

    public void setAutoApprove(String autoApprove) {
        this.autoApprove = autoApprove;
    }
}
