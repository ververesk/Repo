package Sleep;



public class TimeInLondon {
    public static volatile boolean isStopped=false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock=new Clock("London", 23,59,57);
        clock.start();
        Thread.sleep(4000);
        isStopped=true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        String cityName;
        int hours;
        int minutes;
        int seconds;


        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;

        }

        public void run() {
         try {
            while (!isStopped) {
                printTime();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }

        public void printTime() throws InterruptedException  {

seconds++;
if (seconds>59) {
    seconds=0;
    minutes++;
}
if (minutes>59) {
    minutes=0;
    hours++;
} if (hours==24) {
    hours=0;

            }
            Thread.sleep(1000);
            if(hours==0 && minutes==0 && seconds==0) {
                System.out.println(String.format("В г. %s сейчас полночь!", cityName));
            } else {
                System.out.println(String.format("В г. %s сейчас %d:%d:%d!", cityName, hours, minutes, seconds));
            }
        }

    }
}
