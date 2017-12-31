package miempresa.dagger2demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by USUARIO on 22/07/2017.
 */
@Singleton
@Component(modules = {PrincessPeachApiModule.class})
public interface PrincessPeachComponent {

    void inject(PrincessPeachActivity princessPeachActivity);
}
