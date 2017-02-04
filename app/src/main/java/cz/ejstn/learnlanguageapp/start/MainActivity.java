package cz.ejstn.learnlanguageapp.start;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adapter.KategorieFragmentPagerAdapter;

public class MainActivity extends AppCompatActivity {

    // TODO: 4.2.2017 rychleji vypnout zvuk při přesvajpnutí fragmentu - asi to bude nějaký onCallback ve fragmentu

    // TODO: 4.2.2017 feature - že ty fragmenty budou po každém spustění aplikace v různém pořadí

    // TODO: 3.2.2017 přidat vnuka a vnučku - obrázky - zase ty velikosti atd

    // TODO: 3.2.2017 menší velikost obrázků - myšleno jako kilobajty, ne rozlišení?

    // TODO: 3.2.2017 rozmyslet u toho volnýho času jestli tam dávat watching tv nebo watch tv

    // TODO: 4.2.2017 vytvořit tab layout

    // TODO: 4.2.2017 nějak potunit ty barvy v pozadí toho překladu - jak tam jsou ty čtyři, chtělo by jich to víc, nebo třeba randomizovaný - udělat na to lib třídu a pokaždý to randomizovat


    // TODO: 4.2.2017 slovíčka se šuflujou vždycky když dojde pamět - možná by se měli šuflovat jen jednou při spuštění aplikace


    // TODO: 31.1.2017 dodat výslovnost ke všemu
    // TODO: 31.1.2017 poladit apptheme
    // TODO: 31.1.2017 doladit design mainactivity 

    // TODO: 3.2.2017 když něco pustím - změní se ikona na play, když pauznu, změní se na play - odpovídá tomu i to přehrání

    // TODO: 31.1.2017 předělat všechno v kategorii barvy na materiální barvy a dodat jich tam pár navíc


    // TODO: 30.1.2017 emoji art chtějí na ně odkaz viz http://emojione.com/licensing/
    // TODO: 31.1.2017 udělat právě nějakou info aktivitu, kde bude ten emoji odkaz a třeba
    // TODO: 31.1.2017 třeba tlačítko na poslání feedbacku

    // TODO: 31.1.2017 layout a úpravy pro tablety - tam je to hlavně malý, takže udělat verzi layoutů pro tablety

    // TODO: 1.2.2017 upravit si nějak vnitřne ty slovíčka - rozdělit jídlo třeba na jídlo a pití, sladké slané atd

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        KategorieFragmentPagerAdapter adapter = new KategorieFragmentPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);



    }



}
