package diedaiqi;



public class nameRepository implements Container {
    public String[] names = {"jiang jiang", "bei bei", "mao mao qiu"};

    @Override
    public Iterator getIterator() {
        return new StringArrayIterator(names);
    }
}
