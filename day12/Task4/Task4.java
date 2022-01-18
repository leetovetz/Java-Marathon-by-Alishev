package day12.Task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Tame impala ");
        members1.add("The Cure ");
        members1.add("The Beatles ");
        members1.add("NIRVANA ");
        members1.add("GUNS N' ROSES ");
        members1.add("Led zeppelin ");

        MusicBand band1 = new MusicBand("Queen", 2006, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("The rolling stones ");
        members2.add("Pink floyd ");
        members2.add("AC/DC ");
        members2.add("Rush ");

        MusicBand band2 = new MusicBand("Dio", 2006, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
