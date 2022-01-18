package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Smit", 50));
        members1.add(new MusicArtist("Alex", 52));
        members1.add(new MusicArtist("Serge", 33));
        members1.add(new MusicArtist("Alee", 12));
        members1.add(new MusicArtist("Tim", 53));
        members1.add(new MusicArtist("Tom", 30));

        MusicBand band1 = new MusicBand("Airplane", 1956, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Smit2", 50));
        members2.add(new MusicArtist("Alex2", 52));
        members2.add(new MusicArtist("Serge2", 33));
        members2.add(new MusicArtist("Alee2", 12));
        members2.add(new MusicArtist("Tim2", 53));
        members2.add(new MusicArtist("Tom2", 30));

        MusicBand band2 = new MusicBand("Neo", 1999, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();

    }
}
