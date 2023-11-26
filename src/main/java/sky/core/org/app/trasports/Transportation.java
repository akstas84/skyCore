package sky.core.org.app.trasports;

import sky.core.org.app.services.Service;

public interface Transportation extends Service {
    void updateTyre();

    void checkEngine();

    void checkTrailer();

}
