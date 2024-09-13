class RandomizedSet {

    private Map<Integer, Integer> map;
    private List<Integer> list;
    private Random random = new Random();

    public RandomizedSet() {
        map = new HashMap<Integer, Integer>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }

        int index = map.get(val);

        if (index < list.size() -1) {
            int last = list.get(list.size() - 1);
            list.set(index, last);
            map.put(last, index);
        }
        map.remove(val);
        list.remove(list.size() - 1);
        return true;
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */