package com.ciin.soft;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BeanUtils {

    public static <Key, Bean> Map<Key, Bean> convertToMap(Collection<Bean> list, Function<Bean, Key> mapping) {
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        return list.stream().collect(Collectors.toMap(mapping, v -> v));
    }


}
