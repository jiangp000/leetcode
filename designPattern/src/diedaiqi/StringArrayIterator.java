package diedaiqi;

public class StringArrayIterator implements  Iterator {
    int index = 0;
    String[] args;

    public StringArrayIterator(String[] args) {
        this.args = args;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object Next() {
        return null;
    }

//    @Override
//    public boolean hasNext() {
//        if (index < args.length) {
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Object Next() {
//        if (hasNext()) {
//            return args[index++];
//        }
//        return null;
//    }
}