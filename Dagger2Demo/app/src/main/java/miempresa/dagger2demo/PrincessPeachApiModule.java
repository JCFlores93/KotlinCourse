package miempresa.dagger2demo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by USUARIO on 22/07/2017.
 */

@Module
public class PrincessPeachApiModule {

@Provides
@Singleton
PrincessPeachApi providesPeachApi(){
        return new PrincessPeachApi();
    }
}
