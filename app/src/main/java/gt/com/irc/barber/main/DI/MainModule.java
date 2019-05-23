package gt.com.irc.barber.main.DI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import gt.com.irc.barber.lib.base.EventBus;
import gt.com.irc.barber.main.MainModel;
import gt.com.irc.barber.main.MainModelImpl;
import gt.com.irc.barber.main.MainPresenter;
import gt.com.irc.barber.main.MainPresenterImpl;
import gt.com.irc.barber.main.MainView;

@Module
public class MainModule {

    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }


    @Provides
    @Singleton
    MainView providesMainView() {
        return this.view;
    }

    @Provides
    @Singleton
    MainModel providesMainModel(EventBus bus) {
        return new MainModelImpl( bus );
    }

    @Provides
    @Singleton
    MainPresenter providesMainPresenter(MainModel mainModel,MainView mainView,EventBus bus) {
        return new MainPresenterImpl( mainModel,mainView,bus );
    }

}
