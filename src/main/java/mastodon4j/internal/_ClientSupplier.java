package mastodon4j.internal;

import java.util.function.Supplier;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 *
 * @author hecateball
 */
final class _ClientSupplier implements Supplier<Client> {

    private static Client client;

    _ClientSupplier() {
        if (_ClientSupplier.client == null) {
            ClientBuilder builder = ClientBuilder.newBuilder().withConfig(new _ClientConfigSupplier().get());
            builder.sslContext(new _SSLContextSupplier().get())
                    .hostnameVerifier(new _HostnameVerifierSupplier().get());
            _ClientSupplier.client = builder.build();
        }
    }

    @Override
    public Client get() {
        return _ClientSupplier.client;
    }

}
