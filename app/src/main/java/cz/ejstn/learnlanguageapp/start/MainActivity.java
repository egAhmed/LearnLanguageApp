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
import android.widget.Toast;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adaptery.KategorieFragmentAdapter;
import cz.ejstn.learnlanguageapp.aktivity.InfoActivity;

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
                    // getApplicationContext().getPackageName());
                    // https://play.google.com/store/apps/details?id=cz.ejstn.coinflipmontecarlo
                    // TODO: 6.2.2017 dodělat
                    Uri uri = Uri.parse("market://details?id=" + getApplicationContext().getPackageName());
                    Intent hodnotitAplikaci = new Intent(Intent.ACTION_VIEW, uri);
                    // To count with Play market backstack, After pressing back button,
                    // to taken back to our application, we need to add following flags to intent.
                    hodnotitAplikaci.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                            // Intent.FLAG_ACTIVITY_NEW_DOCUMENT
                            Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                     /*int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
                    if (Build.VERSION.SDK_INT >= 21) {
                        flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
                    } else {
                        //noinspection deprecation
                        flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
                    }
                    hodnotitAplikaci.addFlags(flags); */
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


                case R.id.zobrazitinfo:
                    Intent zobrazitInfo = new Intent(MainActivity.this, InfoActivity.class);
                    startActivity(zobrazitInfo);
                    return true;

                default:
                    return true;
            }
        }
    };

    // TODO: 6.2.2017 nezavírat úplně aplikaci, když je otevřenej drawer

    // TODO: 5.2.2017 bug s tou play ikonkou - asi to způsobuje ten listview, nevím proč

    // TODO: 5.2.2017 znovu přegenerovat přidané obrázky v kat. Příroda - filtr v průzkumníku podle data

    // TODO: 4.2.2017 testík na ověření, že všechny obrázky mají ty různý verze


    // TODO: 5.2.2017 udělat tu změnu ikony novým vláknem a délkou songu ???

    // TODO: 7.2.2017 přegenerovat ikony - jsou 8 bitů - tak je taky generovat do 8bitů


    // TODO: 4.2.2017 trošku si uspořádat ty poznámky - word, ať to není takovej šit

    // TODO: 4.2.2017 rychleji vypnout zvuk při přesvajpnutí fragmentu - asi to bude nějaký onCallback ve fragmentu

    // TODO: 4.2.2017 feature - že ty fragmenty budou po každém spustění aplikace v různém pořadí

    // TODO: 3.2.2017 přidat vnuka a vnučku - obrázky - zase ty velikosti atd

    // TODO: 4.2.2017 slovíčka se šuflujou vždycky když dojde pamět - možná by se měli šuflovat jen jednou při spuštění aplikace

    // TODO: 5.2.2017 šli by udělat ty scrollbary bílý místo černý?

    // TODO: 31.1.2017 předělat všechno v kategorii barvy na materiální barvy a dodat jich tam pár navíc

    // TODO: 30.1.2017 emoji art chtějí na ně odkaz viz http://emojione.com/licensing/
    // TODO: 31.1.2017 udělat právě nějakou info aktivitu, kde bude ten emoji odkaz a třeba
    // TODO: 31.1.2017 třeba tlačítko na poslání feedbacku

    // TODO: 31.1.2017 layout a úpravy pro tablety - tam je to hlavně malý, takže udělat verzi layoutů pro tablety

    // TODO: 1.2.2017 upravit si nějak vnitřne ty slovíčka - rozdělit jídlo třeba na jídlo a pití, sladké slané atd

    // TODO: 4.2.2017 nějakej rozsáhlejší refaktoring celý aplikace - styly, barvy, layouty, názvy, metody, uhlazení, komentáře

    // TODO: 4.2.2017 přidat funkci testování - kvíz slovíček

    // TODO: 4.2.2017 přidat fuknci změna barevného tématu aplikace

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pripravNavigationDrawer();

        pripravTabLayout();

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


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mActonBarDrawerToggle.onOptionsItemSelected(item)) {
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
}
