package gt.com.irc.barber.main.DI;

import javax.inject.Singleton;

import dagger.Component;
import gt.com.irc.barber.AppModule;
import gt.com.irc.barber.lib.DI.LibModule;
import gt.com.irc.barber.main.MainActivity;

@Singleton
@Component(modules = {AppModule.class, LibModule.class, MainModule.class})

public interface MainComponent {
    void inject(MainActivity mainActivity);
}
