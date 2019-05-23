package gt.com.irc.barber.splash;

import org.greenrobot.eventbus.Subscribe;

import gt.com.irc.barber.Event;
import gt.com.irc.barber.lib.base.EventBus;

public class SplashPresenterImpl implements SplashPresenter {


    // Variables
    private SplashModel splashModel;
    private SplashView splashView;
    private EventBus bus;

    // Contructor
    public SplashPresenterImpl(SplashModel splashModel, SplashView splashView, EventBus bus) {
        this.splashModel = splashModel;
        this.splashView = splashView;
        this.bus = bus;
    }



    @Override
    public void onCreate() {
        this.bus.register(this);
    }

    @Override
    public void onDestroy() {
        this.bus.unRegister(this);
    }

    @Override
    @Subscribe
    public void onEvent(Event event) {
        //TODO definir Implementacion de Event
    }
}
