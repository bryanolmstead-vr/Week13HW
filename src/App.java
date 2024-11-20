interface Instrument {
    void play();
}

class Wind implements Instrument {
    public void play() {
        System.out.println("Wind");
    }
}

class Percussion implements Instrument {
    public void play() {
        System.out.println("Percussion");
    }
}

class Stringed implements Instrument {
    public void play() {
        System.out.println("Stringed");
    }
}

class Woodwind extends Wind {
    @Override
    public void play() {
        System.out.println("Woodwind");
    }
}

class Brass extends Wind {
    @Override
    public void play() {
        System.out.println("Brass");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Instrument[] orchestra = {
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };

        for (Instrument i : orchestra) {
            i.play();
        }
    }
}
