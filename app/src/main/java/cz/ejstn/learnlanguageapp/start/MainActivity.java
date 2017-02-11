package cz.ejstn.learnlanguageapp.start;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adaptery.KategorieFragmentAdapter;
import cz.ejstn.learnlanguageapp.aktivity.InfoActivity;
import cz.ejstn.learnlanguageapp.helper.NavigationFunFactHelper;
import cz.ejstn.learnlanguageapp.model.FunFact;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mActonBarDrawerToggle;

    private NavigationView.OnNavigationItemSelectedListener listenerNavigationItemSelected = new NavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.sdiletAplikaci:
                    Log.i("drawermenu", "vybrano sdilet");
                    Intent sdiletAplikaci = new Intent(Intent.ACTION_SEND);
                    sdiletAplikaci.setType("text/plain");
                    sdiletAplikaci.putExtra(Intent.EXTRA_SUBJECT, "Anglická slovíčka - aplikace na Google Play");
                    String obsahZpravy = "Vyzkoušej tuto aplikaci na výuku anglických slovíček pro začátečníky: "
                            + "https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName();
                    Log.i("drawermenu", obsahZpravy);
                    sdiletAplikaci.putExtra(Intent.EXTRA_TEXT, obsahZpravy);
                    if (sdiletAplikaci.resolveActivity(getPackageManager()) != null) {
                        startActivity(Intent.createChooser(sdiletAplikaci, "Jak chcete sdílet aplikaci?"));
                    } else {
                        Toast.makeText(MainActivity.this, "chyba, aplikace nejde sdílet", Toast.LENGTH_SHORT).show();
                    }
                    return true;

                case R.id.hodnotitaplikaci:
                    Uri uri = Uri.parse("market://details?id=" + getApplicationContext().getPackageName());
                    Intent hodnotitAplikaci = new Intent(Intent.ACTION_VIEW, uri);
                    // ty flagy tam mají být, aby po se člověk po back buttonu v google play vrátil do aplikace, ale je to takový sketchy
                    hodnotitAplikaci.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            // Intent.FLAG_ACTIVITY_NEW_DOCUMENT
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                    try {
                        startActivity(hodnotitAplikaci);
                    } catch (ActivityNotFoundException e) {
                        startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())));
                    }
                    return true;

                case R.id.poslatfeedback:
                    Intent poslatFeedback = new Intent(Intent.ACTION_SENDTO);
                    poslatFeedback.setData(Uri.parse("mailto:"));
                    poslatFeedback.putExtra(Intent.EXTRA_EMAIL, new String[]{"ejstnn@gmail.com"});
                    poslatFeedback.putExtra(Intent.EXTRA_SUBJECT, "Anglická slovíčka - připomínka");
                    //poslatFeedback.putExtra(Intent.EXTRA_TEXT, "Write your stuff here:");
                    if (poslatFeedback.resolveActivity(getPackageManager()) != null) {
                        startActivity(Intent.createChooser(poslatFeedback, "Jak chcete poslat e-mail?"));
                    } else {
                        Toast.makeText(MainActivity.this, "Nemáte nainstalován žádný e-mailový klient", Toast.LENGTH_SHORT).show();
                    }
                    return true;


                case R.id.zobrazitInfo:
                    Intent zobrazitInfo = new Intent(MainActivity.this, InfoActivity.class);
                    startActivity(zobrazitInfo);
                    return true;

                default:
                    return true;
            }
        }
    };

    // udělat dneska odpoledne

    // TODO: 9.2.2017 zkusit optimalizovat výkon ? projít Java třídy a promyslet, jestli někde nedělám zbytečně objekty apod

    // odložím na později, na neurčito
    // TODO: 11.2.2017 zjistit jak to funguje s těmy dimnen pro různý velikosti apod
    // TODO: 11.2.2017 poladit ty dimen podle předchozího to do
    // TODO: 11.2.2017 až se mi bude chtít dodat tam ty chybějící výslovnosti - tak v audacity - MME -> WIN WASAPI -> a vybrat repráčky/sluchátka
    // TODO: 31.1.2017 layout a úpravy pro tablety - tam je to hlavně malý, takže udělat verzi layoutů pro tablety
    // TODO: 10.2.2017 schování actionbaru v závislosti na skrolování
    // TODO: 5.2.2017 šli by udělat ty scrollbary bílý místo černý?
    // TODO: 10.2.2017 očekovat cardview
    // TODO: 4.2.2017 slovíčka se šuflujou vždycky když dojde pamět - možná by se měli šuflovat jen jednou při spuštění aplikace
    // TODO: 4.2.2017 rychleji vypnout zvuk při přesvajpnutí fragmentu - asi to bude nějaký onCallback ve fragmentu
    // TODO: 4.2.2017 přidat funkci testování - kvíz slovíček
    // TODO: 4.2.2017 přidat fuknci změna barevného tématu aplikace
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pripravNavigationDrawer();

        pripravTabLayout();

        pripravNavigationHeader();

        Log.i("ac_lifecycle" , "on create");

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mActonBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {
        assert mDrawerLayout != null;
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    private void pripravTabLayout() {
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        KategorieFragmentAdapter adapter = new KategorieFragmentAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void pripravNavigationDrawer() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        mActonBarDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.otevrit, R.string.zavrit);
        mDrawerLayout.addDrawerListener(mActonBarDrawerToggle);
        mActonBarDrawerToggle.syncState();


        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);

        navigationView.setNavigationItemSelectedListener(listenerNavigationItemSelected);
    }

    private void pripravNavigationHeader() {
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        View header = navigationView.getHeaderView(0);

        ImageView obrazek = (ImageView) header.findViewById(R.id.obrazek_navigation_header);
        TextView funFactAnglicky = (TextView) header.findViewById(R.id.text_fun_fact_anglicky);
        TextView funFactCesky = (TextView) header.findViewById(R.id.text_fun_fact_cesky);

        FunFact fakt = NavigationFunFactHelper.vygenerujFunFact();

        obrazek.setImageResource(fakt.getObrazekFunFact());
        funFactAnglicky.setText(fakt.getTextFunFactAnglicky());
        funFactCesky.setText(fakt.getTextFunFactCesky());
    }


}