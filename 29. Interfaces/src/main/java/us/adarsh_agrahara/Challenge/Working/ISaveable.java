package us.adarsh_agrahara.Challenge.Working;

import java.util.List;

public interface ISaveable {
      List<String> write();
      
      void read(List<String> list);
}
