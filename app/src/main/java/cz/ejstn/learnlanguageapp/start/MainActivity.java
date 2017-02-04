package cz.ejstn.learnlanguageapp.start;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import cz.ejstn.learnlanguageapp.R;
import cz.ejstn.learnlanguageapp.adaptery.KategorieFragmentAdapter;

public class MainActivity extends AppCompatActivity {

    // TODO: 4.2.2017 zkusit vymyslet ještě nějaký testíky, co by ulehčili život :D

    // TODO: 4.2.2017 regnout se na feeriu

    // TODO: 4.2.2017 přidat funkci sdílení aplikace
    // TODO: 4.2.2017 přidat funkci hodnocení aplikace
    // TODO: 4.2.2017 přidat funkci poslání feedbacku
    // TODO: 5.2.2017 přidat aktivitu s infem do navigation draweru

    // TODO: 4.2.2017 trošku si uspořádat ty poznámky, ať to není takovej šit

    // TODO: 4.2.2017 rychleji vypnout zvuk při přesvajpnutí fragmentu - asi to bude nějaký onCallback ve fragmentu

    // TODO: 4.2.2017 feature - že ty fragmenty budou po každém spustění aplikace v různém pořadí

    // TODO: 3.2.2017 přidat vnuka a vnučku - obrázky - zase ty velikosti atd

    // TODO: 3.2.2017 menší velikost obrázků - myšleno jako kilobajty, ne rozlišení?

    // TODO: 3.2.2017 rozmyslet u toho volnýho času jestli tam dávat watching tv nebo watch tv

    // TODO: 4.2.2017 přidat takový to velký menu, který se rozvine z tlačítka vlevo nahoře - navigation drawer

    // TODO: 4.2.2017 udělat nejdřív sample aplikaci s tím navigation drawer


    // TODO: 4.2.2017 nějak potunit ty barvy v pozadí toho překladu - jak tam jsou ty čtyři, chtělo by jich to víc, nebo třeba randomizovaný - udělat na to lib třídu a pokaždý to randomizovat


    // TODO: 4.2.2017 slovíčka se šuflujou vždycky když dojde pamět - možná by se měli šuflovat jen jednou při spuštění aplikace

    // TODO: 5.2.2017 šli by udělat ty scrollbary bílý místo černý?

    // TODO: 31.1.2017 dodat výslovnost ke všemu
    // TODO: 31.1.2017 poladit apptheme

    // TODO: 3.2.2017 když něco pustím - změní se ikona na play, když pauznu, změní se na play - odpovídá tomu i to přehrání

    // TODO: 31.1.2017 předělat všechno v kategorii barvy na materiální barvy a dodat jich tam pár navíc


    // TODO: 30.1.2017 emoji art chtějí na ně odkaz viz http://emojione.com/licensing/
    // TODO: 31.1.2017 udělat právě nějakou info aktivitu, kde bude ten emoji odkaz a třeba
    // TODO: 31.1.2017 třeba tlačítko na poslání feedbacku

    // TODO: 31.1.2017 layout a úpravy pro tablety - tam je to hlavně malý, takže udělat verzi layoutů pro tablety

    // TODO: 1.2.2017 upravit si nějak vnitřne ty slovíčka - rozdělit jídlo třeba na jídlo a pití, sladké slané atd

    // TODO: 4.2.2017 launcher icon

    // TODO: 4.2.2017 nějakej rozsáhlejší refaktoring celý aplikace - styly, barvy, layouty, názvy, metody, uhlazení, komentáře

    // TODO: 4.2.2017 přidat funkci testování

    // TODO: 4.2.2017 přidat fuknci změna barevného tématu aplikace

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);

        KategorieFragmentAdapter adapter = new KategorieFragmentAdapter(getSupportFragmentManager(), this);

        viewPager.setAdapter(adapter);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }



}
