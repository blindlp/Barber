package gt.com.irc.barber.lib.base;

import android.app.Activity;

import java.util.ArrayList;

import gt.com.irc.barber.been.Products;

public interface ProductAdapter {
    void load(Activity activity, ArrayList<Products> itemList);
}
