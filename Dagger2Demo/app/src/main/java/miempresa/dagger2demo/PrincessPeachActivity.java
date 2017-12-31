package miempresa.dagger2demo;

import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import javax.inject.Inject;

public class PrincessPeachActivity extends AppCompatActivity {

    @Inject PrincessPeachApi princessPeachApi;
    TextView peachLabel;
    ImageView peachImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        peachLabel = (TextView) findViewById(R.id.label_peach);
        peachImage = (ImageView) findViewById(R.id.picture_peach);
        initializeDagger();
        PrincessPeach princessPeach = getPrincesPeachFromApi();
        renderPrincesPeach(princessPeach);
    }

    private void renderPrincesPeach(PrincessPeach princessPeach) {
        renderName(princessPeach.getName());
        renderPicture(princessPeach.getPhoto());
    }

    private void renderName(@StringRes int name) {
        peachLabel.setText(name);
    }

    private void renderPicture(@DrawableRes int picture) {
        peachImage.setImageDrawable(ContextCompat.getDrawable(this, picture));
    }

    private PrincessPeach getPrincesPeachFromApi() {
        return princessPeachApi.getPrincessPeach();
    }

    private void initializeDagger(){
        PrincessPeachApplication application = (PrincessPeachApplication) getApplication();
        application.getPrincessPeachComponent().inject(this);
    }







}
