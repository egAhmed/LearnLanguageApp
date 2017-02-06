package cz.ejstn.learnlanguageapp.start;

import android.content.Intent;
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
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "Anglická slovíčka - aplikace na Google Play");
                    String obsahZpravy = "Vyzkoušej tuto aplikaci na výuku anglických slovíček pro začátečníky: "
                            + "https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName();
                    Log.i("drawermenu", obsahZpravy);
                    i.putExtra(Intent.EXTRA_TEXT, obsahZpravy);
                    if (i.resolveActivity(getPackageManager()) != null) {
                        startActivity(Intent.createChooser(i, "Sdílet"));
                    } else {
                        Toast.makeText(MainActivity.this, "chyba, aplikace nejde sdílet", Toast.LENGTH_SHORT).show();
                    }
                    return true;

                case R.id.hodnotitaplikaci :
                    // TODO: 6.2.2017 dodělat
                    return true;
                case R.id.poslatfeedback :
                    // TODO: 6.2.2017 dodělat
                    return true;

                case R.id.zobrazitinfo:
                    Intent in = new Intent(MainActivity.this, InfoActivity.class);
                    startActivity(in);
                    return true;

                default:
                    return true;
            }
        }
    };

    // TODO: 6.2.2017 nezavírat úplně aplikaci, když je otevřenej drawer

    // TODO: 5.2.2017 bug s tou play ikonkou - asi to způsobuje ten listview, nevím proč

    // TODO: 5.2.2017 znovu přegenerovat přidané obrázky v kat. Příroda - filtr v průzkumníku podle data

    // TODO: 4.2.2017 zkusit vymyslet ještě nějaký testíky, co by ulehčili život :D


    // TODO: 5.2.2017 udělat tu změnu ikony novým vláknem a délkou songu ???


    // TODO: 4.2.2017 přidat funkci sdílení aplikace
    // TODO: 4.2.2017 přidat funkci hodnocení aplikace
    // TODO: 4.2.2017 přidat funkci poslání feedbacku
    // TODO: 5.2.2017 přidat aktivitu s infem do navigation draweru

    // TODO: 4.2.2017 trošku si uspořádat ty poznámky - word, ať to není takovej šit

    // TODO: 4.2.2017 rychleji vypnout zvuk při přesvajpnutí fragmentu - asi to bude nějaký onCallback ve fragmentu

    // TODO: 4.2.2017 feature - že ty fragmenty budou po každém spustění aplikace v různém pořadí

    // TODO: 3.2.2017 přidat vnuka a vnučku - obrázky - zase ty velikosti atd

    // TODO: 3.2.2017 menší velikost obrázků - myšleno jako kilobajty, ne rozlišení?

    // TODO: 4.2.2017 přidat takový to velký menu, který se rozvine z tlačítka vlevo nahoře - navigation drawer

    // TODO: 4.2.2017 udělat nejdřív sample aplikaci s tím navigation drawer



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
