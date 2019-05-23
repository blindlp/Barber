package gt.com.irc.barber.lib.DI;


import android.app.Activity;
import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import gt.com.irc.barber.App;
import gt.com.irc.barber.adapters.ProductAdapter;
import gt.com.irc.barber.been.Products;
import gt.com.irc.barber.lib.GladeImageLoader;
import gt.com.irc.barber.lib.GreenRobotEventBus;
import gt.com.irc.barber.lib.base.ImageLoader;


@Module
public class LibModule {

    @Provides
    @Singleton
    EventBus providesGreenRobotEventBus() { // retornamos el default de EventBus
        return EventBus.getDefault();
    }

    @Provides
    @Singleton
    gt.com.irc.barber.lib.base.EventBus providesEventBus(EventBus bus) { // retornamos un nuevo EventBus
        return new GreenRobotEventBus(bus);
    }

    @Provides
    @Singleton
    RequestManager providesRequestManager(Context context) { // Provides requestManager
        return Glide.with(context);
    }

    @Provides
    @Singleton
    ImageLoader providesImageLoader(RequestManager requestManager) { // providesImage
        return new GladeImageLoader(requestManager);
    }


    @Provides
    @Singleton
    ProductAdapter providesProductAdapter(Activity activity, ArrayList<Products> itemList) {
        return new ProductAdapter( activity, itemList );
    }



}
