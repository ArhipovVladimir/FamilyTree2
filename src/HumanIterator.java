import java.util.Iterator;
import java.util.List;

    public class HumanIterator implements Iterator<Human> {
        private int index;
        private List<Human> Human;


        @Override
        public boolean hasNext() {
            return index < Human.size();
        }

        @Override
        public Human next() {
            return Human.get(index++);
        }
    }


