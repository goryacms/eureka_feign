package com.example.feign4.dto.event;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Optional;

public enum Decision {
    APPROVE(4, 1002),
    REJECT(5, 1003);

    private final int targetEdoStatus;
    private final int type;

    Decision(int targetEdoStatus, int type) {
        this.targetEdoStatus = targetEdoStatus;
        this.type = type;
    }

    /**
     * Find decision by name ignore case
     * else Empty
     *
     * @param decision decision string representation
     * @return {@link Optional} with {@link Decision}
     */
    public static Optional<Decision> findByName(String decision) {
        return Arrays.stream(Decision.values())
                .filter(it -> StringUtils.equalsIgnoreCase(it.name(), decision))
                .findFirst();
    }

    public int getStatus() {
        return targetEdoStatus;
    }

    public int getType() {
        return type;
    }
}
