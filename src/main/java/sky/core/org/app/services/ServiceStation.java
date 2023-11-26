package sky.core.org.app.services;

import sky.core.org.app.Transport;

public class ServiceStation implements Service {

    public void check(Transport transport) {
        transport.service(transport);
    }

}
