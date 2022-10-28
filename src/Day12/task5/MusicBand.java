package Day12.task5;

import java.util.ArrayList;
import java.util.List;

class MusicArtist {
    private String nameArtist;
    private int age;

    public MusicArtist(String nameArtist, int age) {
        this.nameArtist = nameArtist;
        this.age = age;
    }

    public String getName() {
        return nameArtist;
    }

    public void setName(String name) {
        this.nameArtist = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "nameArtist='" + nameArtist + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
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
        for (MusicArtist a : musicBand1.getMembers()) {
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
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Jhon Simon", 30));
        members1.add(new MusicArtist("Brian Kozlak", 35));
        members1.add(new MusicArtist("Jimmy Mik", 33));
        members1.add(new MusicArtist("Oliv Grij", 31));
        members1.add(new MusicArtist("Vikj Brikl", 34));
        MusicBand musicBand1 = new MusicBand("Ace of Base", 1990, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members1.add(new MusicArtist("Steven Tyler", 70));
        members1.add(new MusicArtist("Joseph Perry", 73));
        members1.add(new MusicArtist("William Hamilton", 71));
        members1.add(new MusicArtist("Michael Kramer", 75));
        members1.add(new MusicArtist("Ernest Whitford", 76));
        MusicBand musicBand2 = new MusicBand("Aerosmith", 1970, members2);
        MusicBand.transferMembers(musicBand1, musicBand2);
        musicBand1.printMembers();
        musicBand2.printMembers();


    }
}

