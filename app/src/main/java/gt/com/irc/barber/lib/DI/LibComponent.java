package gt.com.irc.barber.lib.DI;

import javax.inject.Singleton;

import dagger.Component;
import gt.com.irc.barber.AppModule;

@Singleton
@Component(modules = {AppModule.class, LibModule.class})

public interface LibComponent {
}
