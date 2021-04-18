class Season {
    public static Season SPRING = new Season("spring", "春暖花开");
    public static Season SUMMER = new Season("summer", "夏日炎炎");
    public static Season AUTUMN = new Season("autumn", "秋高气爽");
    public static Season WINTER = new Season("winter", "天寒地冻");

    private final String seasonName;
    private final String seasonDes;

    private Season(String name, String des) {
        this.seasonName = name;
        this.seasonDes = des;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDes() {
        return seasonDes;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDes='" + seasonDes + '\'' +
                '}';
    }
}

public class UseEnum {
    public static void main(String[] args) {
        System.out.println(Season.WINTER);
    }
}