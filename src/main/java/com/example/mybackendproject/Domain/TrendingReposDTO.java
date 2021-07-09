package com.example.mybackendproject.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class TrendingReposDTO {
    public final Integer total_count;
    public final Boolean incomplete_results;
    public final List<Item> items;

    public TrendingReposDTO(Integer total_count, Boolean incomplete_results, List<Item> items) {
        this.total_count = total_count;
        this.incomplete_results = incomplete_results;
        this.items = items;
    }

    public static class Owner {
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

    public static class License {
        public final String key;
        public final String name;
        public final String spdx_id;
        public final String url;
        public final String node_id;

        public License(String key, String name, String spdx_id, String url, String node_id) {
            this.key = key;
            this.name = name;
            this.spdx_id = spdx_id;
            this.url = url;
            this.node_id = node_id;
        }
    }

    public static class Item {
        public final Integer id;
        public final String node_id;
        public final String name;
        public final String full_name;
        @JsonProperty("private")
        public final Boolean isPrivate;
        public final Owner owner;
        public final String html_url;
        public final String description;
        public final Boolean fork;
        public final String url;
        public final String forks_url;
        public final String keys_url;
        public final String collaborators_url;
        public final String teams_url;
        public final String hooks_url;
        public final String issue_events_url;
        public final String events_url;
        public final String assignees_url;
        public final String branches_url;
        public final String tags_url;
        public final String blobs_url;
        public final String git_tags_url;
        public final String git_refs_url;
        public final String trees_url;
        public final String statuses_url;
        public final String languages_url;
        public final String stargazers_url;
        public final String contributors_url;
        public final String subscribers_url;
        public final String subscription_url;
        public final String commits_url;
        public final String git_commits_url;
        public final String comments_url;
        public final String issue_comment_url;
        public final String contents_url;
        public final String compare_url;
        public final String merges_url;
        public final String archive_url;
        public final String downloads_url;
        public final String issues_url;
        public final String pulls_url;
        public final String milestones_url;
        public final String notifications_url;
        public final String labels_url;
        public final String releases_url;
        public final String deployments_url;
        public final Date created_at;
        public final Date updated_at;
        public final Date pushed_at;
        public final String git_url;
        public final String ssh_url;
        public final String clone_url;
        public final String svn_url;
        public final String homepage;
        public final Integer size;
        public final Integer stargazers_count;
        public final Integer watchers_count;
        public final String language;
        public final Boolean has_issues;
        public final Boolean has_projects;
        public final Boolean has_downloads;
        public final Boolean has_wiki;
        public final Boolean has_pages;
        public final Integer forks_count;
        public final Object mirror_url;
        public final Boolean archived;
        public final Boolean disabled;
        public final Integer open_issues_count;
        public final License license;
        public final Integer forks;
        public final Integer open_issues;
        public final Integer watchers;
        public final String default_branch;
        public final Double score;

        public Item(Integer id, String node_id, String name, String full_name, Boolean pprivate, Owner owner, String html_url, String description, boolean fork, String url, String forks_url, String keys_url, String collaborators_url, String teams_url, String hooks_url, String issue_events_url, String events_url, String assignees_url, String branches_url, String tags_url, String blobs_url, String git_tags_url, String git_refs_url, String trees_url, String statuses_url, String languages_url, String stargazers_url, String contributors_url, String subscribers_url, String subscription_url, String commits_url, String git_commits_url, String comments_url, String issue_comment_url, String contents_url, String compare_url, String merges_url, String archive_url, String downloads_url, String issues_url, String pulls_url, String milestones_url, String notifications_url, String labels_url, String releases_url, String deployments_url, Date created_at, Date updated_at, Date pushed_at, String git_url, String ssh_url, String clone_url, String svn_url, String homepage, Integer size, Integer stargazers_count, Integer watchers_count, String language, Boolean has_issues, Boolean has_projects, Boolean has_downloads, Boolean has_wiki, Boolean has_pages, Integer forks_count, Object mirror_url, Boolean archived, Boolean disabled, Integer open_issues_count, License license, Integer forks, Integer open_issues, Integer watchers, String default_branch, Double score) {
            this.id = id;
            this.node_id = node_id;
            this.name = name;
            this.full_name = full_name;
            this.isPrivate = pprivate;
            this.owner = owner;
            this.html_url = html_url;
            this.description = description;
            this.fork = fork;
            this.url = url;
            this.forks_url = forks_url;
            this.keys_url = keys_url;
            this.collaborators_url = collaborators_url;
            this.teams_url = teams_url;
            this.hooks_url = hooks_url;
            this.issue_events_url = issue_events_url;
            this.events_url = events_url;
            this.assignees_url = assignees_url;
            this.branches_url = branches_url;
            this.tags_url = tags_url;
            this.blobs_url = blobs_url;
            this.git_tags_url = git_tags_url;
            this.git_refs_url = git_refs_url;
            this.trees_url = trees_url;
            this.statuses_url = statuses_url;
            this.languages_url = languages_url;
            this.stargazers_url = stargazers_url;
            this.contributors_url = contributors_url;
            this.subscribers_url = subscribers_url;
            this.subscription_url = subscription_url;
            this.commits_url = commits_url;
            this.git_commits_url = git_commits_url;
            this.comments_url = comments_url;
            this.issue_comment_url = issue_comment_url;
            this.contents_url = contents_url;
            this.compare_url = compare_url;
            this.merges_url = merges_url;
            this.archive_url = archive_url;
            this.downloads_url = downloads_url;
            this.issues_url = issues_url;
            this.pulls_url = pulls_url;
            this.milestones_url = milestones_url;
            this.notifications_url = notifications_url;
            this.labels_url = labels_url;
            this.releases_url = releases_url;
            this.deployments_url = deployments_url;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.pushed_at = pushed_at;
            this.git_url = git_url;
            this.ssh_url = ssh_url;
            this.clone_url = clone_url;
            this.svn_url = svn_url;
            this.homepage = homepage;
            this.size = size;
            this.stargazers_count = stargazers_count;
            this.watchers_count = watchers_count;
            this.language = language;
            this.has_issues = has_issues;
            this.has_projects = has_projects;
            this.has_downloads = has_downloads;
            this.has_wiki = has_wiki;
            this.has_pages = has_pages;
            this.forks_count = forks_count;
            this.mirror_url = mirror_url;
            this.archived = archived;
            this.disabled = disabled;
            this.open_issues_count = open_issues_count;
            this.license = license;
            this.forks = forks;
            this.open_issues = open_issues;
            this.watchers = watchers;
            this.default_branch = default_branch;
            this.score = score;
        }
    }
}
