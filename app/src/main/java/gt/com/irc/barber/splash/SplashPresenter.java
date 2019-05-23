package gt.com.irc.barber.splash;

import gt.com.irc.barber.Event;

public interface SplashPresenter {
    void onCreate();
    void onDestroy();
    void onEvent(Event event);

}
