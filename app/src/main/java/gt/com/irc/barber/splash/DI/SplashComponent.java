package gt.com.irc.barber.splash.DI;

import javax.inject.Singleton;

import dagger.Component;
import gt.com.irc.barber.AppModule;
import gt.com.irc.barber.lib.DI.LibModule;
import gt.com.irc.barber.splash.SplashActivity;

@Singleton
@Component(modules = {AppModule.class, LibModule.class, SplashModule.class})

public interface SplashComponent {
    void inject(SplashActivity splashActivity);
}
