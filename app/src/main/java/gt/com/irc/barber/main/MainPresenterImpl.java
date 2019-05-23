package gt.com.irc.barber.main;

import org.greenrobot.eventbus.Subscribe;
import gt.com.irc.barber.Event;
import gt.com.irc.barber.lib.base.EventBus;

public class MainPresenterImpl implements MainPresenter {

    // Variables
    private MainModel mainModel;
    private MainView mainView;
    private EventBus bus;


    public MainPresenterImpl(MainModel mainModel, MainView mainView, EventBus bus) {
        this.mainModel = mainModel;
        this.mainView = mainView;
        this.bus = bus;
    }

    @Override
    public void onCreate() {
        this.bus.register( this );

    }

    @Override
    public void onDestroy() {
        this.bus.unRegister( this );
    }

    @Override
    @Subscribe
    public void onEvent(Event event) {
        //TODO pendiente de definir
    }
}
