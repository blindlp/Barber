package gt.com.irc.barber.splash;

import gt.com.irc.barber.lib.base.EventBus;

public class SplashModelImpl implements SplashModel {

    private EventBus bus;

    public SplashModelImpl(EventBus bus) {
        this.bus = bus;
    }
}
