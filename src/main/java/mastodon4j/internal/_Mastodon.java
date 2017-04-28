package mastodon4j.internal;

import mastodon4j.Mastodon;
import mastodon4j.api.AccountsResource;
import mastodon4j.api.AppsResource;
import mastodon4j.api.BlocksResource;
import mastodon4j.api.FavouritesResource;
import mastodon4j.api.FollowRequestsResource;
import mastodon4j.api.FollowsResource;
import mastodon4j.api.InstancesResource;
import mastodon4j.api.MediaResource;
import mastodon4j.api.MutesResource;
import mastodon4j.api.NotificationsResource;
import mastodon4j.api.OauthResource;
import mastodon4j.api.ReportsResource;
import mastodon4j.api.SearchResource;
import mastodon4j.api.StatusesResource;
import mastodon4j.api.StreamingResource;
import mastodon4j.api.TimelinesResource;
import mastodon4j.entity.AccessToken;
import mastodon4j.entity.Account;
import mastodon4j.entity.Application;
import mastodon4j.entity.Attachment;
import mastodon4j.entity.Card;
import mastodon4j.entity.ClientCredential;
import mastodon4j.entity.Context;
import mastodon4j.entity.Instance;
import mastodon4j.entity.Notification;
import mastodon4j.entity.Relationship;
import mastodon4j.entity.Report;
import mastodon4j.entity.Results;
import mastodon4j.entity.Status;
import mastodon4j.entity.Tag;
import mastodon4j.streaming.HashtagStream;
import mastodon4j.streaming.PublicStream;
import mastodon4j.streaming.UserStream;

/**
 *
 * @author hecateball
 */
public class _Mastodon implements Mastodon {

    private final AccountsResource accounts;
    private final AppsResource apps;
    private final BlocksResource blocks;
    private final FavouritesResource favourites;
    private final FollowRequestsResource followRequests;
    private final FollowsResource follows;
    private final InstancesResource instances;
    private final MediaResource media;
    private final MutesResource mutes;
    private final NotificationsResource notifications;
    private final OauthResource oauth;
    private final ReportsResource reports;
    private final SearchResource search;
    private final StatusesResource statuses;
    private final StreamingResource streaming;

    public _Mastodon() {
        this.accounts = new _AccountsResource();
        this.apps = new _AppsResource();
        this.blocks = new _BlocksResource();
        this.favourites = new _FavouritesResource();
        this.followRequests = new _FollowRequestsResource();
        this.follows = new _FollowsResource();
        this.instances = new _InstancesResource();
        this.media = new _MediaResource();
        this.mutes = new _MutesResource();
        this.notifications = new _NotificationsResource();
        this.oauth = new _OauthResource();
        this.reports = new _ReportsResource();
        this.search = new _SearchResource();
        this.statuses = new _StatusesResource();
        this.streaming = new _StreamingResource();

    }

    @Override
    public AccountsResource accounts() {
        return this.accounts;
    }

    @Override
    public AppsResource apps() {
        return this.apps;
    }

    @Override
    public BlocksResource blocks() {
        return this.blocks;
    }

    @Override
    public FavouritesResource favourites() {
        return this.favourites;
    }

    @Override
    public FollowRequestsResource followRequests() {
        return this.followRequests;
    }

    @Override
    public FollowsResource follows() {
        return this.follows;
    }

    @Override
    public InstancesResource instances() {
        return this.instances;
    }

    @Override
    public MediaResource media() {
        return this.media;
    }

    @Override
    public MutesResource mutes() {
        return this.mutes;
    }

    @Override
    public NotificationsResource notifications() {
        return this.notifications;
    }

    @Override
    public OauthResource oauth() {
        return this.oauth;
    }

    @Override
    public ReportsResource reports() {
        return this.reports;
    }

    @Override
    public SearchResource search() {
        return this.search;
    }

    @Override
    public StatusesResource statuses() {
        return this.statuses;
    }

    @Override
    public StreamingResource streaming() {
        return this.streaming;
    }

