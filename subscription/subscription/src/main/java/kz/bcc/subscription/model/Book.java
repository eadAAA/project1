package kz.bcc.subscription.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private List<User> subscribers;
    private Long id;
    private String title;
    private String description;
    private List<String> authors;
    private Double rating;

    public void addSubscriber(User s) {
        if (subscribers == null) {
            subscribers = new ArrayList<>();
        }
        subscribers.add(s);
    }

    public void removeSubscriber(User s) {
        subscribers.remove(s);
    }

    public void notifySubscribers() {
        for (User s : subscribers) {
            s.update(this);
        }
    }

}
