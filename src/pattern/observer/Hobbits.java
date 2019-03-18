package pattern.observer;

public class Hobbits implements WeatherObserver{

    @Override
    public void update(WeatherType type) {
        switch (type){
            case SUNNY:
                System.out.println("hobbits SUNNY");
                break;
            case RAINY:
                System.out.println("hobbits RAINY");
                break;
            case WINDY:
                System.out.println("hobbits WINDY");
                break;
            case COLD:
                System.out.println("hobbits COLD");
                break;
            default:
                break;
        }
    }
}
