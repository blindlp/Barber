package gt.com.irc.barber.lib;

import gt.com.irc.barber.lib.base.EventBus;

public class GreenRobotEventBus implements EventBus {


    private org.greenrobot.eventbus.EventBus bus; // declaramos bus de GreenRobots libreria externa

    public GreenRobotEventBus(org.greenrobot.eventbus.EventBus bus) {
        this.bus = bus;
    }



    @Override
    public void register(Object sub) {
        bus.register(sub);
    }

    @Override
    public void unRegister(Object sub) {
        bus.unregister(sub);
    }

    @Override
    public void post(Object obj) {
        bus.post(obj);
    }
}
