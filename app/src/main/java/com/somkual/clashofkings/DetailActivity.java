package com.somkual.clashofkings;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initData();


    }

    private void initData() {
        String[] imageArray  = new String[]{"banner","troops","equipment","lord", "alliance","banner"};
        String[] descArray = new String[]{"There are buildings you can build in the Clash of Kings. If you just start playing the game, you should pay attention to upgrading your castle. You are at risk of being attacked at this stage, so you must use a lot of resources to strengthen your defense. In case your protection falls and your castle is on fire, the quickest way to build and restore is to use the teleport function. Another important building is your farm, which is your primary source of food and income. Each time you increase the number of your troops, you need to upgrade your farm so that it can produce enough food for your troops. What you should always remember to build a new building should be a balance between the resources you receive. You cannot put too many resources in the same building without paying attention to others because if you do, you risk attacking",
                "Before you even learn the type of soldier you have and the specific abilities you have to fix it, the best thing is you. Having a foot soldier working in a stationary position, it would be a bad idea to use it other because it is too slow and easy to die. Speaking of other things, Archers can attack without dying because of their ability. To be in a safe distance, this is especially true. You may find that your army is genuine and no one can find your army. What is left to protect your castles?\n",
                "If there is no upgrading your troops equipment, your troops will die easily and defeat very easily. This is why you should collect metal materials and alloy materials whenever you can. Mithril mines and iron mines are usually rich in materials like jade, garnet, crystals, bronze, cobalt and amber. Always keep an eye on these materials. Another easy way to accumulate metal material is to hunt and kill monsters. For every monster you kill, you get a similar mineral in the level of the monster you kill. The more monsters you kill, the more material you have to use to upgrade and improve your military performance.\n",
                "As the Lord of the Castle, you are responsible for bringing forces and people involved in the battle and building the empire. In order to advance fast, you must be as enthusiastic as possible. You can accomplish this by building buildings using consumables, upgrading buildings, exploring abandoned castles, and killing monsters. All these will increase to enhance your experience, which will make you eligible for bonuses such as weapons, helmets, boots, rings and chest pads. The general rule when doing your duty as Lord is that you should not chew things you cannot swallow. For example, do not attack monsters. If you have 5 strengths, you lose your resources if you continually go with the army and the monsters are way stronger than you.\n",
                "Creating and joining an affiliate can be very easy. But you have to be careful and choose your friend wisely. First, you should become a partner who communicates the same language as you. Imagine being in partnership with Chinese or Greek speakers and you cannot understand that language. It will be serious for you and your partner because there will be no communication at all. As we mentioned earlier, players of the game come from all over the world. That said, no matter how you make a partner or join one, make sure everyone understands each other. And do not be an affiliate so you can take advantage of Super Mine. You have to be fair and play as a team member. Remember that if a partner falls, you will be severely damaged with your castle and kingdom.",
                "There are several ways to increase your chances of being a Clash of Kings leader. You must first have at least five farm accounts. Some of the best players in the game have more than 10 farm accounts. In short, how much is the account? After creating multiple accounts, you will need to join a partner that has proven to be strong in both war and defense. When joining a strong ally, you will be protected from attacks, looting and siege. This means you will have more time to gather resources, upgrade buildings, train your troops, and strengthen your walls. And of course, as long as you have a budget for it, try availing of the premium products at the game for sale. You can use these special things to attack other realms and control more wealth and resources.\n"
                };

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String title = bundle.getString("title");
            int mTag = Integer.parseInt(bundle.getString("mTag"));

            TextView titleTextView = (TextView) findViewById(R.id.title_textView);
            ImageView imageView = (ImageView) findViewById(R.id.imageView);
            MultiAutoCompleteTextView descTextView = (MultiAutoCompleteTextView)findViewById(R.id.desc);

            titleTextView.setText(title);
            Resources res = getResources();
            String mDrawableName = imageArray[mTag];
            int resID = res.getIdentifier(mDrawableName , "drawable", getPackageName());
            Drawable drawable = res.getDrawable(resID);
            imageView.setImageDrawable(drawable);
            descTextView.setText(descArray[mTag]);
        }


    }

}
