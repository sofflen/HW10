//Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
package Tasks;

import java.util.Collection;
import java.util.HashSet;

public class Collections {

    public Collection noDups(Collection c) {
        @SuppressWarnings("unchecked") Collection set = new HashSet<>(c);
        c = set;
        return c;
    }
}
