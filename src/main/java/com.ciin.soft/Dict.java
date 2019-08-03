package com.ciin.soft;

import com.ciin.soft.utils.BeanUtils;
import com.ciin.soft.utils.JSONUtils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Dict implements Map<String, Object> {

    private Map<String, Object> map;

    public Dict() {
        this.map = new HashMap<>();
    }

    public static Dict create() {
        return new Dict();
    }

    public Dict(String json) {
        this.map = JSONUtils.toBean(json, Dict.class);
    }

    public Dict(Object bean) {
        this.map = BeanUtils.beanToMap(bean);
    }

    public Dict(Map<String, Object> map) {
        this.map = map;
    }

    public String getString(String key) {
        return getString(key, null);
    }

    public <T> T toBean(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public <T> T toBean(T bean) {
//        return BeanUtils.ma;
        return null;
    }

    public String toJson() {
        return JSONUtils.toJson(this.map);
    }

    public String getString(String key, String defValue) {
        Object v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        return v.toString();
    }

    public Integer getInteger(String key) {
        return getInteger(key, null);
    }

    public Integer getInteger(String key, Integer defValue) {
        Object v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Integer.parseInt(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defValue;
    }

    public Double getDouble(String key) {
        return getDouble(key, null);
    }

    public Double getDouble(String key, Double defValue) {
        Object v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Double.parseDouble(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defValue;
    }


    public Float getFloat(String key) {
        return getFloat(key, null);
    }

    public Float getFloat(String key, Float defValue) {
        Object v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Float.parseFloat(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defValue;
    }

    public Boolean getBool(String key) {
        return getBool(key, false);
    }

    public Boolean getBool(String key, Boolean defValue) {
        Object v = this.map.get(key);
        if (v == null) {
            return defValue;
        }
        try {
            return Boolean.parseBoolean(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return defValue;
    }

    public BigDecimal getBigDecimal(String key) {
        return getBigDecimal(key, null);
    }


    public BigDecimal getBigDecimal(String key, BigDecimal decimal) {
        Object v = this.map.get(key);
        if (v == null) {
            return decimal;
        }
        try {
            return new BigDecimal(v.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decimal;
    }


    @Override
    public Set<String> keySet() {
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
    public Object get(Object key) {
        return this.map.get(key);
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return this.map.getOrDefault(key, defaultValue);
    }

    @Override
    public Object put(String key, Object value) {
        return this.map.put(key, value);
    }

    public Object putIgnoreNull(String key, Object value) {
        if (value != null) {
            return this.put(key, value);
        }
        return null;
    }

    @Override
    public void putAll(Map<? extends String, ?> m) {
        this.map.putAll(m);
    }

    @Override
    public Object putIfAbsent(String key, Object value) {
        return this.map.putIfAbsent(key, value);
    }

    @Override
    public void clear() {
        this.map.clear();
    }

    @Override
    public Set<Entry<String, Object>> entrySet() {
        return this.map.entrySet();
    }

    @Override
    public Collection<Object> values() {
        return this.map.values();
    }

    @Override
    public Object remove(Object key) {
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
    public boolean replace(String key, Object oldValue, Object newValue) {
        return this.map.replace(key, oldValue, newValue);
    }

    @Override
    public Object replace(String key, Object value) {
        return this.map.replace(key, value);
    }

    @Override
    public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> function) {
        this.map.replaceAll(function);
    }

    @Override
    public void forEach(BiConsumer<? super String, ? super Object> action) {
        this.map.forEach(action);
    }


    @Override
    public Object computeIfAbsent(String key, Function<? super String, ?> mappingFunction) {
        return this.map.computeIfAbsent(key, mappingFunction);
    }

    @Override
    public Object computeIfPresent(String key, BiFunction<? super String, ? super Object, ?> remappingFunction) {
        return this.map.computeIfPresent(key, remappingFunction);
    }

    @Override
    public Object compute(String key, BiFunction<? super String, ? super Object, ?> remappingFunction) {
        return this.map.compute(key, remappingFunction);
    }

    @Override
    public Object merge(String key, Object value, BiFunction<? super Object, ? super Object, ?> remappingFunction) {
        return this.map.merge(key, value, remappingFunction);
    }

    @Override
    public java.lang.String toString() {
        return this.map.toString();
    }
}
