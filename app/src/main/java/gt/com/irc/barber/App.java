package gt.com.irc.barber;

import android.app.Application;

import gt.com.irc.barber.lib.DI.DaggerLibComponent;
import gt.com.irc.barber.lib.DI.LibModule;
import gt.com.irc.barber.main.DI.DaggerMainComponent;
import gt.com.irc.barber.main.DI.MainComponent;
import gt.com.irc.barber.main.DI.MainModule;
import gt.com.irc.barber.main.MainView;
import gt.com.irc.barber.splash.DI.DaggerSplashComponent;
import gt.com.irc.barber.splash.DI.SplashComponent;
import gt.com.irc.barber.splash.DI.SplashModule;
import gt.com.irc.barber.splash.SplashView;

public class App extends Application {

    AppModule appModule = new AppModule(this);
    LibModule libModule = new LibModule();

    public SplashComponent splashComponent(SplashView view) {
        return DaggerSplashComponent.builder()
                .appModule(appModule)
                .libModule(libModule)
                .splashModule(new SplashModule(view))
                .build();
    }

    public MainComponent mainComponent(MainView view) {
        return DaggerMainComponent.builder()
                .appModule( appModule )
                .libModule( libModule )
                .mainModule( new MainModule( view ) )
                .build();
    }


}
