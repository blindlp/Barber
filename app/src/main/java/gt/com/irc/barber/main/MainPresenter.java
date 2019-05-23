package gt.com.irc.barber.main;

import gt.com.irc.barber.Event;

public interface MainPresenter {
    // TODO implementar Presenter
    void onCreate();
    void onDestroy();
    void onEvent(Event event);
}
