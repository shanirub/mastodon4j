package mastodon4j.internal;

import mastodon4j.entity.Status;
import mastodon4j.streaming.HashtagStream;
import mastodon4j.streaming.HashtagStreamListener;
import org.glassfish.jersey.media.sse.EventSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author hecateball
 */
final class _HashtagStream implements HashtagStream {

    private static final Logger LOGGER = LoggerFactory.getLogger(_HashtagStream.class);

    private final EventSource eventSource;

    public _HashtagStream(EventSource eventSource) {
        this.eventSource = eventSource;
    }

    @Override
    public HashtagStream register(HashtagStreamListener listener) {
        this.eventSource.register(event -> {
            switch (event.getName()) {
                case "update":
                    listener.onUpdate(event.readData(Status.class));
                    break;
                case "notification":
                    // Hashtag stream might not receive notification
                    break;
                case "delete":
                    listener.onDelete(event.readData(Long.class));
                    break;
                default:
                    LOGGER.trace("Unexpected event name: {}", event.getName());
            }
        });
        return this;
    }

    @Override
    public void open() {
        if (!this.eventSource.isOpen()) {
            this.eventSource.open();
        }
    }

    @Override
    public void close() {
        if (this.eventSource.isOpen()) {
            this.eventSource.close();
        }
    }

}