    @Override
    public TimelinesResource timelines() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account verifyCredentials() {
        return accounts().verifyCredentials();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateCredentials(String displayName, String note, String avatar, String header) {
        this.accounts().updateCredentials(displayName, note, avatar, header);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account getAccount(long id) {
        return this.accounts().getAccount(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getFollowers(long id) {
        return this.accounts().getFollowers(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getFollowing(long id) {
        return this.accounts().getFollowing(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status[] getStatuses(long id) {
        return this.accounts().getStatuses(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship follow(long id) {
        return this.accounts().follow(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship unfollow(long id) {
        return this.accounts().unfollow(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship block(long id) {
        return this.accounts().block(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship unblock(long id) {
        return this.accounts().unblock(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship mute(long id) {
        return this.accounts().mute(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship unmute(long id) {
        return this.accounts().unmute(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Relationship[] relationships(long... ids) {
        return this.accounts().relationships(ids);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] search(String query, long limit) {
        return this.accounts().search(query, limit);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClientCredential registerApplication(Application app, String redirectUris, String scopes) {
        return this.apps().registerApplication(app, redirectUris, scopes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getBlocks() {
        return this.blocks().getBlocks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status[] getFavourites() {
        return this.favourites().getFavourites();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getFollowRequests() {
        return this.followRequests().getFollowRequests();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void authorizeFollowRequest(long id) {
        this.followRequests().authorizeFollowRequest(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void rejectFollowRequest(long id) {
        this.followRequests().rejectFollowRequest(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account follow(String uri) {
        return this.follows().follow(uri);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Instance getInstance() {
        return this.instances().getInstance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Attachment postMedia(String file) {
        return this.media().postMedia(file);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getMutes() {
        return this.mutes().getMutes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Notification[] getNotifications() {
        return this.notifications().getNotifications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Notification getNotification(long id) {
        return this.notifications().getNotification(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void clearNotifications() {
        this.notifications().clearNotifications();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessToken issueAccessToken(String clientId, String clientSecret, String emailAddress, String password, String scopes) {
        return this.oauth().issueAccessToken(clientId, clientSecret, emailAddress, password, scopes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Report[] getReports() {
        return this.reports().getReports();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Report postReport(long accountId, long[] statusIds, String comment) {
        return this.reports().postReport(accountId, statusIds, comment);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Results search(String query, boolean resolve) {
        return this.search().search(query, resolve);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status getStatus(long id) {
        return this.statuses().getStatus(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Context getContext(long id) {
        return this.statuses().getContext(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Card getCard(long id) {
        return this.statuses().getCard(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getRebloggedBy(long id) {
        return this.statuses().getRebloggedBy(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Account[] getFavouritedBy(long id) {
        return this.statuses().getFavouritedBy(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status postStatus(String status, long inReplyToId, long[] mediaIds, boolean sensitive, String spoilerText, String visibility) {
        return this.statuses().postStatus(status, inReplyToId, mediaIds, sensitive, spoilerText, visibility);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteStatus(long id) {
        this.statuses().deleteStatus(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status reblog(long id) {
        return this.statuses().reblog(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status unreblog(long id) {
        return this.statuses().unreblog(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status favourites(long id) {
        return this.statuses().favourites(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status unfavourites(long id) {
        return this.statuses().unfavourites(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserStream userStream() {
        return this.streaming().userStream();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublicStream publicStream() {
        return this.streaming().publicStream();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PublicStream publicStream(boolean local) {
        return this.streaming().publicStream(local);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HashtagStream hashtagStream(Tag tag) {
        return this.streaming().hashtagStream(tag);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HashtagStream hashtagStream(Tag tag, boolean local) {
        return this.streaming().hashtagStream(tag, local);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status[] getHomeTimeline() {
        return this.timelines().getHomeTimeline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status[] getPublicTimeline(boolean local) {
        return this.timelines().getPublicTimeline(local);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Status[] getTagTimeline(String hashtag, boolean local) {
        return this.timelines().getTagTimeline(hashtag, local);
    }

}
