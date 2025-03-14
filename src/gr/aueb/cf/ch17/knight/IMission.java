package gr.aueb.cf.ch17.knight;

public interface IMission {

    public MissionStatus getStatus();
    public void setStatus(MissionStatus missionStatus);
    public void embark();
}
