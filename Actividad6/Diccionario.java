/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad6;

public class Diccionario<K, V> {

    private static final int DEFAULT_CAPACITY = 10;
    private Entry<K, V>[] buckets;
    private int size;

    // Clase interna para representar las entradas del diccionario
    static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Constructor
    public Diccionario() {
        this(DEFAULT_CAPACITY);
    }

    public Diccionario(int capacity) {
        buckets = new Entry[capacity];
        size = 0;
    }

    // Método hash para obtener el índice del bucket
    private int hash(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    // Método para añadir una entrada al diccionario
    public void add(K key, V value) {
        int index = hash(key);
        Entry<K, V> entry = buckets[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
        size++;
    }

    // Método para obtener el valor asociado a una clave
    public V get(K key) {
        int index = hash(key);
        Entry<K, V> entry = buckets[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return null;
    }

    // Método para verificar si una clave está presente en el diccionario
    public boolean containsKey(K key) {
        int index = hash(key);
        Entry<K, V> entry = buckets[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                return true;
            }
            entry = entry.next;
        }
        return false;
    }

    // Método para actualizar el valor asociado a una clave
    public void setValue(K key, V value) {
        int index = hash(key);
        Entry<K, V> entry = buckets[index];
        while (entry != null) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }
    }

    // Método para verificar si el diccionario está vacío
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para obtener el tamaño del diccionario
    public int size() {
        return size;
    }
}
