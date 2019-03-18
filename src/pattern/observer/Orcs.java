package pattern.observer;

public class Orcs implements WeatherObserver{

    @Override
    public void update(WeatherType type) {
        switch (type){
            case SUNNY:
                System.out.println("SUNNY");
                break;
            case RAINY:
                System.out.println("RAINY");
                break;
            case WINDY:
                System.out.println("WINDY");
                break;
            case COLD:
                System.out.println("COLD");
                break;
            default:
                break;
        }
    }
}
