class MyHashMap {
//     int size=(int)Math.pow(10,6)+1;
//     int arr[];
//     public MyHashMap() {
//         arr=new int[size];
//         Arrays.fill(arr,-1);
//     }
    
//     public void put(int key, int value) {
//         arr[key]=value;
//     }
    
//     public int get(int key) {
//         if(arr[key]!=-1)
//         return arr[key];
//         return -1;
//     }
    
//     public void remove(int key) {
//         arr[key]=-1;
//     }
    int[] values = new int[1000001];
    
        public MyHashMap() {
        }

        public void put(int key, int value) {
            values[key] = value + 1;
        }

        public int get(int key) {
            return values[key] - 1;
        }

        public void remove(int key) {
            values[key] = 0;
        }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */