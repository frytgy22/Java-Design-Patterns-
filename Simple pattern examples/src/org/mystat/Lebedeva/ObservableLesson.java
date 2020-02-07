package org.mystat.Lebedeva;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class ObservableLesson {//наблюдаемый
    public static void main(String[] args) {
        System.out.println("Enter text: ");
        EventSource eventSource=new EventSource();
        eventSource.addObserver((o, arg) -> System.out.println("Received response: "+arg));
        new Thread(eventSource).start();
    }
}
class EventSource extends Observable implements Runnable{

    @Override
    public void run() {
        while (true){
            String response=new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}