package gt.com.irc.barber.main;

import gt.com.irc.barber.lib.base.EventBus;

public class MainModelImpl implements MainModel {

    private EventBus bus;

    public MainModelImpl(EventBus bus) {
        this.bus = bus;
    }
}
