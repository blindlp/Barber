package gt.com.irc.barber.splash.DI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import gt.com.irc.barber.lib.base.EventBus;
import gt.com.irc.barber.splash.SplashModel;
import gt.com.irc.barber.splash.SplashModelImpl;
import gt.com.irc.barber.splash.SplashPresenter;
import gt.com.irc.barber.splash.SplashPresenterImpl;
import gt.com.irc.barber.splash.SplashView;


@Module
public class SplashModule {

    private SplashView view;

    public SplashModule(SplashView view) {
        this.view = view;
    }

    @Provides
    @Singleton
    SplashView providesSplashView() {
        return this.view;
    }

    @Provides
    @Singleton
    SplashModel providesSlashModel(EventBus bus) {
        return new SplashModelImpl(bus);
    }

    @Provides
    @Singleton
    SplashPresenter providesSplashPresenter(SplashModel splashModel, SplashView view, EventBus bus) {
        return new SplashPresenterImpl(splashModel,view,bus);
    }

}
