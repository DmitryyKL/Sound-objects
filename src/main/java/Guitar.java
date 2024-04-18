public class Guitar implements Sounding{

    private String name;
    private int year;
    private boolean acousticGuitar;

    public Guitar(String name, int year, boolean acousticGuitar) {
        this.name = name;
        this.year = year;
        this.acousticGuitar = acousticGuitar;
    }

    @Override
    public void sound() {
        if (acousticGuitar) {
            System.out.printf("Гитара %s %s года выпуска %s.\nПослушай ее звук.\nДрынь, дырынь, дрынь.\n", name, year, acousticGuitar ? "акустическая" : "бассовая");
        } else {
            System.out.printf("Гитара %s %s года выпуска %s.\nПослушай ее звук.\nБррр, др, бр.\n", name, year, acousticGuitar ? "акустическая" : "бассовая");
        }
    }
}
