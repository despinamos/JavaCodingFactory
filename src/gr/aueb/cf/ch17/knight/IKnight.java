package gr.aueb.cf.ch17.knight;

public interface IKnight {

    IMission[] missions = {
        new KillTheDragonMission(),
        new SaveThePrincessMission(),
        new KillTheDragonMission()
    };

    void embarkOnMission(IMission mission);
}
