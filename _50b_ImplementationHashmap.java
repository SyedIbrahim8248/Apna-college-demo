package JAVAandDSAKHAPRA;
import java.util.*;
/*
public class _50b_ImplementationHashmap {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4;i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLl(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i) key == key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];
            for (int i = 0; i < N * 2; i++) {
                buckets[i] new LinkedList<>();
            }
            for (int i = 0; i,oldBucket.length;
            i++){
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
    }

    public void put(K key, V value) {
        int bi = hashFunctions(key);
        int di = searchInLL(key, bi);
        if (di == -1) { // keys does'nt exist
            buckets[bi].add(new Node(key, value));
            n++;

        } else { //key exists
            Node node = buckets[bi].get(di);
            node.value = value;
        }
        double lambda = (double) n / N;
        if (lambda > 2.0) {
            rehash();
        }
    }

    public boolean containsKey(K key) {
        return false;
    }

    public V remove(K key) {
        return null;
    }

    public V get(K key) {
        return null;
    }

    public ArrayList<K> keySet() {
        return null;
    }

    public boolean isEmpty() {
        return false;
    }
}

public static void main(String[] args) {
    HashMap<String.Integer>map = new Hashmap<>();
    map.put("India",190);
    map.put("China",200);
    map.put("US",50);
}

    }
}

*/