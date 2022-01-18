package day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{" +
                "'" + name + '\'' +
                ", " + year +
                '}';
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        for (String member : a.getMembers())
            b.getMembers().add(member);
        a.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }
}
