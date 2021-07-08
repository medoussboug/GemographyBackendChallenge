package com.example.mybackendproject.Domain;

public class Owner {
    public final String login;
    public final Integer id;
    public final String node_id;
    public final String avatar_url;
    public final String gravatar_id;
    public final String url;
    public final String html_url;
    public final String followers_url;
    public final String following_url;
    public final String gists_url;
    public final String starred_url;
    public final String subscriptions_url;
    public final String organizations_url;
    public final String repos_url;
    public final String events_url;
    public final String received_events_url;
    public final String type;
    public final Boolean site_admin;

    public Owner(String login, Integer id, String node_id, String avatar_url, String gravatar_id, String url, String html_url, String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url, String organizations_url, String repos_url, String events_url, String received_events_url, String type, Boolean site_admin) {
        this.login = login;
        this.id = id;
        this.node_id = node_id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
    }
}
