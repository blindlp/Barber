package gt.com.irc.barber.splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import gt.com.irc.barber.App;
import gt.com.irc.barber.R;
import gt.com.irc.barber.lib.base.ImageLoader;
import gt.com.irc.barber.main.MainActivity;

public class SplashActivity extends AppCompatActivity implements SplashView{

    static final long SCREEN_DELAY = 3000;


    @Inject
    SplashPresenter presenter;

    @Inject
    ImageLoader imageLoader;


    @BindView(R.id.container)
    RelativeLayout relativeLayout;

    @BindView(R.id.banner)
    ImageView banner;

    private App app;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);

        app = (App) getApplication();
        init();

        presenter.onCreate();

        // capturamos cualquier evento de error para esconder la barra
        try {
            getSupportActionBar().hide();
        } catch (Exception e) {
            Log.e("ActionBarr", e.toString());
        }


        // declaramos el evento timer
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                Intent cambiar = new Intent(app, MainActivity.class);
                startActivity(cambiar);
                finish();
            }
        }, SCREEN_DELAY);

        imageLoader.load(banner,"http://ircsa.net/barbaros.png");


    }


    private void init() {

        app.splashComponent(this).inject(this);

    }

    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    @Override
    public void showError(String error) {
        // TODO definir implementacion
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String message) {
        // TODO definir implementacion
    }
}
