package gt.com.irc.barber.main;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import javax.inject.Inject;

import butterknife.BindView;
import gt.com.irc.barber.App;
import gt.com.irc.barber.AppModule;
import gt.com.irc.barber.R;
import gt.com.irc.barber.adapters.ProductAdapter;
import gt.com.irc.barber.been.Products;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, MainView {


    @Inject
    MainPresenter presenter;



    private App app;

    @BindView(R.id.products)
    ListView lvProducts;




    @Override
    public void showError(String error) {
        // TODO definir implementacion
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String message) {
        // TODO definir implementacion
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        app = (App) getApplication();
        init();

        presenter.onCreate();

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        lvProducts = findViewById(R.id.products);


        final ArrayList<Products> products = AppModule.products;
        // Creamos el adapter
        final ProductAdapter productAdapter = new ProductAdapter( this,products);


      //  productAdapter.clear();

        // creamos nuestros objetos productos
        products.add(new Products("Alineado de Barba",75.00,R.drawable.ic_menu_send,35));



        lvProducts.setAdapter(productAdapter);



    }

    private void init() {
        app.mainComponent( this ).inject( this );

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
