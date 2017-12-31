package miempresa.dagger2demo;

import android.app.Application;

/**
 * Created by USUARIO on 22/07/2017.
 */

public class PrincessPeachApplication extends Application{

    private PrincessPeachComponent princessPeachComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector(){
        princessPeachComponent = DaggerPrincessPeachComponent.builder()
                .princessPeachApiModule(new PrincessPeachApiModule()).build();
    }
    public PrincessPeachComponent getPrincessPeachComponent(){
        return princessPeachComponent;
    }
}
