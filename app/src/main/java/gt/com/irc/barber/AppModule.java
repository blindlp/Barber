package gt.com.irc.barber;


import android.app.Application;
import android.content.Context;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import gt.com.irc.barber.been.Products;

@Module
public class AppModule {

    private App app;
    public static ArrayList<Products> products = new ArrayList<Products>();

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return this.app;
    }

    // aqui trasladamos la funcionalaidad del activity para que sea utilizado en cualquier lugar
    @Provides
    @Singleton
    Context providesContext(Application application) {
        return application.getApplicationContext();
    }
}
