import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;

interface info {
    void show();
}

enum CustomSeason implements info {
    SPRING("spring", "春暖花开") {
        public void show() {
            System.out.println(this.getSeasonName());
        }
    },
    SUMMER("summer", "夏日炎炎") {
        public void show() {
            System.out.println(this.getSeasonName());
        }
    },
    AUTUMN("autumn", "秋高气爽") {
        public void show() {
            System.out.println(this.getSeasonName());
        }
    },
    WINTER("winter", "天寒地冻") {
        public void show() {
            System.out.println(this.getSeasonName());
        }
    };

    private final String seasonName;
    private final String seasonDes;

    private CustomSeason(String name, String des) {
        this.seasonName = name;
        this.seasonDes = des;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDes() {
        return seasonDes;
    }

//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDes='" + seasonDes + '\'' +
//                '}';
//    }
}

@MyAnnotation("unused")
public class CustomizedEnum {
    public static void main(String[] args) {
//        System.out.println(CustomSeason.SPRING);
//        System.out.println(CustomSeason.class.getSuperclass());
//        for (int i = 0 ; i < CustomSeason.values().length;i++) {
//            System.out.println(CustomSeason.values()[i].getSeasonDes());
//        }
//        System.out.println(CustomSeason.valueOf("WINTER").getSeasonDes());
        CustomSeason.WINTER.show();
        @MyAnnotation("unused")
        int i = 10;
    }
}