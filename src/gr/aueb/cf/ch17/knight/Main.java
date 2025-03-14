package gr.aueb.cf.ch17.knight;

public class Main {
    public static void main(String[] args) {
//        Knight joan = new Knight();
//        Knight saintGeorge = new Knight();

//        joan.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                System.out.println("Save the princess");
//            }
//        });

//        saintGeorge.embarkOnMission(new IMission() {
//            @Override
//            public void embark() {
//                //System.out.println("Kill the dragon");
//                killTheDragon();
//            }
//        });

//        saintGeorge.embarkOnMission(() -> killTheDragon());
//
//        saintGeorge.embarkOnMission(Main::killTheDragon);
//        joan.embarkOnMission(Main::saveThePricess);
    }

    public static void killTheDragon() {
        System.out.println("Kill the dragon");
    }

    public static void saveThePricess() {
        System.out.println("Save the princess");
    }
}
