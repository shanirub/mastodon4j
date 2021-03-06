package mastodon4j.internal;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;
import mastodon4j.api.OauthResource;
import mastodon4j.entity.AccessToken;

/**
 *
 * @author hecateball
 */
final class _OauthResource implements OauthResource {

    private final String uri;
    private final Client client;

    public _OauthResource(String uri) {
        this.uri = uri;
        this.client = new _ClientSupplier().get();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AccessToken issueAccessToken(String clientId, String clientSecret, String emailAddress, String password, String scopes) {
        Form form = new Form();
        form.param("client_id", clientId)
                .param("client_secret", clientSecret)
                .param("username", emailAddress)
                .param("password", password)
                .param("scope", scopes)
                .param("grant_type", "password");
        return this.client
                .target(this.uri)
                .path("/oauth/token")
                .request(MediaType.APPLICATION_JSON)
                .post(Entity.form(form), AccessToken.class);
        //TODO: Error handling
    }

}
