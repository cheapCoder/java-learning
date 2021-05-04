import javax.sound.midi.Soundbank;
import java.util.Optional;

public class UseOptional {
    public static void main(String[] args) {
//        Optional<String> optional = Optional.empty();
//        if(optional.isPresent()) {
//            System.out.println("ispresent");
//        }
//        System.out.println(optional.get());

        Optional<String> optional = Optional.ofNullable(null);

        System.out.println(optional.orElse("what"));
    }
}
