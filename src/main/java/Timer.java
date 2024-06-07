public class Timer implements Runnable{


    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while (true){
            long elapsedTime = System.currentTimeMillis() - startTime;
            long elapsedSeconds = elapsedTime / 1000;
            long secondsDisplay = elapsedSeconds % 60;
            long elapsedMinutes = elapsedSeconds / 60;
            System.out.printf("%02d:%02d%n", elapsedMinutes, secondsDisplay);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
