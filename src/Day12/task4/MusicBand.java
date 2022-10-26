package Day12.task4;

import java.util.ArrayList;
import java.util.Collections;
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
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> list) {
        List<MusicBand> list1 = new ArrayList<>();
        for (MusicBand m : list) {
            if (m.getYear() >= 2000) {
                list1.add(m);
            }
        }
        return list1;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        for (String a : musicBand1.getMembers()) {
            musicBand2.getMembers().add(a);
        }
        musicBand1.getMembers().clear();

    }

    public void printMembers() {
        System.out.println(this.members);

    }

}

class TestMusicBand {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Jhon Simon");
        members1.add("Brian Kozlak");
        members1.add("Jimmy Mik");
        members1.add("Oliv Grij");
        members1.add("Vikj Brikl");
        MusicBand musicBand1 = new MusicBand("Ace of Base", 1990, members1);
        List<String> members2 = new ArrayList<>();
        members1.add("Steven Tyler");
        members1.add("Joseph Perry");
        members1.add("William Hamilton");
        members1.add("Michael Kramer");
        members1.add("Ernest Whitford");
        MusicBand musicBand2 = new MusicBand("Aerosmith", 1970, members2);
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}

