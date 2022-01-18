package day12.Task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Tame impala", 2000);
        MusicBand band2 = new MusicBand("The Cure", 2001);
        MusicBand band3 = new MusicBand("The Beatles", 2002);
        MusicBand band4 = new MusicBand("NIRVANA", 2003);
        MusicBand band5 = new MusicBand("GUNS N' ROSES", 2004);
        MusicBand band6 = new MusicBand("Led zeppelin", 2005);
        MusicBand band7 = new MusicBand("Queen", 2006);
        MusicBand band8 = new MusicBand("The rolling stones", 2007);
        MusicBand band9 = new MusicBand("Pink floyd", 2008);
        MusicBand band10 = new MusicBand("AC/DC", 2009);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands);
        System.out.println(musicBands);

        List<MusicBand> musicBands1 = new ArrayList<>();

        for (MusicBand band : musicBands) {
            if (band.getYear() > 2005)
                musicBands1.add(band);
        }

        System.out.println(musicBands1);
    }
}
