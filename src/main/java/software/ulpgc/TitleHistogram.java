package software.ulpgc;

import java.util.List;
import java.util.Map;

public interface TitleHistogram {
    Map<String, Integer> calculate(List<Title> titleList);
}
