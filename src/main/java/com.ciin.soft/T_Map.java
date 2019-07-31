package com.ciin.soft;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class T_Map<K, V> extends HashMap<K, V> {

    private Map<K, V> map;

    public T_Map() {
        this.map = this;
    }

    public T_Map(Map<K, V> map) {
        this.map = map;
    }

    public String getString(K key) {
        return getString(key, null);
    }

    public String getString(K key, String defValue) {
        V v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        return v.toString();
    }

    public Integer getInteger(K key) {
        return getInteger(key, null);
    }

    public Integer getInteger(K key, Integer defValue) {
        V v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Integer.parseInt(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Double getDouble(K key) {
        return getDouble(key, null);
    }

    public Double getDouble(K key, Double defValue) {
        V v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Double.parseDouble(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public Float getFloat(K key) {
        return getFloat(key, null);
    }

    public Float getFloat(K key, Float defValue) {
        V v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Float.parseFloat(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean getBool(K key) {
        return getBool(key, false);
    }

    public Boolean getBool(K key, Boolean defValue) {
        V v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Boolean.parseBoolean(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Set<K> keySet() {
        return this.map.keySet();
    }

    @Override
    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return this.map.containsValue(value);
    }

    @Override
    public V get(Object key) {
        return this.map.get(key);
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        return this.map.getOrDefault(key, defaultValue);
    }


    @Override
    public V put(K key, V value) {
        return this.map.put(key, value);
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        this.map.putAll(m);
    }

    @Override
    public V putIfAbsent(K key, V value) {
        return this.map.putIfAbsent(key, value);
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override
    public Collection<V> values() {
        return this.map.values();
    }

    @Override
    public V remove(Object key) {
        return this.map.remove(key);
    }

    @Override
    public boolean remove(Object key, Object value) {
        return this.map.remove(key, value);
    }

    @Override
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override
    public int size() {
        return this.map.size();
    }

    @Override
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return this.map.equals(o);
    }

    @Override
    public boolean replace(K key, V oldValue, V newValue) {
        return this.map.replace(key, oldValue, newValue);
    }

    @Override
    public V replace(K key, V value) {
        return this.map.replace(key, value);
    }

    @Override
    public void replaceAll(BiFunction<? super K, ? super V, ? extends V> function) {
        this.map.replaceAll(function);
    }

    @Override
    public void forEach(BiConsumer<? super K, ? super V> action) {
        this.map.forEach(action);
    }

    @Override
    public V computeIfAbsent(K key, Function<? super K, ? extends V> mappingFunction) {
        return this.map.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public V computeIfPresent(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return this.map.computeIfPresent(key, remappingFunction);
    }

    @Override
    public V compute(K key, BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return this.map.compute(key, remappingFunction);
    }

    @Override
    public V merge(K key, V value, BiFunction<? super V, ? super V, ? extends V> remappingFunction) {
        return this.map.merge(key, value, remappingFunction);
    }

    @Override
    public String toString() {
        return this.map.toString();
    }
}
