package com.company.model;

import com.company.configs.LivenessConfig;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@ToString(callSuper = true)
public abstract class Flora extends NatureObject {

    public Flora(LivenessConfig livenessConfig) {
        super(livenessConfig);
    }
}
