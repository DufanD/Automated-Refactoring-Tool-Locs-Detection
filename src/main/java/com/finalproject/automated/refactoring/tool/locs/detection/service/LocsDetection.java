package com.finalproject.automated.refactoring.tool.locs.detection.service;

import lombok.NonNull;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 19 August 2019
 */

public interface LocsDetection {

    Long llocDetection(@NonNull String body);
}
