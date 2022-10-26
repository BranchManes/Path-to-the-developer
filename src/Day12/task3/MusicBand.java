package Day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
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
}

class TestMusicBand {
    public static void main(String[] args) {
        List<MusicBand> list = new ArrayList<>();
        list.add(new MusicBand("Ace of Base", 1990));
        list.add(new MusicBand("Aerosmith", 1970));
        list.add((new MusicBand("Brooke Hogan", 2005)));
        list.add(new MusicBand("Chris Rea", 2010));
        list.add(new MusicBand("Eric Hutchinson", 1995));
        list.add(new MusicBand("Ginuwine", 2003));
        list.add(new MusicBand("G-Style", 2007));
        list.add(new MusicBand("Mandy Moore", 2006));
        list.add(new MusicBand("Moby", 1997));
        list.add(new MusicBand("Sammie", 2005));
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("Список групп основанных после 2000 года: ");
        System.out.println(MusicBand.groupsAfter2000(list));


    }
}
