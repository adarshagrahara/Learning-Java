package us.adarsh_agrahara.Challenge;

import us.adarsh_agrahara.Challenge.ListItem;


public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
