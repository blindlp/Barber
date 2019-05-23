package gt.com.irc.barber.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import gt.com.irc.barber.R;
import gt.com.irc.barber.been.Products;

public class ProductAdapter extends ArrayAdapter<Products>  {


    private ProductAdapter productAdapter;
    private Activity activity;
    private ArrayList<Products> itemList;

    public ProductAdapter(Activity activity, ArrayList<Products> itemList) {
        super(activity,0, itemList);
    }

    public ProductAdapter(Context context, ArrayList<Products> itemList) {
        super(context, 0, itemList);
    }


    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void setItemList(ArrayList<Products> itemList) {
        this.itemList = itemList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemProducts = convertView;

        // agregamos el primer item si no existe
        if (listItemProducts == null) {
            listItemProducts = LayoutInflater.from(getContext()).inflate(R.layout.content_main, parent, false);
        }

        // buscamos el primer item


        Products products = getItem(position);

        TextView itemNombre = listItemProducts.findViewById(R.id.itemText);
        TextView itemPrecio = listItemProducts.findViewById(R.id.itemPrice);
        ImageView itemImage = listItemProducts.findViewById(R.id.itemImage);
        TextView itemTiempo = listItemProducts.findViewById(R.id.itemTiempo);


        itemNombre.setText(products.getNombre());
        itemPrecio.setText(getContext().getResources().getString(R.string.moneda) + " " + String.format("%.2f", products.getPrecio()));
        itemImage.setImageResource(products.getImage());
        itemTiempo.setText(getContext().getResources().getString(R.string.tiemp) + " " + Integer.toString(products.getTiempo()) + " " + getContext().getResources().getString(R.string.dimension));


        return listItemProducts;
    }





}
